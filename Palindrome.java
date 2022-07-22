//Palindrome
import java.util.Scanner;

class Palindrome {
	
	public static void main(String [] args){
       Scanner number = new Scanner(System.in);
       System.out.println("Enter any number: ");
       int num = number.nextInt();
       int reversed = 0;
       int temp = num;

       while(num != 0){

       	int r = num%10;
       	reversed = reversed*10+r;
       	num = num/10;
       	
       }

	   if(temp == reversed){
	   	System.out.println("It is a Palindrome");
	   }
	   else{
	   	System.out.println("It is not a Palindrome");
	   }
       
	}
}


