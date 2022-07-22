//Palindrome

class Palindrome {
	
	public static void main(String [] args){
       int n =958;
	   int rev = 0;

	   int temp = n;
	   
	   while(temp != 0){

	    	int num = temp%10;
	    	rev = rev*10+num;
	    	temp = temp/10;
	   }

	   if(rev == n){
	   	System.out.println("It is a Palindrome");
	   }
	   else{
	   	System.out.println("It is not a Palindrome");
	   }
       
	}
}


