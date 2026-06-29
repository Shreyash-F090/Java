package demo;
class animal{
    void sound() {
        System.out.print("animal makes an sound");
    }
}

class Dog extends animal{
    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}
public class DemoB {
    public static void main(String[] args){
        Dog D = new Dog();
        D.sound();
    }
}
