package chap09;

public class Example06 {

    public static void main(String[] args) {
        NewEngineer2[] se = new NewEngineer2[4];
        se[0] = new NewEngineer2();
        se[1] = new NewEngineer2();
        se[2] = new NewEngineer2();
        se[3] = new NewEngineer2();
        se[0].id = 1;
        se[0].name = "tabuchi";
        se[1].id = 2;
        se[1].name = "shinohara";
        se[2].id = 3;
        se[2].name = "kokubun";
        se[3].id = 4;
        se[3].name = "yamazaki";
        for (int i = 0; i < se.length; i++) {
            se[i].show();
        }
    }
}