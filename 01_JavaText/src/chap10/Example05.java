package chap09;

public class Example05 {

    public static void main(String[] args) {
        NewEngineer2 se1 = new NewEngineer2();
        se1.id = 1;
        se1.name = "yamazaki";
        NewEngineer2 se2 = se1;
        se1.show();
        se2.show();
    }
}