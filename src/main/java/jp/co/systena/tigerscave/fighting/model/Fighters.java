package jp.co.systena.tigerscave.fighting.model;

import jp.co.systena.tigerscave.fighting.model.jobs.Job;
import jp.co.systena.tigerscave.fighting.model.jobs.Soldier;
import jp.co.systena.tigerscave.fighting.model.jobs.Wizard;

/**
 * The Class Fighters.
 */
public class Fighters {

  /** 戦士ID */
  private int id;

  /** 仕事名 */
  private String jobName;

  /** 戦士名 */
  private String name;

  /** HP */
  private int hp;

  /** 戦士ID */
  private String command;

  private Job job;

  public Fighters(int id, String jobName, String name, int hp) {
    //渡されるJobNameの引数により分岐
    switch(jobName) {
      case "戦士":
        job = new Soldier();
        break;
      case"魔術師":
        job = new Wizard();
        break;
    }
    setId(id);
    setJobName(jobName);
    setName(name);
    setHp(hp);
    setCommand("未選択");
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

  public String getJobName() {
    return jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }
}
