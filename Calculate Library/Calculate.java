
public class Calculate {
	
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
	
	public static boolean isDivisibleBy(int a, int b){
			if((a/b) < 1){
				return false;
			}
			else {
				return true;
			}
	}
	
	public static double absValue(double a){
			if (a > 0){
				return a * (1);
			}
			else{
				return a * (-1);
			}
	}
	
	public static int max(int a, int b){
		if (a > b){
			return a;
		}
		else {
			return b;
		}
	}
	
	public static int max(int a, int b, int c){
		if (a > b && a > c){
			return a;
		}
		else{
			if(b>c){
				return b;
			}
			else {
				return c;
			}
		}
	}
	
	public static int min (int a, int b){
		if (a < b){
			return a;
		}
		else {
			return b;		
		}
	}
	
	public static double round2 (double a){
		if ( a >= .005){
			return a + (.01-a);
		}
		else {
			return a - a;
		}
		
	}
	
}
	
	

