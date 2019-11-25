package jp.co.systena.tigerscave.fighting.controller;

import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.fighting.model.Fighters;
import jp.co.systena.tigerscave.fighting.service.GameService;


@Controller
public class FightingController {

  @Autowired
  HttpSession session;// セッション管理

  @Autowired
  GameService gameService;// サービスクラス

  /**
   * キャラクター作成画面
   *
   * @param mav the mav
   * @param listForm the list form
   * @param bindingResult the binding result
   * @return the model and view
   */
  @RequestMapping(value = "/findJob", method = RequestMethod.GET) // URLとのマッピング
  public ModelAndView findJob(ModelAndView mav) {

  //表示画面 のテンプレート名を設定
    mav.setViewName("gameView");
    return mav;
  }

  /**
   * 戦士一覧画面表示
   *
   * @param mav the mav
   * @return the model and view
   */
  @RequestMapping(value = "/battle", method = RequestMethod.GET)// URLとのマッピング
  public ModelAndView view(ModelAndView mav) {

 // 商品一覧取得
    Map<Integer, Fighters> fighters = gameService.getFighters();

    //テンプレートに渡す内容を設定
    mav.addObject("fighters", fighters);

    //view のテンプレート名を設定
    mav.setViewName("gameView");

    return mav;
  }

  /**
   * 作成した戦士を追加する
   *
   * @param mav the mav
   * @param listForm the list form
   * @param bindingResult the binding result
   * @return the model and view
   */
//  @RequestMapping(value = "/list", method = RequestMethod.POST) // URLとのマッピング
//  public ModelAndView order(ModelAndView mav, @Validated ListForm listForm,
//      BindingResult bindingResult) {
//
//    if (bindingResult.getAllErrors().size() > 0) {
//      // リクエストパラメータにエラーがある場合は商品一覧画面を表示
//
//      Map<Integer, Item> itemListMap = listService.getItemList();
//      mav.addObject("itemList", itemListMap);
//
//      // Viewのテンプレート名を設定
//      mav.setViewName("ListView");
//
//      return mav;
//
//    }
//
//    // 注文内容をカートに追加
//    Cart cart = getCart();
//    cart.addOrder(listForm.getItemId(), listForm.getNum());
//
//    // データをセッションへ保存
//    session.setAttribute("cart", cart);
//
//    return new ModelAndView("redirect:/cart"); // リダイレクト
//  }

}
