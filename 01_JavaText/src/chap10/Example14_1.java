package chap10;

import java.util.Scanner;

public class Example14_1 {

    public static void main(String[] args) {
        DependencePc pc1 = new DependencePc();
        pc1.input();
    }
}

class DependencePc {

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("入力してください > ");
        String input_text = scanner.nextLine();
        System.out.println(input_text + "が入力されました");
    }
}
