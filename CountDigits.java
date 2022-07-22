//Count digits

//1. Solving the problem with basic solution using while loop 

class CountDigits{
	
	static int count(long n){
		 
		int count = 0;

		while(n !=0){
			n=n/10;
			count++;
		}
		return count;
		}

	public static void main(String [] args){

		long n = 124587974;
		System.out.println("Number of digits: "+ count(n));

		}

}


//2. Recursive solution

class CountDigits{

	static int count(long n){
		if(n == 0){
			return 0;
		}
		return 1 + count(n/10);
	}

	public static void main(String [] args){
		long n = 12584685;
		System.out.println("Number of digits: " + count(n));
	}
}

//3. Log Based Solution

class CountDigits{
	static int count(long n){
		return (int)Math.floor(Math.log10(n)+1);
	}

	public static void main(String [] args){
		long n = 12586489;
		System.out.println("Number of digits: " + count(n));
		}
}