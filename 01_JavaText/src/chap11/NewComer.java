package chap11;

//TODO テキストに掲載する
public class NewComer {

    int experience;
    String name;

    NewComer(int experience, String name) {
        this.experience = experience;
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hello, I'm " + name + ", my experience level is " + experience);
    }
    
    void selfLearning(){
        this.experience++;
    }

    public static void main(String[] args) {
        NewComer nc = new NewComer(1, "imai");
        nc.sayHello();
        nc.selfLearning();
        nc.sayHello();
    }
}
