package study.ch12;


abstract  class AA {

}

class BB extends AA {

}

class MM {
    static void main() {
        BB b = new BB(); //AA는 추상클래스라서 생성 불가능
        AA b2 = new BB();
        AA c = new AA() {
            //AA를 이어받은 게 아니라, 이름 없는 개체
        };
        AA cc = new CC();
        AA ccc = new BB() {

        };
    }

    private static class CC extends AA {
    }
}
public class Main {
    static void main() {
        Animal animal = new Dog();
        Cat cat = new Cat();

        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal() {
            @Override
            public void eat() {

            }
        };
    }
}



