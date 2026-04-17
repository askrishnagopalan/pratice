package java_practice;
class Student11s implements Cloneable {
    int id;
    String name;

    Student11s(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // actual cloning happens here
    }
}

public class Exampleclone {
    public static void main(String[] args) throws Exception {

        Student11s s1 = new Student11s(101, "Krishna");

        Student11s s2 = (Student11s) s1.clone();

        System.out.println("Address of object s1:   "+s1);
        System.out.println("Address of object s2:   "+s2);

        System.out.println("id of s1 object:        "+s1.id);
        System.out.println("id of s2 object:        "+s2.id);
        
        System.out.println("name of s1 object:      "+s1.name);
        System.out.println("name of s2 object:      "+s2.name);
    }
}



