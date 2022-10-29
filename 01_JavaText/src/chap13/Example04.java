package chap13;

public class Example04 {

    public static void main(String[] args) {
        Comparable[] c = {new Cat(21, 63), new Human(33, 169), new Cat(29, 55), new Human(25, 175)};
        Comparable max = c[0];
        for (int i = 0; i < c.length - 1; i++) {
            if (max.compareTo(c[i + 1]) < 0) {
                max = c[i + 1];
            }
        }
        System.out.println(max);
    }
}

abstract class Animal implements Comparable {

    int age;
    int height;

    public Animal(int age, int height) {
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(Object anotherAnimal) {
        Animal a = (Animal) anotherAnimal;
        return (this.age < a.age) ? -1 : ((this.age == a.age) ? 0 : 1);
    }

    @Override
    public String toString() {
        return this.getClass() + "{ 年齢=" + age + ", 身長=" + height + '}';
    }
}

class Cat extends Animal {

    public Cat(int age, int height) {
        super(age, height);
    }

    public void speak() {
        System.out.println("mew mew mew");
    }
}

class Human extends Animal {

    public Human(int age, int height) {
        super(age, height);
    }

    public void speak() {
        System.out.println("blah blah blah");
    }
}
