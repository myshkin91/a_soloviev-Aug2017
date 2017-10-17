//Alex Soloviev
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
				 double oneRoot = (-b + (sqrt(discriminant(a,b,c))))/(a*2.0);
				 double twoRoot = (-b - (sqrt(discriminant(a,b,c))))/(a*2.0);
			     
				 if (oneRoot==twoRoot) 
			    		xintercept =  "x-intercept(s): "+ twoRoot;
			    	
				 else	
			    		xintercept = "x-intercept(s): " + oneRoot + " and " +twoRoot;
			 }
			 yintercept = "y-intercept: " + c;
			 String answer = heading + "\n"+ equation + "\n" + "\n" + open + "\n" +  symmetry + "\n"+ vertex + "\n" + xintercept + "\n"+ yintercept;
			 System.out.println( );
			 return answer; 
		}
}
