package study.ch21.Ex;

public class Ex02 {
    static void main() {
        String input = "abc123";
        try {
            int number = Integer.parseInt(input);
            System.out.println(input);
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닙니다. : " + input);
        }
    }
}
