/*Alex Soloviev
 *September 5, 2017
 *This is the runner class for the Calculate Library methods 
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(5));
		System.out.println(Calculate.average(3.0, 2.0 ));
		System.out.println(Calculate.average(3.0, 4.0, 5.0));
		System.out.println(Calculate.toDegrees(3.14159));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(4, 2, 1 ));
		System.out.println(Calculate.toImproperFrac(3, 1, 2 ));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n" ));
		System.out.println(Calculate.isDivisibleBy(7, 3));
		System.out.println(Calculate.absValue(-2.0));
		System.out.println(Calculate.max(6.0, 7.0));
		System.out.println(Calculate.max(6.0, 7.0, 8.0));
		System.out.println(Calculate.min(6, 7));
		System.out.println(Calculate.round2(6.13222947882545));
		System.out.println(Calculate.exponent(4.00, 4));

	}

}
