package java_practice;
class Address2 implements Cloneable {
    String city;

    Address2(String city) {
        this.city = city;
    }

    // clone method for Address2
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Studentzz2 implements Cloneable {
    int id;
    String name;
    Address2 addr;
    
    Studentzz2(int id, String name, Address2 addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    // DEEP COPY
    public Object clone() throws CloneNotSupportedException {
        Studentzz2 s = (Studentzz2) super.clone();  // shallow copy first
        
        // deep copy of Address object
        s.addr = (Address2) addr.clone(); 
        
        return s;
    }
}
public class shadowcopyclone2 {
    public static void main(String[] args) throws Exception {

        Address2 a1 = new Address2("Chennai");

        Studentzz2 s1 = new Studentzz2(101, "Krishna", a1);

        Studentzz2 s2 = (Studentzz2) s1.clone();

        // BEFORE MODIFYING
        System.out.println("******** BEFORE MODIFY ********");
        System.out.println("Address of object s1:   " + s1);
        System.out.println("Address of object s2:   " + s2);

        System.out.println("id of s1 object:        "+s1.id);
        System.out.println("id of s2 object:        "+s2.id);
        
        System.out.println("name of s1 object:      "+s1.name);
        System.out.println("name of s2 object:      "+s2.name);
        
        System.out.println("Address of s1 object:   " + s1.addr.city);
        System.out.println("Address of s2 object:   " + s2.addr.city);

        // MODIFY CLONED OBJECT
        s2.addr.city = "Bangalore";

        // AFTER MODIFYING
        System.out.println("******** AFTER MODIFY ********");
        System.out.println("Address of object s1:   " + s1);
        System.out.println("Address of object s2:   " + s2);
        
        System.out.println("id of s1 object:        "+s1.id);
        System.out.println("id of s2 object:        "+s2.id);
        
        System.out.println("name of s1 object:      "+s1.name);
        System.out.println("name of s2 object:      "+s2.name);
        
        System.out.println("Address of s1 object:   " + s1.addr.city);
        System.out.println("Address of s2 object:   " + s2.addr.city);
    }
}

