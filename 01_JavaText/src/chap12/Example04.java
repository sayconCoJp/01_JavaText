package chap12;

public class Example04 {

    public static void main(String[] args) {
        Integer i = new Integer(128);
        Double d = new Double("3.14"); //※ちなみに、コンストラクタに渡す値は数値でも文字列でも構いません。（オーバーロードされている）
        System.out.println(i.intValue());
        System.out.println(d.intValue());
    }
}
