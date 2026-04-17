package java_practice;
abstract class Animal3 {

    // Instance variable abstract
    String name;
    // static variable  abstract
     static String name1="static variable3";
// Instance initializer of abstract
    {
        System.out.println("Instance initializer of abstract class");
    }
static {
        System.out.println("Static initializer of abstract class");
    }
    // Constructor of abstract
    Animal3(String name) {
        this.name = name;
        System.out.println("abstract class constructor name is Animal called");
    }

    // Abstract method
    abstract void sound();

    // Static method of abstarct
    static void info() {
        System.out.println("Animals static method");
    }
// non-static method of abstract
    void info1() {
        System.out.println("Animals non-static method");
    }

}
//Subclass
class cat extends Animal3 {

 cat(String name) {
     super(name); // calling abstract class constructor
     System.out.println("sub class constructor name is cat called ");
 }

 void sound() {
     System.out.println("cat:"+name);
 }
}
// Subclass
class Dog3 extends Animal3 {

    Dog3(String name) {
        super(name); // calling abstract class constructor
        System.out.println("sub class constructor name is dog called ");
    }

    void sound() {
        System.out.println("dog:"+name);
    }
}
class Puppy2 extends Dog3 {

    Puppy2(String name) {
        super(name); // calling parrent class constructor
        System.out.println("sub class constructor name is puppy called ");
    }

    void sound() {
        System.out.println("puppy:"+name);
    }
}
public class abstract_hybrid {
	 public static void main(String[] args) {
         //Calling static variable
         System.out.println(Animal3.name1);
        // Calling static method of abstract class
        Animal3.info();
        // Creating object of subclass
        cat c = new cat("jerry");

        //calling abstract method
        c.sound();
        //Calling non static method of abstract class
        c.info1();
        // Creating object of subclass
        Puppy2 p = new Puppy2("jack");

        //calling abstract method
        p.sound();
        //Calling non static method of abstract class
        p.info1();
     // Creating object of subclass
        Dog3 d = new Dog3("tom");

        //calling abstract method
        d.sound();
        //Calling non static method of abstract class
        d.info1();
    }
}
