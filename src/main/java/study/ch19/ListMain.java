package study.ch19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    static void main() {
        ArrayList<Integer> numList = new ArrayList<>();

        //값 추가
        numList.add(100);

        // 해당 인덱스 위치에 값 추가
        numList.add(0, 200);

        Integer n1 = numList.get(1);
        System.out.println(n1);

        //여러 값 한번에 추가
        ArrayList<Integer> numList2 = new ArrayList<>();
        numList2.add(1000);
        numList2.add(2000);
        numList2.add(3000);

        numList.addAll(numList2);
        System.out.println(numList);
        numList.addAll(1, numList2);
        System.out.println(numList);

        boolean hasFound = numList.contains(2000);
        System.out.println(hasFound);

        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }

        for(Integer num : numList) {
            System.out.println(num);
        }

        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");
        System.out.println(strList);
        //ArrayList는 순서대로 붙어있음. 일반적으론 이쪽이 더 빨리 처리돼서 이쪽을 쓰는 것이 더 유리함.

        List<String> strList2 = new LinkedList<>();
        strList2.add("a");
        strList2.add("b");
        strList2.add("c");
        strList2.add("d");
        System.out.println(strList2);
        //LinkedList는 서로 떨어져있지만 주소를 알고 있어서 주소를 찾아가는 행위를 함. 공간에 대한 제약이 없는 장점이 있음.
        // 메모리 효율적 관리에 도움이 됨.

        List<String> imStrList = List.of("a", "b", "c", "d"); //List of로 만든 리스트는 추가 수정을 할 수 없음.
        //imStrList.add("e"); 불변 리스트여서 수정할 수 없음.
        System.out.println(imStrList);
        List<String> nonImStrList = new ArrayList<>();
        nonImStrList.addAll(imStrList);
        nonImStrList.add("e");
        System.out.println(nonImStrList);
        List<String> nonImStrList2 = new ArrayList<>(List.of("a", "b", "c"));
        System.out.println(nonImStrList2);
    }
}
