package arraystudy;

import java.util.Arrays;

public class Practice2 {

	public static void main(String[] args) {//single type array
   int [] a=new int[5];
   a[0]=55;//marathi
	a[1]=65;//english
	a[2]=45;//science
	a[3]=35;//history
	a[4]=85;//maths
	Arrays.sort(a);

	for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
	}
	System.out.println("===============before sorting===============");
	Arrays.sort(a);
	System.out.println("==============after sorting==============");
	}

}
