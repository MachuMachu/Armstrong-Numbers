import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args){
		String flag="y";	String num;
		Scanner sc= new Scanner(System.in);
		System.out.println("This Java Program checks if an input is an Armtsrong Number.");
	
		System.out.print("Input: ");
		num=sc.nextLine();
	
		if(num.matches(".*\\d.*")){
			int str=num.length(), sum=0;
			for(;str>0;str--)
					sum+=Math.pow((Character.getNumericValue(num.charAt(str-1))),num.length());

			if(Integer.parseInt(num)==sum)
					System.out.println("Accepted!");
			else
					System.out.println("Not accepted, product:"+sum);
				
			}
			else 
				System.out.println("Invalid Input!/n");
		sc.close(); 
	}
}
