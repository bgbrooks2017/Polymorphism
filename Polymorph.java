public class Polymorph {
	public static void main(String[] args){
	/*internal tests.
		int num1 = 5;
		int num2 = 4;
		int num3 = 6;
		System.out.println(doWork(num1));
		System.out.println(doWork(num1, num2));
		System.out.println(doWork(num1, num2, num3));
		*/
	}

	public static String doWork(int a){
	String yourNumb ="This is your number: " + a;
	return yourNumb;
	}
	
	public static String doWork(int a, int b){
		int mult = a * b;
		String multiplied = "Your numbers multiplied together equals: " + mult;
		return multiplied;
	}
	
	public static String doWork(int a, int b, int c){
		int avg = (a + b + c)/3;
		String average = "The average of these three numbers is: " + avg;
		return average;
	}
	
}
