package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> result = new ArrayList<>();
        for(String item : collection1){
            for (List<String> childList : collection2){
                if(childList.contains(item)){result.add(item);}
            }
        }
        return result;
    }
}
