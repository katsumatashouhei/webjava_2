package jp.co.systena.tigerscave.fighting.model.jobs;

public class Soldier implements Job {

  @Override
  public String attack() {
    return "剣で攻撃した。5のダメージを与えた。";
  }
}
