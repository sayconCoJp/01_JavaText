package chap08;

public class Example10 {

    public static void main(String[] args) {
        int age = 23;
        
        if (isAdult(age)) {
            System.out.println("酒を飲む");
        }
    }

    private static boolean isAdult(int age) {
        return age >= 20;
    }
}