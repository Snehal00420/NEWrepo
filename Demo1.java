package arraystudy;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
     char[] grade = new char[6];
    		grade[0]='A'; 
    		grade[1]='C';
    		grade[2]='D';
    		grade[3]='B';
    		for( int i=0;i<=4;i++)
    		{
    			System.out.println(grade[i]);
    		}
    		
    		
    		Arrays.sort(grade);
    		for(int i=0;i<=5;i++)
    		{
    			System.out.println(grade[i]);
    		}
    		System.out.println("===============ascending order===============");
    		for(int i=0;i<=grade.length-1;i++) {
    			System.out.println(grade[i]);
    			
    		}
    		System.out.println("========================= decending order==========================");
    	for(int i= grade.length-1;i>=0;i--) {
    			System.out.println(grade[i]);
    		}
    		
	}	
	}


