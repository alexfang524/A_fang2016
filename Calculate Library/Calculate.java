// Alex Fang
// APSC 1st period
// This program include methods that are can be used in DoMath
// It will calculate what ever math operation you want to perform
// If it the number is not possible such as a negative number in a square root,
// the console will say illegal arguement expression

public class Calculate {
	//part 1
	//returns square of value passed
	public static double square (double a){
		double answer;
		answer = a * a;
		return answer;
	}
	//return cube of the value passed
	public static double cube (double a){
		double cube;
		cube = a * a * a;
		return cube;
	}
	//return the sum of the two numbers and divides by 2 finding the average
	public static double average(double a, double n){
		double average;
		average = (a + n)/2;
		return average;
	}
	//return the sum of the three numbers and divides by 3 finding the average
	public static double average(double a, double n, double s){
		double average;
		average = (a + n + s)/3;
		return average;
	}
	//returns radians converted to degrees
	public static double toDegrees(double a){
		double toDegrees;
		toDegrees = a * (180/ 3.14159);
		return toDegrees;
	}
	//returns degress to radians
	public static double toRadians(double a){
		double toRadians;
		toRadians = a * (3.14159/180);
		return toRadians;
	}
	//returns coefficient of a quadratic equation and returns discriminant
	public static double discriminant(double a, double b, double c){
		double discriminant;
		discriminant = (b * b)-(4 * a * c);
		return discriminant;
	}
	//returns a mixed number into a improper fraction
	public static int toImproperFrac(int a, int b, int c){
		int toImproperFrac;
		toImproperFrac = ((a * c) + b);
		System.out.print(toImproperFrac + "/" + c);
		return toImproperFrac;
	}
	//returns an improper fractions into a mixed number
	public static String toMixedNum(int a, int b){
		String toMixedNum;
		toMixedNum = ((a / b) + "_" + (a % b) + "/" + b);
		System.out.println(toMixedNum);
		return toMixedNum;
	}
	
	//(ax + b)(cx + d) -> ax^2 + bx + c
	public static String foil(int a, int b, int c, int d, String e){
		String foil;
		foil = ((a * c) +"e^2 + " ) + (-4 * (c + d) )+ "n " + (b * d); 
		System.out.println(foil);
		return foil;
	}
	
	//part 2
	//returns determining if the number is evenly divided by the other name
	public static boolean isDivisibleBy(int a, int b){
		if(b == 0){
			throw new IllegalArgumentException();
		}
			return a % b == 0;
	}
	//return absolute value of number
	public static double absValue(double a){
			if (a > 0){
				System.out.println(a * (1));
				return a * (1);
			}
			else{
				System.out.println(a * (-1));
				return a * (-1);
			}
	}
	//returns the largest number out of the two
	public static int max(int a, int b){
		if (a > b){
			System.out.println(a);
			return a;
		}
		else {
			System.out.println(b);
			return b;
		}
	}
	//return the largest number of three
	public static int max2(int a, int b, int c){
		if (a > b && a > c){
			System.out.println(a);
			return a;
		}
		else{
			if(b>c){
				System.out.println(b);
				return b;
			}
			else {
				System.out.println(c);
				return c;
			}
		}
	}
	//returns the mininum of the number passed
	public static int min (int a, int b){
		if (a < b){
			System.out.println(a);
			return a;
		}
		else {
			System.out.println(b);
			return b;		
		}
	}
	//returns the number correctly 2 decimal places 
	public static double round2 (double a){
		int lastDig;
		double b = (int)(a*1000);
		lastDig = (int) b % 10;
		if(lastDig >= 5){
			b = (b + 10 - lastDig)/1000;
		}else{
			b = (b - lastDig)/1000;
		}
		return b;
		
	}
		
	//part 3
	//returns a value raised to the positive integer power
	public static double exponent (double base, int exponent){
		if(base == 0 && exponent == 0){
			throw new IllegalArgumentException();
		}
		double answer = 1;
		for(int i = 0; i < exponent; i++){
			answer *= base;
		}
		return answer;
	}
	//returns the factorial of the value passed throws illegal arguement if not possible
	public static int factorial (int a){
		if(a < 0){
			throw new IllegalArgumentException();
		}
		int factorial = 1;
		for(int i = 1; i <= a; i ++){
			factorial *= i;
		}
		return factorial;
	}
	//returns if the number is prime or not. This also calls another method already written.(is divisible by)
	public static boolean isPrime (int a){
		boolean check;
		for(int i = 2; i <= a - 1; i ++){
			check = Calculate.isDivisibleBy(a, i);
			System.out.println(i);
			if(check == true){
				return false;
			}
		}
		return true;
	}
	//returns the greatest cmmon factor b/t the two numbers
	public static int gcf(int a, int b){
		while(b!=0) {
			int c = a;
			a = b;
			b = c % b;
		}
		return Math.abs(a);
	}
	
	//returns the square root of value passed accurate to two decimal places
	public static double sqrt(double number) {
		if(number < 0){
			throw new IllegalArgumentException();
		}
		double t;
		double squareRoot = number / 2;
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
		return squareRoot;
	}
	//uses coefficients of quadratic formula to approximate the real roots
	//there are three conditions where:
	//if no real root print "no real root"
	//if there is a repeated root it will only prit it once
	//if there are two real roots returns them as strings exactly two decimal places. 
	//the smaller one will come first
	public static String quadForm(int a, int b, int c){
		String realRoots = "";
		double d = exponent(b, 2) - 4*a*c;
		if(d < 0){
			realRoots = "no real roots";
		}else if(d == 0){
			realRoots = Double.toString(round2(-b/2 * a));
		}else{
			double quadP = round2((-b + sqrt(d))/(2*a));
			double quadN = round2((-b - sqrt(d))/(2*a));
			realRoots = Double.toString(quadN) + " and " + Double.toString(quadP);
		}
		return realRoots;
	}
	
}
	
	

