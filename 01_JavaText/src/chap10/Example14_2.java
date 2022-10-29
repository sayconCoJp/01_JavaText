package chap10;

import java.util.Scanner;

public class Example14_2 {

    public static void main(String[] args) {
        DelegatePc pc1 = new DelegatePc();
        pc1.input();
    }
}

class DelegatePc {

    Scanner scanner = new Scanner(System.in);

    void input() {
        System.out.print("入力してください > ");
        String input_text = scanner.nextLine();
        System.out.println(input_text + "が入力されました");
    }
}
