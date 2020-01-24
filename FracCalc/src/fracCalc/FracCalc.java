package fracCalc;
import java.util.Scanner;

public class FracCalc {

	public static void main(String[] args)  {
		// TODO: Read the input from the user and call produceAnswer with an equation
		Scanner userInput = new Scanner(System.in);	

		//sg
		System.out.println("Please enter the equation you would like to solve:");
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

		String wholeFirst;
		String numeratorFirst;
		String denominatorFirst;

		// if line1 didn't find an underscore, handle that scenario
		// otherwise, we'll get an index out of range when we try to do substring
		if ((line1 > -1) && (dush1 > -1)){
			// if there is number and fraction 
			wholeFirst = firstOperand.substring(0, line1);
			numeratorFirst = firstOperand.substring(line1+1, dush1);
			//denominatorFirst = firstOperand.substring(dush1+1, firstOperand.length());
			denominatorFirst = firstOperand.substring(dush1+1, firstSpace);

		} else if(dush1 >=1) { 
			// if there is no number before fraction 
			wholeFirst = "0";
			//what would numerator and denominator be here?
			numeratorFirst = firstOperand.substring(0, dush1);
			//denominatorFirst = firstOperand.substring(dush1+1, firstOperand.length());
			denominatorFirst = firstOperand.substring(dush1+1, firstSpace);
		} else 

		{
			// if there is no fraction 
			numeratorFirst = "0";
			denominatorFirst ="1"; 
			//what should wholeFirst be in this scenario?
			wholeFirst = firstOperand;


		}  


		// as a checkpoint, let's print out the values we've figured out so far
		System.out.println("wholeFirst is:" + wholeFirst);
		System.out.println("numeratorFirst is:" + numeratorFirst);
		System.out.println("denominatorFirst is:" + denominatorFirst);
		System.out.println("operator is:" + operator);

		// convert to int
		int whole1 = Integer.parseInt(wholeFirst);
		int numerator1 = Integer.parseInt(numeratorFirst);
		int denominator1 = Integer.parseInt(denominatorFirst);

		int newNumerator1= whole1 * denominator1 + numerator1;

		//String secondOperand = input.substring(secondSpace+1, input.length()); 
		String secondOperand = input.substring(secondSpace+1, input.length()); 

		//checkpoint - do we have the right second operand?
		System.out.println("Second operand is:" + secondOperand);
		int line2= secondOperand.indexOf("_");
		int dush2= secondOperand.indexOf("/"); 
		String whole ;
		String numerator;
		String denominator;


		// if line2 didn't find an underscore, handle that scenario
		// otherwise, we'll get an index out of range when we try to do substring
		if ((line2 >= 1) && (dush2 >=1)){
			// if there is number and fraction 
			whole = secondOperand.substring(0, line2);
			numerator = secondOperand.substring(line2+1, dush2);
			denominator = secondOperand.substring(dush2+1, secondOperand.length());

		} else if(dush2 >=1) { 
			// if there is no number before fraction 
			whole = "0";
			//what would numerator and denominator be here?
			numerator = secondOperand.substring(line2+1, dush2);
			//denominatorFirst = firstOperand.substring(dush1+1, firstOperand.length());
			denominator = secondOperand.substring(dush2+1, secondOperand.length());
		} else 

		{
			// if there is no fraction 
			numerator = "0";
			denominator ="1"; 
			//what should wholeFirst be in this scenario?
			whole = secondOperand;


		}  


		// as a checkpoint, let's print out the values we've figured out so far
		System.out.println("whole is:" + whole);
		System.out.println("numerator is:" + numerator);
		System.out.println("denominator is:" + denominator);



		int whole2 = Integer.parseInt(whole);
		int numerator2 = Integer.parseInt(numerator);
		int denominator2 = Integer.parseInt(denominator);



		int newNumerator2 = whole2 * denominator2 + numerator2;
		int denominator3 = 1;
		int num1 ;
		int num2;
		int numerator3 = 0;
		int newNumerator3;

		// do the math
		
	
		if (operator.equals("+")) {
			// addition
			System.out.println("preparing to perform an addition operation");
			//while(operator !=minus && operator !=mult && operator !=divide) {
			denominator3= denominator2 * denominator1; //multiplying lower numbers
			num1= denominator2 * newNumerator1;
			num2 = denominator1 * newNumerator2;
			numerator3 = num1 + num2 ;
			
			
			
		} else 

		//while(operator != "-" && operator !=mult && operator !=divide) {
		if (operator.equals("-")) {
			// subtraction
			System.out.println("preparing to perform a subtraction operation");
			//while(operator!= plus && operator !=mult && operator !=divide) {
			denominator3= denominator2 * denominator1; //multiplying lower numbers
			num1= denominator2 * newNumerator1;
			num2 = denominator1 * newNumerator2;
			numerator3 = num1 - num2 ;
			
		} else 

		if (operator.equals("*")) {
			// multiplication
			System.out.println("preparing to perform an multiplication operation");
			//while(operator!= minus && operator !=plus && operator !=divide) {
			denominator3= denominator2 * denominator1; //multiplying lower numbers
			numerator3= newNumerator2 * newNumerator1;//multiplying top numbers
			
		} else 

		//while(operator!= minus && operator !=plus && operator !=mult) {
		if (operator.equals("/")) {
			//division
			System.out.println("preparing to perform a division operation");
			int x = denominator2;
			int v = newNumerator2;
			newNumerator2 = x;
			denominator2 = v;
			denominator3= denominator2 * denominator1; //multiplying lower numbers
			numerator3= newNumerator2 * newNumerator1;//multiplying top numbers
			
		} else {
			//couldn't find a valid operator
			//should we set anything to zero?
			
		}


		//String hey = "numerator3";
		
		int totalNum = numerator3;
		int totalDen = denominator3;
		
		  // improper -> mixed fraction
        boolean isNegative = (totalNum < 0);
        int wholeFinal = Math.abs(totalNum) / totalDen;
        totalNum = Math.abs(totalNum) % totalDen;
        
        // Put the negative sign where it belongs
        if (isNegative)
        {
            if (wholeFinal == 0)
                totalNum *= -1;
            else
                wholeFinal *= -1;
                
        }
        // Reduced improper fraction
        int gcd = getGcd(totalNum, totalDen);
        totalNum /= gcd;
        totalDen /= gcd;
        
        
        // Construct answer!
        String answer = "";
        
        // Whole number portion
        if (wholeFinal == 0)
        {
            if (totalNum == 0)
            {
                return "0";
            }
        }
        else
        {
            // Whole is nonzero.  Print it, and maybe an underscore
            answer += wholeFinal;
            if (totalNum == 0)
            {
                // No fractional part, so we're done
                return answer;
            }
            else
            {
                // There is a fractional part, so print the _
                answer += "_";
            }
        }
        
        // If we're still here, there's a fractional portion
        answer += totalNum + "/" + totalDen;
        return answer;
        

	}	

		// given to ints, return the greatest common denominator
	   static public int getGcd(int a, int b)
	    {
	        a = Math.abs(a);
	        b = Math.abs(b);
	        for (int g = a; g >= 2; g--)
	        {
	            if (((a % g) == 0) &&
	                ((b % g) == 0))
	            {
	                return g;
	            }
	        }
	        
	        return 1;
	    }
}
