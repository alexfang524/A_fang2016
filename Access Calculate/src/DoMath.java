
public class DoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		boolean b;

		a = Calculate.square(6.0);
		System.out.println(a);
		
		a = Calculate.cube(6.0);
		System.out.println(a);
		
		a = Calculate.average(4.0, 4.0);
		System.out.println(a);
		
		a = Calculate.average(4.0, 3.0, 2.0);
		System.out.println(a);
	
		a = Calculate.toDegrees(3.14159);
		System.out.println(a);
	
		a = Calculate.toRadians(180);
		System.out.println(a);
	
		a = Calculate.discriminant(2, 3 , 4);
		System.out.println(a);
	
		a = Calculate.toImproperFrac(3, 1, 2);
		System.out.println(a);
		
		Calculate.toMixedNum(7, 2);
		
		Calculate.foil(2, 3, 6, -7, "n");
	
		
		b = Calculate.isDivisibleBy(7, 2);
		System.out.println(b);
		
		
		Calculate.absValue(-4);
		
		Calculate.max(5, -5);
		
		Calculate.max2(3, 4, 7);
		
		Calculate.round2(15.6274);
		
		a = Calculate.exponent(2, 3);
		System.out.println(a);

		a = Calculate.factorial(4);
		System.out.println(a);
		
		b = Calculate.isPrime(12);
		System.out.println(b);
		
		a = Calculate.gcf(4, 2);
		System.out.println(a);
		
		a = Calculate.sqrt(16);
		System.out.println(a);
	}

}