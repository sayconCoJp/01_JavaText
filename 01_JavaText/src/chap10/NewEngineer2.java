package chap09;

class NewEngineer2 {

    int id;
    String name;

    public NewEngineer2() {
    }

    void show() {
        System.out.println("私のIDは" + id + "、名前は" + name + "です。");
    }

    public static void main(String[] args) {
        NewEngineer2 se2 = new NewEngineer2();
        se2.id = 2;
        se2.name = "tabuchi";
        se2.show();
    }
}
