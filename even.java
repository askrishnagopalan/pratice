package java_practice;

public class even {
	
	    public static void main(String[] args) {

	        int[] a = {2, 4, 8, 10, 20, 30, 5, 60};

	        int sum = 0;
	        int count = 0;

	        for (int i = 0; i < a.length; i += 4) { // even index
	            sum += a[i];
	            count++;
	        }

	        double avg = (double) sum / count;

	        System.out.println("Average of even index elements = " + avg);
	    }
	}


