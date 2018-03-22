package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> result = new HashMap<>();
        for(String item : collection1){
            if(result.get(item)==null){
                result.put(item,1);
            }else {
                result.put(item,result.get(item)+1);
            }
        }
        return result;
    }
}
