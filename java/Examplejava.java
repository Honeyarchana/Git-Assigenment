package pratice.java;

import java.util.Scanner;


public class Examplejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,copy,remainder,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		   n=sc.nextInt();
		   copy=n;
		 while(copy!=0)
		 {
			 remainder=copy%10;
			 sum=sum+remainder*remainder*remainder;
			 copy=copy/10;
		 }
		 if(sum==n)
			 System.out.println(n+" is an Armstrong");
		 else
			 System.out.println(n+" is not an Armstrong");
		
    }

}

	


