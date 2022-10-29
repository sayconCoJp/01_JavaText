package chap05;

import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 0, sum = 0;

        do {
            System.out.println("整数値を入力してください｡(終了するには-1を入力)");
            n = scanner.nextInt();
            if (n == -1) {
                break;
            }
            System.out.println(n + "が入力されました｡");
            sum += n;
            System.out.println("これまでの合計:" + sum);
        } while (true);
    }
}