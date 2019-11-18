package jp.co.systena.tigerscave.fighting.model;

/**
 * The Class Fighters.
 */
public class Fighters {

  /** 戦士ID */
  private int id;

  /** 戦士名 */
  private String name;

  /** HP */
  private int hp;

  public Fighters(int id, String name, int hp) {
    this.id = id;
    this.name = name;
    this.hp = hp;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }
}
