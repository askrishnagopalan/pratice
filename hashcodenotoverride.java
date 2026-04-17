package java_practice;
class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    }
public class hashcodenotoverride {
	public static void main(String[] args) {

        Student s1 = new Student(1, "Krishna");
        Student s2 = new Student(1, "Krishna");


        System.out.println("HashCode s1: " + s1.hashCode());
        System.out.println("HashCode s2: " + s2.hashCode());
    }
}
