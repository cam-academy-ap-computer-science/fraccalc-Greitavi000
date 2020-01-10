package fracCalc;
import java.util.Scanner;

public class FracCalc {

	public static void main(String[] args)  {
		// TODO: Read the input from the user and call produceAnswer with an equation
		Scanner userInput = new Scanner(System.in);	
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
		if (line1!=-1) {  // if there is number and fraction 
			String wholeFirst = firstOperand.substring(0, line1);
			String numeratorFirst = firstOperand.substring(line1+1, dush1);
			String denominatorFirst = firstOperand.substring(dush1+1, firstOperand.length());
			String answerFirst1= "whole:"+wholeFirst+ " numerator:"+ numeratorFirst +" denominator:"+ denominatorFirst;
			//return answerFirst1 ;
		}

		if (dush1!=-1) { // if there is no number before fraction 
			String wholeFirst2 = "0";
			String numeratorFirst2 = firstOperand.substring(0, dush1);
			String denominatorFirst2 = firstOperand.substring(dush1+1, firstOperand.length()); 
			String answerFirst2="whole:"+wholeFirst2+ " numerator:"+ numeratorFirst2 +" denominator:"+ denominatorFirst2;
			//return answerFirst2 ;

		}  else {     // if there is no fraction 
			String wholeFirst3 = firstOperand.substring(0, firstOperand.length());
			String numeratorFirst3 = "0";
			String denominatorFirst3 ="1"; 
			String answerFirst3 ="whole:"+wholeFirst3+ " numerator:"+ numeratorFirst3 +" denominator:"+ denominatorFirst3;
			//return answerFirst3 ;
		}

		String secondOperand = input.substring(secondSpace+1, input.length()); 
		int line2= secondOperand.indexOf("_");
		int dush2= secondOperand.indexOf("/");
		if (line2!=-1) {  // if there is number and fraction 
			String whole = secondOperand.substring(0, line2);
			String numerator = secondOperand.substring(line2+1, dush2);
			String denominator = secondOperand.substring(dush2+1, secondOperand.length());
			String answer1="whole:"+whole+ " numerator:"+ numerator +" denominator:"+ denominator;
			return answer1 ;
		}

		if (dush2!=-1) { // if there is no number before fraction 
			String whole2 = "0";
			String numerator2 = secondOperand.substring(0, dush2);
			String denominator2 = secondOperand.substring(dush2+1, secondOperand.length()); 
			String answer2="whole:"+whole2+ " numerator:"+ numerator2 +" denominator:"+ denominator2;
			return answer2 ;

		}  else {     // if there is no fraction 
			String whole3 = secondOperand.substring(0, secondOperand.length());
			String numerator3 = "0";
			String denominator3 ="1"; 
			String answer3 ="whole:"+whole3+ " numerator:"+ numerator3 +" denominator:"+ denominator3;
			return answer3 ;

		}

	}
}
