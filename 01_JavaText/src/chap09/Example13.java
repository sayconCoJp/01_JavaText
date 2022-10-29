package chap09;

public class Example13 {

    static void inc(int i) {
        i++;
        System.out.println("呼び出し先のi:" + i);
    }

    public static void main(String[] args) {
        int i = 10;
        System.out.println("呼び出し元のi:" + i);
        inc(i);
        System.out.println("呼び出し元のi:" + i);
    }
}