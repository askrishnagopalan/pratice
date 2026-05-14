package java_practice;

public class AI_Infotech1 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int k = 2; // rotate by 2
        int n = a.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            result[(i + k) % n] = a[i];
        }
        // print result
        for(int x : result) {
            System.out.print(x + " ");
	}
	}
	}
