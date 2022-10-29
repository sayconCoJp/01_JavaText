package chap06;

public class Example07 {

    public static void main(String[] args) {
        int[] ages = {10, 20, 51};
        for (int age : ages) {
            System.out.println(age);
            age *= 2;
        }
        for (int age : ages) {
            System.out.println(age);
        }
    }
}