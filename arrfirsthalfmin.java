package java_practice;

public class arrfirsthalfmin {
	public static void main(String[] args) {
		int[] arrf= {20,4,8,10,20,30,5,60};
		int min=arrf[0];
		for(int i=0;i<arrf.length/2;i++) {
			if (arrf[i]<min)
				min=arrf[i];
		}
		System.out.println(min);
	}
}
