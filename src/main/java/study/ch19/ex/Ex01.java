package study.ch19.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    static void main() {
        List<Integer> scores = new ArrayList<>(List.of(85, 92, 78, 96, 88));
        System.out.println(scores);

        int total = 0;
        double avg = 0;
        int max = scores.get(0);
        for (Integer score : scores) {
            total += score;
            if (score > max) max = score;
        }
        avg = (double) total / scores.size();
        System.out.println("평균: " + avg);
        System.out.println("최고 점수: " + max);
    }
}
