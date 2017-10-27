import java.lang.reflect.Array;
import java.util.*;
public class Split {
	public static void main(String[] args) {
		// Your task Part 0
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
//			it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples".split("really")
//			it will split at the word "really" and return an array of ["I "," like "," red apples!"]
		//play around with String.split! 
		//What happens if you "I reallyreally likeapples".split("really") ?
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("Ireallylikereallyred apples".split("really")));
		System.out.println(Arrays.toString("I reallyreally like apples".split("really")));
		System.out.println(Arrays.toString("123123".split("1")));
		//"applespineapplesbreadlettustomatobaconmayohambreadcheese";
	}
		//Your task Part 1:
		public static String sandwichSplitter(String sandwich) {
			
			String [] sandwichArray = sandwich.split("bread");
			String ingredients= "";
			for(int i=1; i<sandwichArray.length-1;i++) {
				ingredients += sandwichArray[i];
			}
			return ingredients;
			
		}
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		* use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		* What if it's a fancy sandwich with multiple pieces of bread?
		*/


		//Your task Part 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		* Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/



		}

		

