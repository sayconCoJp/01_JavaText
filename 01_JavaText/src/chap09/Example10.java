package chap09;

public class Example10 {

    public static void main(String[] args) {
        String str1 = null;
        String str2 = "null";
        String str3 = "";
        if (str1 == null) {
            System.out.println("str1はnullです");
        } else {
            System.out.println("str1はnullではありません");
        }
        if (str1 == str2) {
            System.out.println("str2はnullです");
        } else {
            System.out.println("str2はnullではありません");
        }
        if (str1 == str3) {
            System.out.println("str3はnullです");
        } else {
            System.out.println("str3はnullではありません");
        }
    }
}