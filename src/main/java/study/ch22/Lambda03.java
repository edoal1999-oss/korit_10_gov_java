package study.ch22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda03 {
    public static String search(List<String> list, Predicate<String> p) {
        for (String s : list) {
            if (s.contains("노")) return s;
        }
        return null;
    }

    public static void applicationMain(Runnable runnable) {
        System.out.println("프로그램 시작");
        runnable.run();
        System.out.println("프로그램 종료");
    }

    public static List<Integer> createNumListOfRange(int multNum, Function<Integer, List<Integer>> f) {
        return f.apply(multNum);
    }

    static void main() {
        List<String> names = List.of("김푸른", "노푸니", "정푸영");
        String foundName = search(names, name -> name.startsWith("노"));
        System.out.println(foundName);

        applicationMain(() -> {
            List<Integer> numList = createNumListOfRange(10, (multNum) -> {
                int start = 10;
                int end = 20;
                List<Integer> nums = new ArrayList<>();
                for (int i = start; i < end + 1; i++) {
                    nums.add(i * multNum);
                }
                return nums;
            });
            System.out.println(numList);
        });
        System.out.println("프로그램 완전 종료");
    }
}

//람다는 기존의 코드 안 건드리면서, 내가 원할 때 로직을 바꾸기 위해서 사용한다.


