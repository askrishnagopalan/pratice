package java_practice;

public class Arrsecondhalfmin {

	public static void main(String[] args) {
		int[] arrf2= {20,4,8,10,20,30,5,60};
		int shalf=arrf2.length/2;
		int min=arrf2[0];
		for(int i=shalf;i<arrf2.length;i++) {
			if (arrf2[i]<min)
				min=arrf2[i];
		}
		System.out.println(min);
	}
}