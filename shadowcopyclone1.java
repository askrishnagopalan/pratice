package java_practice;
class Address1 {
    String city;

    Address1(String city) {
        this.city = city;
    }
}

class Studentzz1 implements Cloneable {
    int id;
    String name;
    Address1 addr;
    
    Studentzz1(int id,String name, Address1 addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    public Object clone() throws CloneNotSupportedException {
       /* return super.clone(); // shallow copy*/
        Studentzz1 s = (Studentzz1) super.clone();
        s.addr = new Address1(this.addr.city); // NEW object
        return s;
    }
}

public class shadowcopyclone1 {
    public static void main(String[] args) throws Exception {

        Address1 a1 = new Address1("Chennai");

        Studentzz1 s1 = new Studentzz1(101,"Krishna", a1);

        Studentzz1 s2 = (Studentzz1) s1.clone();
        // BEFORE MODIFYING CLONED OBJECT
        System.out.println("*****************************************************");
        System.out.println("Address of object s1:   "+s1);
        System.out.println("Address of object s2:   "+s2);

        System.out.println("id of s1 object:        "+s1.id);
        System.out.println("id of s2 object:        "+s2.id);
        
        System.out.println("name of s1 object:      "+s1.name);
        System.out.println("name of s2 object:      "+s2.name);
        
        System.out.println("Address of s1 object:   "+s1.addr.city);
        System.out.println("Address of s2 object:   "+s2.addr.city);
        // Modify cloned object
        s2.addr.city = "Bangalore";
        // AFTER MODIFYING CLONED OBJECT
        System.out.println("*****************************************************");
        System.out.println("Address of object s1:   "+s1);
        System.out.println("Address of object s2:   "+s2);

        System.out.println("id of s1 object:        "+s1.id);
        System.out.println("id of s2 object:        "+s2.id);
        
        System.out.println("name of s1 object:      "+s1.name);
        System.out.println("name of s2 object:      "+s2.name);
        
        System.out.println("Address of s1 object:   "+s1.addr.city);
        System.out.println("Address of s2 object:   "+s2.addr.city);
    }
}


