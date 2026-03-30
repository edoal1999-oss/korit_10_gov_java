package study.ch7;

public class Main5 {
    static void main() {
        for (int i = 0; i < 10; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("i:" + i);
        }

        int j = 0;
        while (j < 10) {
            int jj = j++;
            if (jj % 2 != 0){
                continue;
            } System.out.println("j:" + jj);
        }

    }

}
