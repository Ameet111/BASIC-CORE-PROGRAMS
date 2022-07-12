package bridgelabz.basic.core;
import java.util.Scanner;


public class LargestNumber {
	public static void main(String [] args){
		int x;
		int y;
		int z;
		int Largest;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first no  : ");
		x = s.nextInt();
		System.out.println("Enter the second no  : ");
		y = s.nextInt();
		System.out.println("Enter the third no  : ");
		z = s.nextInt();
		Largest = x;
		
		if(y > Largest)
			Largest = y;
		if(z > Largest)
			Largest = z;
		System.out.println("Largest no is : " + Largest);
	}


}
