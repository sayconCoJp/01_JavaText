package chap10;

class Surfing extends Vehicle {

    @Override
    void run() {
        System.out.println("I'm surfing.");
    }
}

public class Example09 {

    public static void main(String[] args) {
        Vehicle[] vs = {new PatrolCar(), new Locket(), new Ship(), new Surfing()};
        for (Vehicle v : vs) {
            v.run();
        }
    }
}
