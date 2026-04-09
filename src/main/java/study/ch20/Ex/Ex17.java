package study.ch20.Ex;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.List;

@Data
@AllArgsConstructor
class Student {
    private int id;
    private String name;
    private int score;
}

interface StudentManager {
    void addStudent(int id, String name, int score);
    Student findById(int id);
    List<Student> findByMinScore(int min);
    double getAverage();
    void printAll();
}

class StudentManagerImpl implements StudentManager {
    private Map<Integer, Student> studentMap;

    public StudentManagerImpl () {
        studentMap = new HashMap<>();
    }

    @Override
    public void addStudent(int id, String name, int score) {
        studentMap.put(id, new Student(id, name, score));
    }

    @Override
    public Student findById(int id) {
        return studentMap.get(id);
    }

    @Override
    public List<Student> findByMinScore(int min) {
        return studentMap.values().stream()
                .filter(student -> student.getScore()>=min)
                .toList();
    }

    //stream => 반복하는 데이터 꺼내기. 한번 꺼내면 끝.

    @Override
    public double getAverage() {
//        double avg = 0;
//        for (Student student : studentMap.values()) {
//            avg += student.getScore();
//        }
//        return avg / studentMap.size();
        return studentMap.values().stream()
                .map(student -> (double) student.getScore())
                .reduce(0.0, Double::sum) / studentMap.size();
    }

    @Override
    public void printAll() {
        studentMap.values().forEach(System.out::println); //프린트인이 반복출력
        }

}

public class Ex17 {
    static void main() {
        StudentManager studentManager = new StudentManagerImpl();

        studentManager.addStudent(20260001, "노푸른", 80);
        studentManager.addStudent(20260002, "노푸영", 75);
        studentManager.addStudent(20260003, "노푸니", 70);
        studentManager.addStudent(20260004, "노푸정", 65);

        Student foundStudent = studentManager.findById(20260003);
        System.out.println(foundStudent);

        System.out.println(studentManager.findByMinScore(70));

        System.out.println(studentManager.getAverage());

        studentManager.printAll();
    }
}
