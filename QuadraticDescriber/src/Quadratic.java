//Alex Soloviev
//October 17, 2017

public class Quadratic {

	//This method provides coefficients of a quadratic equation in standard form and returns the value of the discriminant.
		public static double discriminant(double a, double b, double c) {
			return (b*b) - (4 * a * c);
		}
		//A call to round2 rounds a double correctly to 2 decimal places and returns a double.
		public static double round2 (double orig) {
			double result = 0.0;
			
			int tempInt = (int)(orig*1000);
			int roundNum = tempInt % 10;
			tempInt = tempInt / 10;
			if (roundNum >= 5 && tempInt >0)
				tempInt++;
			else if(roundNum <=-5 && tempInt <0)
				tempInt--;
			result = tempInt /100.0;
			return result;
		}
		/*public static double round2 (double operand) {
			int times100 = (int) (operand * 100);
			int thousandths = times100 %10;
			times100 = times100/10;
			if (thousandths >= 5) {
				times100++;
				double rounded = (times100 / 100.00);
				return rounded;
			} else if (thousandths <= -5) {
				times100--;
				double rounded = (times100/ 100.00);
				return rounded;
			}else {
				double rounded = (times100/100.00);
				return rounded;
			}
			}*/
		
		//This method accepts a double and returns a double. A call to sqrt returns an approximation of the square root of the values passed, rounded to two decimal places.
		public static double sqrt (double operand) {
			double guess = operand/2;
			while ((guess * guess > operand +0.005) || (guess * guess) < operand - 0.005) {
				guess = (0.5 * ((operand / guess) +guess));
			}
			return round2 (guess);
		}
		//This method will three doubles and return a string. Through the input of coefficients a, b, and c, quadrDescriber will describe the characteristics of the quadratic equation.
		public static String quadrDescriber (double a, double b, double c) {
			 String open = "";
			 String symmetry = "";
			 String vertex = "";
			 String yintercept = "";
			 String xintercept = "";
			 String heading ="Description of the graph of: ";
			 String equation = "y = " + a +" x^2 + " + b + " x + " + c  ;
			 
			 	if (a<0)
			 		open = "Opens: Down";
			 	else if (a>0)
			 		open = "Opens: Up";
			 	else if (a==0)
			 		open = "Linear"; 
			
			 double x = -b/(2*a);
			 symmetry = ("Axis of Symmetry: " + x);
			 
			 double y = a*(x*x) + b*(x) + c;
			 vertex ="Vertex: " + "(" + x + ", " + y + ")";
			
			 if (discriminant(a,b,c)<0)
			 		xintercept = "x-intercept(s): None";
			 	
			 else {
				 double firstRoot = (-b + (sqrt(discriminant(a,b,c))))/(a*2.0);
				 double secondRoot = (-b - (sqrt(discriminant(a,b,c))))/(a*2.0);
			     
				 if (firstRoot==secondRoot) 
			    		xintercept =  "x-intercept(s): "+ secondRoot;
			    	
				 else	
			    		xintercept = "x-intercept(s): " + firstRoot + " and " +secondRoot;
			 }
			 yintercept = "y-intercept: " + c;
			 String answer = heading + "\n"+ equation + "\n" + "\n" + open + "\n" +  symmetry + "\n"+ vertex + "\n" + xintercept + "\n"+ yintercept;
			 System.out.println( );
			 return answer; 
		}
}
