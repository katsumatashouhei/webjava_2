package jp.co.systena.tigerscave.fighting.model;

import javax.validation.constraints.NotNull;

/**
 * The Class fightersForm.
 */
public class fightersForm {

  /** お仕事ID */
  private int id;

  /** 個数 */
  @NotNull //設定できる最小値を定義
  private String name;

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

}
