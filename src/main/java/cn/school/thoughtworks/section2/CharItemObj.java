package cn.school.thoughtworks.section2;

public class CharItemObj {

  private String ch;
  private Integer count;

  static CharItemObj createChByStr(String charItemStr) {
    Integer count =
        charItemStr.length() > 1
            ? Integer.valueOf(charItemStr.substring(charItemStr.length() - 1))
            : 1;
    String ch = charItemStr.substring(0, 1);
    return new CharItemObj(ch, count);
  }

  private CharItemObj(String ch, Integer count) {
    this.ch = ch;
    this.count = count;
  }

  public String getCh() {
    return ch;
  }

  public void setCh(String ch) {
    this.ch = ch;
  }

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }
}
