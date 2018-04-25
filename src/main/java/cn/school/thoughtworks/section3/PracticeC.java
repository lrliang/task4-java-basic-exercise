package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {

  private int FullThreeMinusOne(int count) {
    return count >= 3 ? count - count / 3 : count;
  }

  private Map<String, Integer> mapListToObject(List<String> collection) {
    Map<String, Integer> result = new HashMap<>();
    for (String item : collection) {
      result.merge(item, 1, (a, b) -> a + b);
    }
    return result;
  }

  Map<String, Integer> createUpdatedCollection(List<String> collectionA,
      Map<String, List<String>> object) {
    Map<String, Integer> result = new HashMap<>();
    for (Map.Entry<String, Integer> entry : mapListToObject(collectionA).entrySet()) {
      String ch = entry.getKey();
      int count = entry.getValue();
      if (!object.get("value").contains(ch)) {
        result.put(ch, count);
      } else {
        result.put(ch, FullThreeMinusOne(count));
      }
    }

    return result;
  }
}
