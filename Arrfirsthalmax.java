package java_practice;

public class Arrfirsthalmax {
	public static void main(String[] args) {
		int[] arrf1= {20,4,8,10,20,30,5,60};
		int max=arrf1[0];
		for(int i=0;i<arrf1.length/2;i++) {
			if (arrf1[i]>max)
				max=arrf1[i];
		}
		System.out.println(max);
	}
}