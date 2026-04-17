package java_practice;

public class Arrsecondhalfmax {

	public static void main(String[] args) {
		int[] arrf2= {20,4,8,10,20,30,5,60};
		int shalf=arrf2.length/2;
		int max=arrf2[arrf2.length/2];
		for(int i=shalf;i<arrf2.length;i++) {
			if (arrf2[i]>max)
				max=arrf2[i];
		}
		System.out.println(max);
	}
}