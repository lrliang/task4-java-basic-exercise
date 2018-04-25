package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    private int FullThreeMinusOne(int count) {
        int result = count;
        if (count >= 3) { result = count - count / 3; }
        return result;
    }

    private Map<String, Integer> mapListToObject(List<String> collection) {
      Map<String, Integer> result = new HashMap<>();
      for (String charItemStr : collection) {
        CharItemObj charItemObj = CharItemObj.createChByStr(charItemStr);
        String ch = charItemObj.getCh();
        Integer count = charItemObj.getCount();
        result.put(ch, result.get(ch) == null ? count : result.get(ch) + count);
      }
      return result;
    }

    Map<String, Integer> createUpdatedCollection(List<String> collectionA, Map<String, List<String>> object) {
        Map<String, Integer> result = new HashMap<>();
        Map<String, Integer> collectionObject = mapListToObject(collectionA);
        List<String> arr = object.get("value");
        for (Map.Entry<String, Integer> entry : collectionObject.entrySet()) {
            String ch = entry.getKey();
            int count = entry.getValue();
            if (!arr.contains(ch)) { result.put(ch, count); }
            else { result.put(ch, FullThreeMinusOne(count)); }
        }

        return result;
    }
}
