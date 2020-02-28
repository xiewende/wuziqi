package keHuDuan;

import javax.swing.*;
import java.awt.geom.FlatteningPathIterator;

/**
 * @author fantomboss
 * @date 2018/12/30-8:21
 */
public class CUser {
  String nullPepole = "src\\res\\res\\img\\noone.gif";
  private Icon head = new ImageIcon(nullPepole);
  private String name = "";
  private long ID = -1;
  private Boolean ready = false;
  private Boolean enable = false;

  public CUser() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getID() {
    return ID;
  }

  public void setID(long ID) {
    this.ID = ID;
  }

  public Icon getHead() {
    return head;
  }

  public void setHead(Icon head) {
    this.head = head;
  }

  public Boolean getReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }

  public Boolean getEnable() {
    return enable;
  }

  public void setEnable(Boolean enable) {
    this.enable = enable;
  }

  public CUser(Icon head, String name){
    this.head = head;
    this.name = name;
  }

  @Override
  public String toString() {
    return "CUser{" +
            "head=" + head +
            ", name='" + name + '\'' +
            ", ID=" + ID +
            '}';
  }
}
