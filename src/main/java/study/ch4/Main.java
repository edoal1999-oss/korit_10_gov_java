package study.ch4;

public class Main {
    static void main() {
        String name1 = "노푸른";
        String name2 = "노푸른";
        String name3 = new String("노푸른");
        boolean result1 = name1 == name2;
        boolean result2 = name1.equals(name3);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(result1);
        System.out.println(result2);
    }
}
