package chap10;

public class Example04 {

    public static void main(String[] args) {
        Vehicle v = new Airplane();
        Airplane a = (Airplane) v;
        a.fly();
    }
}