//Alex Fang collaborative programming with Parsa
//APCS 1st period
//This program will ask the user to enter a string of numbers
//The program will the print out the largest number the user input,
//The sum of the even numbers,
//the smallest number,
//and the the total of the numbers. 


import java.util.Scanner;

public class ProcessingNumbersWithString {

	private static Scanner userInput;

	public static void main(String[] args) {
		userInput = new Scanner(System.in);
		
		System.out.println("Enter a string of numbers seperated by spaces: ");
		//User is able to type in their numbers separated by spaces
		String inputString = userInput.nextLine();
		String[] splited = inputString.split(" ");
		int lengthOfSplited = splited.length;
		
		int min = 0;
		int max = 0;
		int total = 0;
		int largestEven = 0;
		
		
		for(int i = 0; i < lengthOfSplited ; i++){
			
			int num = Integer.parseInt(splited[i]);
			//Extracts value of each individual number from string into an integar
			if(num > max)
			{
				max = num;
			}
			if(i == 0)
			{
				min = num;
			}
			else if(num < min)
			{
				min = num;
			}
			if(num % 2 == 0)
			{
				total += num;
				if(num > largestEven)
				{
					largestEven = num;
				}
			}
			
		}
		System.out.println("");
		System.out.println("The smallest number is: " + min);
		System.out.println("The largest number is: " + max);
		System.out.println("The total of even numbers are: " + total);
		System.out.println("The largest even number is: " + largestEven);
	}

}