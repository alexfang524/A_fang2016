
public class DoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		
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
		
		Calculate.isDivisibleBy(4, 2);
		
	}

}