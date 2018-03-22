package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeC {
    public void addItems(Map<String, Integer> map,String str){
        String ch = getCh(str);
        Integer count = 1;
        if(str.length()>1){
            count = getCount(str);
        }
        if(map.get(ch)==null){
            map.put(ch,count);
        }else {
            map.put(ch,map.get(ch)+count);
        }
    }

    public int getCount(String str){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            return Integer.valueOf(matcher.group(0));
        }
        return 0;
    }

    public String getCh(String str){
        return str.substring(0, 1);
    }

    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> result = new HashMap<>();
        for(String item : collection1){
            addItems(result,item);
        }
        return result;
    }
}
