package chap10;

class PatrolCar extends Vehicle {

    void run() {
        System.out.println("I'm driving.");
    }
}

class Locket extends Vehicle {

    void run() {
        System.out.println("I'm flying.");
    }
}

class Ship extends Vehicle {

    void run() {
        System.out.println("I'm sailing.");
    }
}

public class Example06 {

    public static void main(String[] args) {
        Vehicle[] vs = {new PatrolCar(), new Locket(), new Ship(), new PatrolCar(), new Locket()};
        for (Vehicle v : vs) {
            v.run();
        }
    }
}