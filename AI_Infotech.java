package java_practice;

public class AI_Infotech {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	int evencount=0,oddcount=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {evencount++;}
		else {oddcount++;}
	}
	int[] e=new int[evencount];
	int[] o=new int[oddcount];
	int evenindex=0,oddindex=0;
	for(int i=0;i<a.length;i++)
	{if(a[i]%2==0)
		{
		e[evenindex++]=a[i];
		}
		else{
			o[oddindex++]= a[i];
			}
	}

for(int i=0;i<e.length-1;i++)
{ 
	if (e[i]<e[i+1]) {
		e[i]=e[i]+e[i+1];
		e[i+1]=e[i]-e[i+1];
		e[i]=e[i]-e[i+1];
	}}
for(int i=0;i<e.length;i++)
{
System.out.print(e[i]+" ");
}
System.out.println();
for(int i=0;i<o.length;i++) 
{
System.out.print(o[i]+" ");
}
System.out.println();
int[] result= new int[o.length+e.length];
int i = 0, j = 0, k = 0;

while (i < o.length && j < e.length) {
    result[k++] = o[i++]; // odd
    result[k++] = e[j++]; // even
}

// remaining
while (i < o.length) result[k++] = o[i++];
while (j < e.length) result[k++] = e[j++];
for(int i1=0;i1<result.length;i1++)
{
System.out.print(result[i1]+" ");}
}
}

