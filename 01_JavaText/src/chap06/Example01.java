package chap06;

public class Example01 {

    public static void main(String[] args) {
        int[] ages;
        ages = new int[3];

        ages[0] = 10;
        ages[1] = 20;
        ages[2] = 51;

        for (int i = 0; i < 3; i++) {
            System.out.println(ages[i]);
        }
    }
}