package chap10;

class Parent {
  public Parent() {
    System.out.println("Hello from SuperClass");
  }
}
 
class Child extends Parent {
    Child(){
        super();
    }
}
 
public class Example12_2 {
  public static void main(String[] args){
    Child c = new Child();
  }
}