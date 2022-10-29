package chap12;

public class Example05 {

    public static void main(String[] args) {
        AbstractHuman1[] ah = {new NormalPlayer1(), new VipPlayer1() };
        
        for (AbstractHuman1 ah1 : ah) {
            ah1.play();
        }
    }
}
