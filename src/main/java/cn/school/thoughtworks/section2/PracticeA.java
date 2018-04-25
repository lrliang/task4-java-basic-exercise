package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {

  Map<String, Integer> countSameElements(List<String> collection1) {
    Map<String, Integer> result = new HashMap<>();
    collection1.forEach(
        item -> result.put(item, result.get(item) == null ? 1 : result.get(item) + 1)
    );
    return result;
  }
}
