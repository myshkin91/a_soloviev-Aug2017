//Alex Soloviev
//10-30-17
import java.util.Arrays;
public class Split {
	public static void main(String[] args) {
		// Your task Part 0
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// "I like apples!".split(" "); 
//			it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples".split("really")
//			it will split at the word "really" and return an array of ["I "," like "," red apples!"]
		//play around with String.split! 
		//What happens if you "I reallyreally likeapples".split("really") ?
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("Ireallylikereallyred apples".split("really")));
		System.out.println(Arrays.toString("I reallyreally like apples".split("really")));
		System.out.println(Arrays.toString("123123".split("1")));
		
		//Your task Part 1:
		/*Write a method that take in a string like "applespineapplesbreadlettucetomatobaconmayohambreadcheese" describing a sandwich
		* use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		* What if it's a fancy sandwich with multiple pieces of bread?
		*/	
		System.out.println(getIngredients("potato tomato bread lettuce tomato bacon mustard pepperoni bread cheese bread mayo bread"));
		System.out.println(getIngredients("ice cream bread lettuce tomato bacon mayo ham bread cheese bread"));
		System.out.println(getIngredients("banana bread lettuce tomato bbreadacon mustard pepperoni bread cheese bread mayo bread"));
		System.out.println(getIngredients("bananabreadlettucetomatobbreadaconmustardpepperonibreadcheesebreadmayobread"));
		System.out.println(getIngredients("breadlettuceomatobbreadaconmayohambreadsausagebreadcheese"));
		System.out.println(getIngredients("applespineapplesbreadlettucetomatobaconmayohambreadcheese"));
		System.out.println(getIngredients("bread"));
		System.out.println(getIngredients("bread bread"));
		System.out.println(getIngredients("breadbread"));
		
		//Your task Part 2:
		/*Write a method that take in a string like "apples pineapples bread lettuce tomato bacon mayo ham bread cheese" describing a sandwich
		* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		* Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
		System.out.println("Part 2");
		System.out.println(getIngredientsPart2("potato tomato bread lettuce tomato bacon mustard pepperoni bread cheese bread cherry lemon bread"));
		System.out.println(getIngredientsPart2("ice cream bread lettuce tomato bacon mustard pepperoni bread cheese bread cherry lemon"));
		System.out.println(getIngredientsPart2("banana bread lettuce tomato bbreadacon mustard pepperoni bread cheese bread pickles olives bread"));
		System.out.println(getIngredientsPart2("applespineapplesbreadlettucetomatobaconmayohambreadcheese"));
		System.out.println(getIngredientsPart2("bread"));
		System.out.println(getIngredientsPart2("bread bread"));
	}
		//Part 1:
		public static String getIngredients (String sandwich) {
			if (sandwich.indexOf("bread")<0||sandwich.equals("bread")) {
				return "not a sandwich";
			}
			int endsWithBread =1;
			String [] sandwichArray = sandwich.split("bread");
			String ingredients= "";
			if(sandwich.substring(sandwich.length()-5).equals("bread")){
				endsWithBread = 0;
			}
			for(int i=1;i<sandwichArray.length-endsWithBread;i++)	{
				ingredients += sandwichArray[i];
			}
			if(ingredients.equals("")||ingredients.equals(" ")){
				return "not a sandwich";
			}
			return ingredients;
			
		}
		//part 2
		public static String getIngredientsPart2(String sandwich) {
			String[] sandwichArray = sandwich.split(" ");
			String spacelessSandwich = "";
			for(int i = 0; i < sandwichArray.length;i++){
				spacelessSandwich += sandwichArray[i];
			}
			return getIngredients(spacelessSandwich);
		}
	}

		

