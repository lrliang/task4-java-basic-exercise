package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    private int FullThreeMinusOne(int count) {
        int result = count;
        if (count >= 3) { result = count - count / 3; }
        return result;
    }

    private Map<String, Integer> mapListToObject(List<String> collection) {
        Map<String, Integer> result = new HashMap<>();
        for (String item : collection) {
            if (result.get(item) == null) { result.put(item, 1); }
            else { result.put(item, result.get(item) + 1); }
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
