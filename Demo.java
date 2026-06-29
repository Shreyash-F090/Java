package demo;

public class Demo {
    Demo(){
        System.out.println("Default constructor");
    }
    Demo(String name) {
        System.out.println("\nConstructor with 1 parameter");
        System.out.println("name :" + name);
    }
    Demo(String name, int age) {
        System.out.println("\nConstructor with 2 parameter");
        System.out.println("Name :" + name);
        System.out.println("age :" + age);
    }
    int sub(int a, int b) {
        System.out.println("\nMethod with Two variable of same datatypes");
        return a - b;
    }
    int sub(String a, int b) {
        System.out.println("\nMethod with Two variable of different datatypes");
        System.out.println("Name :" + a);
        return b;
    }
    int sub(int a, int b, int c) {
        System.out.println("\nMethod with three variable of same datatypes");
        return a - b - c;
    }

    public static void main(String[] args) {
        Demo D = new Demo();
        new Demo("Shreyash");
        new Demo("Shreyash", 19);
        System.out.println(D.sub(90, 10));
        System.out.println(D.sub("Shreyash", 18));
        System.out.println(D.sub(90, 10, 10));
    }
    
}
