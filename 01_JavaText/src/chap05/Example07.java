package chap05;

import java.util.Scanner;

public class Example07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 0, sum = 0;

        System.out.println("整数値を入力してください｡(終了するには-1を入力)");
        n = scanner.nextInt();

        while (n != -1) {
            sum += n;
            System.out.println(n + "が入力されました｡");
            System.out.println("これまでの合計:" + sum);
            System.out.println("整数値を入力してください｡(終了するには-1を入力)");
            n = scanner.nextInt();
        }
    }
}
