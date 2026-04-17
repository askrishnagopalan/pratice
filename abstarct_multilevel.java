package java_practice;
abstract class Animal1 {

    // Instance variable abstract
    String name;
    // static variable  abstract
     static String name1="static variable";
// Instance initializer of abstract
    {
        System.out.println("Instance initializer of abstract class");
    }
static {
        System.out.println("Static initializer of abstract class");
    }
    // Constructor of abstract
    Animal1(String name) {
        this.name = name;
        System.out.println("Abstract class constructor name is Animal called");
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

// Subclass
class Dog1 extends Animal1 {

    Dog1(String name) {
        super(name); // calling abstract class constructor
        System.out.println("sub class constructor name is dog called ");
    }

    void sound() {
        System.out.println("dog:"+name);
    }
}
class Puppy extends Dog {

    Puppy(String name) {
        super(name); // calling parrent class constructor
        System.out.println("sub class constructor name is puppy called ");
    }

    void sound() {
        System.out.println("puppy:"+name);
    }
}
// Main class
public class abstarct_multilevel {
	 public static void main(String[] args) {
         //Calling static variable
         System.out.println(Animal.name1);
        // Calling static method of abstract class
        Animal.info();
        // Creating object of subclass
        Puppy d = new Puppy("Tommy");

        //calling abstract method
        d.sound();
        //Calling non static method of abstract class
        d.info1();
    }
}
