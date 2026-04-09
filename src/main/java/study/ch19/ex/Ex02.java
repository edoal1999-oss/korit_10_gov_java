package study.ch19.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    static void main() {
       List<String> subjects = new ArrayList<>(List.of("Java", "Python", "Java", "C++", "Python", "Go"));
       List<String> results = new ArrayList<>();
       for (int i = 0; i < subjects.size(); i++) {
           String subject = subjects.get(i);
           if(!results.contains(subject)) {
               results.add(subject);
           }
       }
        System.out.println(results);
    }

}
