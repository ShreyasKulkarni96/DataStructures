//Factorial of a number

// Using for loop
class Factorial{
	
	 static int fact(int n){
     	
     	int i;
     	int response = 1;

     	for(i = 1; i<=n; i++){
     		response = response*i;
     	}
     	return response;

	}

	public static void main(String [] args){

		int n = 5;
		System.out.println("Factorial of number "+ n +" is: "+fact(n));
	}
}

//Using while loop

class Factorial{
	static int fact(int n){
        int num=1;
        int factorial = 1;

		while (num <= n){
			factorial = factorial*num;
			i++;
		}
		return factorial;

	}
	public static void main(String [] args){
		int n = 5;
		System.out.println("Factorial of number "+ n +" is: "+fact(n));
	}
}