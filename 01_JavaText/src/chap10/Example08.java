package chap10;

class CampingCar {

    void run() {
        System.out.println("I'm driving.");
    }
}

class PropellerPlane {

    void run() {
        System.out.println("I'm flying.");
    }
}

public class Example08 {

    public static void main(String[] args) {
        Object[] vs = {new CampingCar(), new PropellerPlane(), new String()};
        for (Object v : vs) {
            if (v instanceof CampingCar) {
                CampingCar c = (CampingCar) v;
                c.run();
            } else if (v instanceof PropellerPlane) {
                PropellerPlane p = (PropellerPlane) v;
                p.run();
            } else {
                System.out.println("想定していないクラスです");
            }
        }
    }
}
