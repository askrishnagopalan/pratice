package java_practice;

public class Stringinternwithoutconcart_Example {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		s1.intern();
		String s2 = s1.intern();
		String s3 = "Hello";
		System.out.println("Stringinternwithoutconcart_Example ");
		System.out.println("s1 HashCode reference: "+s1.hashCode());
		System.out.println("s2 HashCode reference: "+s2.hashCode()); 
		System.out.println("s3 HashCode reference: "+s3.hashCode());
        System.out.println("s1 reference: " + System.identityHashCode(s1));
        System.out.println("s2 reference: " + System.identityHashCode(s2));
        System.out.println("s3 reference: " + System.identityHashCode(s3));
		System.out.println(s1 == s2); // false
		System.out.println(s2 == s3); // true
		System.out.println(s1 == s3); // false
	}
}
