package study.ch19.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex04 {
    static void main() {
        List<Integer> listA = List.of(5, 2, 8);
        List<Integer> listB = List.of(3, 9, 1);
        List<Integer> result = new ArrayList<>();
        result.addAll(listA);
        result.addAll(listB);
        System.out.println(result);
        Collections.sort(result); //순서대로 정리하는 명령어
        System.out.println(result);
    }
}
