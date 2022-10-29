package chap11;

//TODO テキストに掲載する
        
public class Company {

    String name;

    public NewComer educate(NewComer nc) {
        nc.experience++;
        return nc;
    }

    public static void main(String[] args) {
        NewComer nc = new NewComer(1, "imai");
        Company c = new Company();
        c.educate(nc);
        nc.selfLearning();
        System.out.println(nc.experience);
    }
}
