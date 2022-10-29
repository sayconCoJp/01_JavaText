package chap08;

public class Example03 {

    static void count(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        count(5);
        System.out.println();
        count(10);
    }
}