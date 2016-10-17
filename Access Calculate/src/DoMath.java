
public class DoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		boolean b;
		String c;

		a = Calculate.square(6.0);
		System.out.println("Square: " + a);
		
		a = Calculate.cube(6.0);
		System.out.println("Cube: " + a);
		
		a = Calculate.average(4.0, 4.0);
		System.out.println("Average: " + a);
		
		a = Calculate.average(4.0, 3.0, 2.0);
		System.out.println("Average: " + a);
	
		a = Calculate.toDegrees(3.14159);
		System.out.println("To Degrees: " + a);
	
		a = Calculate.toRadians(180);
		System.out.println("To Radians: " + a);
	
		a = Calculate.discriminant(2, 3 , 4);
		System.out.println("Discriminant: " + a);
	
		c = Calculate.toImproperFrac(3, 1, 2);
		System.out.println("To Improper Fraction: " + c);
		
		c = Calculate.toMixedNum(7, 2);
		System.out.println("To Mixed number: " + c);
		
		c = Calculate.foil(2, 3, 6, -7, "n");
		System.out.println("Foil: " + c);
	
		b = Calculate.isDivisibleBy(8, 2);
		System.out.println("isDivisibleby: " + b);
		
		a = Calculate.absValue(-4); 
		System.out.println("Absolute value: " + a);
		
		a = Calculate.max(5, -5);
		System.out.println("MAX: " + a);
		
		a = Calculate.max(3, 4, 7);
		System.out.println("MAX: " + a);
		
		a = Calculate.round2(15.6274);
		System.out.println("Round2: " + a);
			
		a = Calculate.exponent(0, 2);
		System.out.println("Exponent: " + a);

		a = Calculate.factorial(2);
		System.out.println("Facorial: " + a);
		
		b = Calculate.isPrime(12);
		System.out.println("IsPrime: " + b);
		
		a = Calculate.gcf(8, -4);
		System.out.println("GCF: " + a);
		
		a = Calculate.sqrt(16);
		System.out.println("SQRT: " + a);
		
		c = Calculate.quadForm(4, -2, -2);
		System.out.println("QuadForm: " + c);
	}

}