
public class Calculate {
	//part 1
	public static double square (double a){
		double answer;
		answer = a * a;
		return answer;
	}
	public static double cube (double a){
		double cube;
		cube = a * a * a;
		return cube;
	}
	public static double average(double a, double n){
		double average;
		average = (a + n)/2;
		return average;
	}
	public static double average(double a, double n, double s){
		double average;
		average = (a + n + s)/3;
		return average;
	}
	public static double toDegrees(double a){
		double toDegrees;
		toDegrees = a * (180/ 3.14159);
		return toDegrees;
	}
	public static double toRadians(double a){
		double toRadians;
		toRadians = a * (3.14159/180);
		return toRadians;
	}
	public static double discriminant(double a, double b, double c){
		double discriminant;
		discriminant = (b * b)-(4 * a * c);
		return discriminant;
	}
	public static int toImproperFrac(int a, int b, int c){
		int toImproperFrac;
		toImproperFrac = ((a * c) + b);
		System.out.print(toImproperFrac + "/" + c);
		return toImproperFrac;
	}
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
	public static boolean isDivisibleBy(int a, int b){
			if(a % b == 0){
//				System.out.println("True");
				return true;
			}
			else {
//				System.out.println("False");
				return false;
			}
	}
	
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
	
	public static double round2 (double a){
		if ( a >= .005){
			System.out.println(a + (.01-a));
			return a + (.01-a);
		}
		else {
			System.out.println(a - a);
			return a - a;
		}
		
	}
	//part 3
	
	public static double exponent (double base, int exponent){
		double answer = 1;
		for(int i = 0; i < exponent; i++){
			answer *= base;
		}
		return answer;
	}
	
	public static int factorial (int a){
		int factorial = 1;
		for(int i = 1; i <= a; i ++){
			factorial *= i;
		}
		return factorial;
	}
	
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
	
	public static int gcf(int a, int b){
		while(b!=0) {
			int c = a;
			a = b;
			b = c%b;
		}
		return Math.abs(a);
	}
	
	
	public static double sqrt(int number) {
		double t;
		double squareRoot = number / 2;
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
		return squareRoot;
	}
	
}
	
	

