package study.ch08;

public class OBJ04 {
    static void main() {
        class Addition {
            void add(int a) {}
            void add(double a) {}
            void add(int a, double b) {}
            void add(double a, int b) {}
            int add(int a, int b, int c) {return a+b+c;}
        }
        Addition aa = new Addition();
        aa.add(10);
    }
}
