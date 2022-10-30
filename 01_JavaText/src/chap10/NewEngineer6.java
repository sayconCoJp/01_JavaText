package chap09;

class NewEngineer6 {

    int id;
    String name;
    static int count;

    NewEngineer6(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
        this.show();
    }

    void show() {
        System.out.println(id + ":" + name + ":" + count + "人目です｡");
    }
}
