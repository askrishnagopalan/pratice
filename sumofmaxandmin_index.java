package java_practice;

public class sumofmaxandmin_index {
	public static void main(String[] args) {
		int[]a= {2,4,8,10,20,30,5,60};int echange=0;int ochange=0;
		//int max=a[0];
		//int min=a[1];
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				//echange=a[i];
				if(a[i]>echange)
				{echange=a[i];}}
				if(i%2!=0) {
					ochange=a[i];
					if(a[i]>ochange)
					{ochange=a[i];}
				}
			
		}
		System.out.println(echange+ochange);
	}

}
