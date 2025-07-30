public class Main {
    public static void main(String[] args) {

    }
}

abstract class Animal{
    static int x;
    final int y;
    {
        y =100;
    }
    static {
        x =200;
    }
    abstract public void sound();
    abstract void colour();

    void eat(){

    }
    Animal(){

    }
    static void print (){
        System.out.println("Print inside abstract class");
    }
}
 abstract class cat extends Animal{
    void colour(){
        System.out.println("Black");
    }
    public static final int x;
     static {
         x = 100;
     }
}
class Dog extends Animal{
    void colour(){
        System.out.println("Black");
    }

    public void sound(){
        System.out.println("Bark");
    }
    static void print(){
        System.out.println("print in the concrete class ");
    }
}