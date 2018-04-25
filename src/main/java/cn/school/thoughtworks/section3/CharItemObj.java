package cn.school.thoughtworks.section3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharItemObj {

  private String ch;
  private Integer count;

  public static CharItemObj createChByStr(String charItemStr) {
    Integer count = 1;
    Pattern pattern = Pattern.compile("\\d+");
    Matcher matcher = pattern.matcher(charItemStr);
    while (matcher.find()) { count =  Integer.valueOf(matcher.group(0)); }

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
