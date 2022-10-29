package chap09;

public class Example12 {

    static void show(NewEngineer1 se) {
        se.name += "_san";
        System.out.println(se.id + " : " + se.name);
    }

    public static void main(String[] args) {
        NewEngineer1 yamazaki = new NewEngineer1();
        yamazaki.id = 1;
        yamazaki.name = "yamazaki";
        show(yamazaki);
        System.out.println(yamazaki.name);
    }
}
