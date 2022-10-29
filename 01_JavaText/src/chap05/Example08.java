package chap05;

import java.util.Scanner;

public class Example08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 0, sum = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("整数値を入力してください｡");
            n = scanner.nextInt();
            if (n < 0) {
                continue;
            }
            sum += n;
            System.out.println(n + "が入力されました｡");
            System.out.println("これまでの合計:" + sum);
        }
    }
}
