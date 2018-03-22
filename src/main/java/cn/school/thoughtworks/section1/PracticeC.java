package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> result = new ArrayList<>();
        for(String item : collection1){
            for (List<String> childList : collection2.values()) {
                if(childList.contains(item)){ result.add(item); }
            }
        }
        return result;
    }
}
