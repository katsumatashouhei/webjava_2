package jp.co.systena.tigerscave.fighting.service;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import jp.co.systena.tigerscave.fighting.model.Fighters;

/**
 * The Class ListService.
 */
@Service
public class GameService {
  /**
   * 戦士一覧取得
   *
   * @return 戦士一覧
   */
  public Map<Integer, Fighters> getFighters(){

    Fighters fighter1 = new Fighters(10, "shohei", 100);
    Fighters fighter2 = new Fighters(20, "demon", 500);
    Fighters fighter3 = new Fighters(30, "angel", 50);

    // 戦士たちをMapに格納
    Map<Integer, Fighters> fighterMap = new LinkedHashMap<Integer, Fighters>();
    fighterMap.put(fighter1.getId(), fighter1);
    fighterMap.put(fighter2.getId(), fighter2);
    fighterMap.put(fighter3.getId(), fighter3);

    return fighterMap;
  }
}
