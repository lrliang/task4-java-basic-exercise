package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> result = collectionA;
        List<String> arr = object.get("value");
        for (Map.Entry<String, Integer> entry : collectionA.entrySet()) {
            String ch = entry.getKey();
            int count = entry.getValue();
            if(arr.contains(ch)){
                if(count==1){ result.remove(ch); }
                else { result.put(ch,count-1); }
            }
        }
        return result;
    }
}
