package java_practice;
class Student1 {
    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        //if (this == obj) return true;
        //if (obj == null || getClass() != obj.getClass()) return false;

        Student1 s = (Student1) obj;
        return this.id == s.id && this.name.equals(s.name);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }
}
public class hashcodeoverride {
	 public static void main(String[] args) {

	        Student1 s1 = new Student1(1, "Krishna");
	        Student1 s2 = new Student1(1, "Krishna");

	        System.out.println("Equals: " + s1.equals(s2));

	        System.out.println("HashCode s1: " + s1.hashCode());
	        System.out.println("HashCode s2: " + s2.hashCode());
	    }
}

   
