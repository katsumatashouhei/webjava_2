package jp.co.systena.tigerscave.fighting.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jp.co.systena.tigerscave.fighting.model.fightersForm;
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
   * 戦闘コマンド画面
   *
   * @param mav the mav
   * @return the model and view
   */
  @RequestMapping(value = "/findJob", method = RequestMethod.POST)// URLとのマッピング
  public ModelAndView view(HttpSession session, ModelAndView mav, @Valid fightersForm fightersForm) {

 // 商品一覧取得
    //Map<Integer, Fighters> fighters = gameService.getFighters();

    //テンプレートに渡す内容を設定
    //mav.addObject("fighters", fighters);

    //view のテンプレート名を設定
    mav.setViewName("gameView");

    return mav;
  }
}
