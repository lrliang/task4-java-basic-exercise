package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {

    private void addItems(Map<String, Integer> map,String str){
        String ch = str.substring(0, 1);
        Integer count = 1;
        if(str.length()>1){
            count = Integer.valueOf(str.substring(str.length()-1));
        }
        if(map.get(ch)==null){
            map.put(ch,count);
        }else {
            map.put(ch,map.get(ch)+count);
        }
    }

    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> result = new HashMap<>();
        for(String item : collection1){
            addItems(result,item);
        }
        return result;
    }
}
