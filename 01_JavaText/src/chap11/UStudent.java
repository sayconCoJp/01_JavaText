package chap11;

//TODO テキストに掲載する
public class UStudent {

    String name;
    Address address;

    public UStudent(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name + " " + this.address;
    }

    public static void main(String[] args) {
        UStudent student = new UStudent("imai", new Address());
        System.out.println(student);
    }
}
