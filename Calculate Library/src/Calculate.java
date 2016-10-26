// Alex Fang
// APSC 1st period
// This program include methods that are can be used in DoMath
// It will calculate what ever math operation you want to perform
// If it the number is not possible such as a negative number in a square root,
// the console will say illegal argument expression

public class Calculate {
	//returns square of a number
	public static int square(int number){
		return(number * number);
	}
	//multiplies a number by itself 3 times
	public static int cube(int number){
		return(number * number * number);
	}
	//finds average of 2 doubles
	public static double average(double numOne, double numTwo){
		return((numOne + numTwo)/2);
	}
	//finds average of 3 doubles
	public static double average(double num1, double num2, double num3){
		return((num1 + num2 + num3)/3);
	}
	//converts angle measurement in radians to degrees
	public static double toDegrees(double number){
		return number * (180/ 3.14159);
	}
	//converts angle measurement in degrees to radians
	public static double toRadians(double number){
		return ((number * 3.14159) / 180);
	}
	//returns the value of the discriminant
	public static double discriminant(double num1, double num2, double num3){
		double part1 = num2 * num2;
		double part2 = -4 * num1 * num3;
		return part1 + part2;
	}
	//takes a mixed number and returns it as an improper fraction string
	public static String toImproperFrac(int num1, int num2, int num3){
		return (((num1 * num3) + num2) + "/" + num3);

	}
	//takes improper fraction and returns it as a mixed number string
	public static String toMixedNum(int a, int b){
		String toMixedNum;
		if(a % b != 0){
			toMixedNum = ((a / b) + "_" + (a % b) + "/" + b);
		}else{
			toMixedNum = Integer.toString(a / b);
		}
		return toMixedNum;
	}
	//takes binomial multiplication form and returns string of it multiplied out
	public static String foil (int w, int x, int y , int z, String n){
		if (w * z < 0 ){
			return (w * y) + "n^2 + " + ((x * y) + (w * z)) + "n " + (x * z);
		} else {
			return (w * y) + "n^2 + " + ((x * y) + (w * z)) + "n + " + (x * z);
		}
		
	}
	//determines of one integer can evenly go into another integer
	public static boolean isDivisibleBy(int num1, int num2){
		if(num2==0){
			throw new IllegalArgumentException("Cannot divide by zero");
		}
		if(num1%num2 == 0){
			return(true);
		}else{
			return(false);
		}
	}
	//gives the absolute value of a double
	public static double absValue(double num1){
		if(num1>=0){
			return(num1);
		}else{
			return(num1 * -1.0);
		}
	}
	//gives back the larger number of 2 integers
	public static int max(int num1, int num2){
		if(num1>num2){
			return(num1);
		}else{
			return(num2);
		}
	}
	//returns max out of 3 doubles
	public static double max(double num1, double num2, double num3){
		if(num1>num2 && num1>num3){
			return(num1);
		}else if(num2>num1 && num2>num3){
			return(num2);
		}else{
			return(num3);
		}
	}
	//takes 2 integers and determines the smaller one
	public static int min(int num1, int num2){
		if(num1>num2){
			return num2;
		}else{
			return num1;
		}
	}
	//takes a double and rounds it to 2 decimal places
	public static double round2(double number){
		double answer;
		double intNumber = (int)(number*1000);
		int lastDigit;
		lastDigit = (int)intNumber % 10;
		if(lastDigit >= 5){
			answer = (intNumber+10-lastDigit)/1000;
		}else{
			answer = (intNumber - lastDigit)/1000;
		}
		return answer;
		

	}
	//takes a double and an integer and raises the double to the exponent power
	public static double exponent(double base, int exponent){
		if(base == 0 && exponent == 0){
			throw new IllegalArgumentException("Cannot have base 0 and exponent 0");
		}
		double answer = 1;
		for(int i = 0; i < exponent; i++){
			answer *= base;
		}
		return answer;
	}
	//adds up numbers between 0 and user integer
	public static int factorial(int num1){
		int answer = 1;
			if(num1<0){
				throw new IllegalArgumentException("Cannot find factorial of this number");
			}
		for(int i = 1; i<=num1; i++){
			answer = answer * i;
		}
		return answer;
	}
	//determines whether a number is prime or not
	public static boolean isPrime(int num1){
		boolean prime;
		num1 = (int) absValue(num1);
		for(int i = 2; i<=num1-1; i++){
			prime = Calculate.isDivisibleBy(num1, i);
			System.out.println(i);
			if(prime ==true){
				return false;
			}
		}
		return true;
	}
	//finds greatest common factor between 2 integers
	public static int gcf(int num1, int num2){
		int greatestCommonFactor = 1;
		for(int i=1; i<=num1; i++){
			if(isDivisibleBy(num1,i) && isDivisibleBy(num2,i)){
				greatestCommonFactor=i;
			}
		}
		return (greatestCommonFactor);
	}
	//returns square root of value accurate to 2 decimal places
	public static double sqrt(double num1){
		double i = 0;
		double sqrt = num1/2.0;
		if(num1<=0){
			throw new IllegalArgumentException("Cannot square root this number");
		}
		do{
			i=sqrt;
			sqrt=(i+(num1/i))/2.0;
			
		}while(i-sqrt !=0);
		sqrt = round2(sqrt);
		return sqrt;
	}
	//uses coefficients of quadratic formula to approximate the real roots
	//there are three conditions where:
	//if no real root print "no real root"
	//if there is a repeated root it will only print it once
	//if there are two real roots returns them as strings exactly two decimal places. 
	//the smaller one will come first
	public static String quadForm(int a, int b, int c){
		String realRoots = "";
		double d = exponent(b, 2) - 4*a*c;
		if(d < 0){
			realRoots = "no real roots";
		}else if(d == 0){
			realRoots = Double.toString(round2(-b/2.0 * a));
		}else{
			double quadN = round2((-b - sqrt(d))/(2.0*a));
			double quadP = round2((-b + sqrt(d))/(2.0*a));
			realRoots = Double.toString(quadN) + " and " + Double.toString(quadP);
		}
		return realRoots;
	}
}



