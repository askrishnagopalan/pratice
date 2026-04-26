package java_practice;
import java.util.Scanner;
public class Uppercase_to_Lowercase {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:");
		String A = sc.next();
		String B ="";
		char[] A1=A.toCharArray();
		for(int i=0;i<A1.length;i++){
			char c;
			if(A1[i]>='A' && A1[i]<='Z') {
				c=(char)(A1[i]+32);}
			else{
				c=A1[i];}
			B=B+c;}
		System.out.println(B);
		sc.close();}
}
