package basica;

public class Days {

	public static void main(String[] args) {
		// Execute different block of code based on the value of the condition
		
		String dayOfWeek = "Tuesday";
		
		// For specific for case or rote to just one variable
		switch (dayOfWeek) {
			case "Monday" : 
				System.out.println("Today is Monday");
				// it will not execute the all commands BELOW if find the correct condition
				// and if you need only execute one case and then you need to use add BREAK statement
				break; 
			case "Tuesday" : 
				System.out.println("Today is Tuesday");
				break;
			case "Wednesday" : 
				System.out.println("Today is Wednesday");
				break;
			case "Thursday" : 
				System.out.println("Today is Thursday");
				break;
			case "Friday" : 
				System.out.println("Today is Friday");
				break;		
		
		}

	}

}
