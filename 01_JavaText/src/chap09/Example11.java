package chap09;

public class Example11 {

    static void show(NewEngineer1 se) {
        System.out.println(se.id + " : " + se.name);
    }

    public static void main(String[] args) {
        NewEngineer1 yamazaki = new NewEngineer1();
        yamazaki.id = 1;
        yamazaki.name = "yamazaki";
        NewEngineer1 imai = new NewEngineer1();
        imai.id = 2;
        imai.name = "imai";
        show(yamazaki);
        show(imai);       
    }
}