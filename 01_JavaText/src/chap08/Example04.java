package chap08;

public class Example04 {

    public static void main(String[] args) {
        double area = getAreaOfSquere(3.8);
        System.out.println(area);
    }

    static double getAreaOfSquere(double length) {
        return length * length;
    }
}