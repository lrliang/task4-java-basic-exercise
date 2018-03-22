package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    public int FullThreeMinusOne(int count){
        int result = count;
        if(count>=3){ result = count-count/3; }
        return result;
    }

    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> result = collectionA;
        List<String> arr = object.get("value");
        for (Map.Entry<String, Integer> entry : collectionA.entrySet()) {
            String ch = entry.getKey();
            int count = entry.getValue();
            if(arr.contains(ch)){
                result.put(ch,FullThreeMinusOne(count));            }
        }
        return result;
    }
}
