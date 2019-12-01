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
  Map<Integer, Fighters> fightersMap = new LinkedHashMap<Integer, Fighters>();

  public Map<Integer, Fighters> getPartyListMap(){
    return fightersMap;
  }

  public void addPartyListMap(int id, Fighters fighters) {
    fightersMap.put(id, fighters);
  }
}
