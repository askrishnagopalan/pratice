package java_practice;
public class String_without_Final {
	public static void main(String[] args) {
		String s1 = "A"; 
		String s2 = s1 + "B"; 
		String s3 = "AB";
        System.out.println("s1 reference: " + System.identityHashCode(s1));
        System.out.println("s2 reference: " + System.identityHashCode(s2));
        System.out.println("s3 reference: " + System.identityHashCode(s3));
		System.out.println(s2 == s3); // false	
	}
}
