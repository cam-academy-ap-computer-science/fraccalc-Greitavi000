package fracCalc;
import java.util.Scanner;

public class FracCalc {

	public static void main(String[] args)  {
		// TODO: Read the input from the user and call produceAnswer with an equation
		Scanner userInput = new Scanner(System.in);	
		System.out.println("Enter your problem");
		String problem = userInput.nextLine();  
		while (!problem.contentEquals("quit")) {
			String answer = produceAnswer(problem);
			System.out.println("Here is your answer: "+ answer);
			problem = userInput.nextLine();
		}

	}
	public static String produceAnswer(String input){ 
		// TODO: Implement this function to produce the solution to the input
		int firstSpace= input.indexOf(" ");
		int secondSpace = input.indexOf(" ")+2;
		String operator = input.substring(firstSpace + 1,secondSpace);
		String firstOperand= input.substring(0 , firstSpace );
		int line1= firstOperand.indexOf("_");
		int dush1= firstOperand.indexOf("/");
		// (line1!=-1) {  // if there is number and fraction 
		String wholeFirst = firstOperand.substring(0, line1);
		String numeratorFirst = firstOperand.substring(line1+1, dush1);
		String denominatorFirst = firstOperand.substring(dush1+1, firstOperand.length());
		
		if(dush1!=-1) { // if there is no number before fraction 
			wholeFirst = "0";

		}  
		if(line1!=-1 & line1!=-1){     // if there is no fraction 
			numeratorFirst = "0";
			denominatorFirst ="1"; 
		}
		int whole1 = Integer.parseInt(wholeFirst);
		int numerator1 = Integer.parseInt(numeratorFirst);
		int denominator1 = Integer.parseInt(denominatorFirst);

		int newNumerator1= whole1 * denominator1 + numerator1;
		
		String secondOperand = input.substring(secondSpace+1, input.length()); 
		int line2= secondOperand.indexOf("_");
		int dush2= secondOperand.indexOf("/"); 
		String whole = secondOperand.substring(0, line2);
		String numerator = secondOperand.substring(line2+1, dush2);
		String denominator = secondOperand.substring(dush2+1, secondOperand.length());



		if(dush1!=-1) { // if there is no number before fraction 
			whole = "0";
		
		}

		if(line1!=-1 & line1!=-1){   // if there is no fraction 
			numerator = "0";
			denominator ="1"; 
		}
		
		int whole2 = Integer.parseInt(whole);
		int numerator2 = Integer.parseInt(numerator);
		int denominator2 = Integer.parseInt(denominator);
		
		System.out.println("Here");
		
		int newNumerator2 = whole2 * denominator2 + numerator2;
		int denominator3;
		int num1 ;
		int num2;
		String plus = "+";
		String minus = "-";
		String mult = "*";
		String divide = "/";
		int numerator3;
		int newNumerator3;
		
		if(operator !=minus && operator !=mult && operator !=divide) {
			denominator3= denominator2 * denominator1; //multiplying lower numbers
			 num1= denominator2 * newNumerator1;
			 num2 = denominator1 * newNumerator2;
				numerator3 = num1 + num2 ;
				System.out.println("Here1");
				
		}
		
		if(operator != "-" && operator !=mult && operator !=divide) {
		 denominator3= denominator2 * denominator1; //multiplying lower numbers
		 num1= denominator2 * newNumerator1;
		 num2 = denominator1 * newNumerator2;
			numerator3 = num1 + num2 ;
			System.out.println("Here2");
			}
		
		
		if(operator!= plus && operator !=mult && operator !=divide) {
		denominator3= denominator2 * denominator1; //multiplying lower numbers
			 num1= denominator2 * newNumerator1;
			 num2 = denominator1 * newNumerator2;
			numerator3 = num1 - num2 ;
			System.out.println("Here3");
			}
		
	
		if(operator!= minus && operator !=plus && operator !=divide) {
			denominator3= denominator2 * denominator1; //multiplying lower numbers
		    newNumerator3= newNumerator2 * newNumerator1;//multiplying top numbers
		    
		}
		
		if(operator!= minus && operator !=plus && operator !=mult) {
			int x = denominator2;
			int v = newNumerator2;
			newNumerator2 = x;
			denominator2 = v;
			denominator3= denominator2 * denominator1; //multiplying lower numbers
		    newNumerator3= newNumerator2 * newNumerator1;//multiplying top numbers
		  
		}
		
		
		String hey = "numerator3";
		return hey;
	 
	}	
}
