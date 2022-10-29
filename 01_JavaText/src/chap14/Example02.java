package chap14;

public class Example02 {

    public static void main(String[] args) {
        try {
            System.out.println(Integer.parseInt("2byte"));
            System.out.println("例外発生の有無にかかわらず実行したい処理です");
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println("このプログラムを終了します");
    }
}
