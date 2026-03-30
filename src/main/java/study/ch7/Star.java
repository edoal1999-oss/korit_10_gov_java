package study.ch7;

public class Star {
    static void main() {
        int count = 7;
        /**
         * *
         * **
         * ***
         * ****
         * *****
         */
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = 0; k < count; k++) {
            for (int m = 0; m < count - k; m++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < count - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1 - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
