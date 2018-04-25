package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {

  List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
    List<String> flatCollection2 = collection2.stream()
        .flatMap(Collection::stream)
        .collect(Collectors.toList());
    return collection1.stream().filter(flatCollection2::contains).collect(Collectors.toList());
  }
}
