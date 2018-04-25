package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> arr = object.get("value");
        for (Map.Entry<String, Integer> entry : collectionA.entrySet()) {
            String ch = entry.getKey();
            int count = entry.getValue();
            if(arr.contains(ch)){
                if(count==1){ collectionA.remove(ch); }
                else { collectionA.put(ch,count-1); }
            }
        }
        return collectionA;
    }
}
