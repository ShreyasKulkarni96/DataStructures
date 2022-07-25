//Trailing zeros in factorial

	
class TrailingZerosInFactorial{
	
	static int fact(int n){
     	
     	int i;
     	int response = 1;

     	for(i = 1; i<=n; i++){
     		response = response*i;
     	}
     	int count = 0;
     	while(response%10 == 0){
     		count++;
     		response=response/10;
     	}
     	return count;

	}

	public static void main(String [] args){

		int n = 5;
		System.out.println("Trailing zeros in factorial of number "+ n +" is: "+fact(n));
	}
}
