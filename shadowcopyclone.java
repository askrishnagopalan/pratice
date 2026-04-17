package java_practice;
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Studentzz implements Cloneable {
    int id;
    String name;
    Address addr;
    
    Studentzz(int id,String name, Address addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy*/
    }
}
public class shadowcopyclone {
    public static void main(String[] args) throws Exception {

        Address a1 = new Address("Chennai");

        Studentzz s1 = new Studentzz(101,"Krishna", a1);

        Studentzz s2 = (Studentzz) s1.clone();
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

