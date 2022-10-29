package chap07;

public class Example09 {

    public static void main(String[] args) {
        String str1 = "Hello"; //①
        String str2 = str1; //②
        str1 = "World"; //③

        System.out.println(str1 == str2);
    }
}