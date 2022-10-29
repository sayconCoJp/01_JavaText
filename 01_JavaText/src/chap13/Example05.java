package chap13;

public class Example05 {

    static void show(CharSequence cs) {
        System.out.println(cs);
    }

    public static void main(String[] args) {

        String str = "Hello World.";
        StringBuilder strb = new StringBuilder("Goodby World.");

        show(str);
        show(strb);
    }
}
