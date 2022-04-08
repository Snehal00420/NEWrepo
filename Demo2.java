package arraystudy;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
     
		int money[]=new int[4];
		
		money[0]=20;
		money[1]=30;
	     //int =a;
		//a =10;
		
		int money1[]= {10,20,30,40,50};
		String city[]= {"nagpur","amravati","pune","mumbai"};
		Arrays.sort(city);
		for(int i=0;i<=city.length-1;i++) {
			System.out.println(city[i]);
		}
		for(int i=0;i<=4;i++) {
			System.out.print(money1[i] +" ");
		}
		
	}

}


