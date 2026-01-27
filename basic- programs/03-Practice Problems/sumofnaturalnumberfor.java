import java.util.Scanner;

class SumNaturalNumberfor{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>0){
			int sum1 = 0;
			for(int i=1;i<=n;i++){
				sum1=sum1+i;
			}
			
			int sum2 = n*(n+1)/2;
			
			if(sum1==sum2){
				System.out.println("Both results are correct! - SumNaturalNumberfor.java:17");
			}
			else{
				System.out.println("Results are not matching - SumNaturalNumberfor.java:20");
			}
			System.out.println("Sum using for loop: - SumNaturalNumberfor.java:22"+sum1);
			System.out.println("Sum using formula: - SumNaturalNumberfor.java:23"+sum2);
		}
		else{
			System.out.println("Please Enter a real number - SumNaturalNumberfor.java:26");
		}
	}
}
