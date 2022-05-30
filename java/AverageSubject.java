package pratice.java;
import java.util.Scanner;

public class AverageSubject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of student 1:");
		System.out.println("A:");
		int A1 = sc.nextInt();
		
		System.out.println("B:");
		int B1 = sc.nextInt();
		
		System.out.println("C:");
		int C1 = sc.nextInt();
		
		System.out.println("Enter the marks of student 2:");
		System.out.println("A:");
		int A2 = sc.nextInt();
		
		System.out.println("B:");
		int B2 = sc.nextInt();
		
		System.out.println("C:");
		int C2 = sc.nextInt();
		
		System.out.println("Enter the marks of student 3:");
		System.out.println("A:");
		int A3 = sc.nextInt();
		
		System.out.println("B:");
		int B3 = sc.nextInt();
		
		System.out.println("C:");
		int C3 = sc.nextInt();
		
		int sum1 = A1+B1+C1;
		int sum2 = A2+B2+C2;
		int sum3 = A3+B3+C3;
		
		int Avg1 = sum1/3;
		int Avg2 = sum2/3;
		int Avg3 = sum3/3;
		
		int A_subTotal = A1+A2+A3;
		int B_subTotal = B1+B2+B3;
		int C_subTotal = C1+C2+C3;
		
		int A_Avg = A_subTotal/3;
		int B_Avg = B_subTotal/3;
		int C_Avg = C_subTotal/3;
		
		System.out.println("student 1 total " +sum1+ " and average marks "+Avg1);
		System.out.println("student 2 total " +sum2+ " and average marks "+Avg2);
		System.out.println("student 3 total " +sum3+ " and average marks "+Avg3);
		
		System.out.println("student A total " +A_subTotal+ " and average marks "+A_Avg);
		System.out.println("student B total " +B_subTotal+ " and average marks "+B_Avg);
		System.out.println("student C total " +C_subTotal+ " and average marks "+C_Avg);
		
		// TODO Auto-generated method stub

	}

}
