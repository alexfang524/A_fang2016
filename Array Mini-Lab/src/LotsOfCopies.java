import java.util.Arrays;
//alex fang first period

public class LotsOfCopies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		changeMe(num, strMain, arrMain);
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(Arrays.toString(arrMain));
		
	}
	
	public static void changeMe(int x, String str, int[] arr){
		x = 8;
		str = "I like poop";
		arr  = {2, 4, 6, 8 ,10};
	}

}
