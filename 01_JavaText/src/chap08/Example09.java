package chap08;

public class Example09 {

    static void count10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        count10();
        count10();
        count10();
    }
}