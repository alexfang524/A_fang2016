import java.util.Arrays;

public class Split 
{
	public static void main(String[] args) {
		//String.split();
				//It's a method that acts on a string, <StringName>.split(<String sp>);
				//Where sp is the string where the string splits
				//And it returns an array
		
		// Example 1: "I really like really red apples"split("really")
				
		String red = "I really like really red apples";
		String[] really = red.split("really");
		System.out.println(Arrays.toString(really));
		
		//Example 2: play around with String.split! what happens if you "I reallyreally like apples".split("really") ?	
		String str = "I reallyreally like apples";
		String[] split = "I reallyreally like apples".split("really");
		System.out.println(Arrays.toString(split));
		
		// Example 3: "I like apples!".split(" "); 
				//		it will split at spaces and return an array of ["I","like","apples!"]
		String apples = "I like apples!";
		String[] half = apples.split(" ");
		System.out.println(Arrays.toString(half));
		
		midOfSandwich("applespineapplesbreadlettustomatobaconmayohambreadcheesebread");
		midOfSandwichWithSpaces("apples pineapples bread lettus tomato bacon mayo ham bread cheese");
	}
	
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		public static void midOfSandwich(String sandwich){
			String [] middle = sandwich.split("bread");
			for(int i = 1; i <= middle.length-2; i++){
				System.out.println(middle[i]);
			}
			
			int keyword = sandwich.indexOf("bread");
			
			while (keyword >= 0){
				System.out.println(keyword);
				keyword = sandwich.indexOf("bread", keyword +1);
				
			}
			
		}
		//put numbers into an arrary
		//first ind, last ind, assign both to negative one and if first index not equal to -1 overide last ind
		//line 54 used to find if there is three breads the first index and the last index and print everything in between
		
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
		public static void midOfSandwichWithSpaces(String sandwich){
			String [] middle = sandwich.split(" bread ");
			for(int i = 1; i <= middle.length-2; i++){
				System.out.println(middle[i]);
			}	
		}
}
