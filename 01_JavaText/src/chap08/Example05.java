package chap08;

public class Example05 {

    public static void main(String[] args) {
        System.out.println(isEven(71));
    }

    static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}