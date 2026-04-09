package study.ch19.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex05 {
    static void main() {
        List<String> fruits = new ArrayList<>(List.of("사과", "바나나", "포도", "딸기"));
        int foundIndex = fruits.indexOf("포도");
        fruits.set(foundIndex, "망고"); // set = 바꾸는 명령어
        fruits.add(0, "체리");
        fruits.remove("딸기");
        System.out.println(fruits);
    }
}
