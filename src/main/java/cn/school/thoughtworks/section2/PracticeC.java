package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeC {
  Map<String, Integer> countSameElements(List<String> collection1) {
    Map<String, Integer> result = new HashMap<>();
    for (String charItemStr : collection1) {
      CharItemObj charItemObj = CharItemObj.createChByStr(charItemStr);
      String ch = charItemObj.getCh();
      Integer count = charItemObj.getCount();
      result.put(ch, result.get(ch) == null ? count : result.get(ch) + count);
    }
    return result;
  }
}
