import java.util.Scanner;

public class ProcessingNumbers {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many numbers? ");
		int howMany = userInput.nextInt();
		int min = 0;
		int max = 0;
		int total = 0;
		for(int i = 0; i < howMany; i++){
			System.out.println("Enter your number: ");
			int num = userInput.nextInt();
			if(num > max){
				max = num;
			}
			if(num < max){
				min = num;
			}
			if(num % 2 == 0){
				total += num;
			}
		}
		System.out.println("");
		System.out.println(max);
		System.out.println(min);
		System.out.println(total);
	}

}
