package jp.co.systena.tigerscave.fighting.model;

import javax.validation.constraints.NotNull;

/**
 * The Class fightersForm.
 */
public class fightersForm {

  /** お仕事ID */
  private int id;

  /** 名前 */
  @NotNull //設定できる最小値を定義
  private String name;

  /** 仕事 */
  @NotNull //設定できる最小値を定義
  private String job;

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

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

}
