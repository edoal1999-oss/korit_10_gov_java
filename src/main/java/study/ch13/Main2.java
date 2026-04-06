package study.ch13;

abstract class AbstractAnimal {
    private String name;
    public AbstractAnimal () {}
    public AbstractAnimal(String name){this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();

}

class Duck extends AbstractAnimal implements Flyable, Swimmable {
    public Duck () {
        super();
    }

    public Duck(String name) {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}

//implements는 다중 구현이 가능함(부모는 여럿이 될 수 없지만, 기능은 여럿 될 수 있는 것과 비슷한 원리/상속이 아님!!)

public class Main2 {
    static void main() {
        Duck duck = new Duck();
        AbstractAnimal animal = new Duck();
        Flyable flyable = new Duck();
        Swimmable swimmable = new Duck();

        duck.fly();
        duck.swim();
        duck.setName("우리집오리");
        System.out.println(duck.getName());

        animal.setName("옆집오리");
        System.out.println(duck.getName());

        flyable.fly();

        swimmable.swim();
    }

}
