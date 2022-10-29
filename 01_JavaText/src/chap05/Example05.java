package chap05;

import java.util.Scanner;

public class Example05 {

    public static void main(String[] args) {

        System.out.println("何回数え上げますか?");

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int i = 0;
        while (i < count) {
            System.out.println(i);
            i++;
        }
    }
}
