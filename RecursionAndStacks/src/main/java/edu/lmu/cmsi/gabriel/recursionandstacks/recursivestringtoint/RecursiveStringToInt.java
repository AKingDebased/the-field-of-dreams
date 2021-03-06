package edu.lmu.cmsi.gabriel.recursionandstacks.recursivestringtoint;

public class RecursiveStringToInt {
	public static int stringToInt (String input){
		if (input.equals("")){
			return 0;
		}
	
		int startingNumber = Character.getNumericValue( input.charAt(input.length()-1) );
		return startingNumber + 10 * stringToInt(input.substring(0, input.length() > 1 ? input.length() - 1 : 0));
	}
}
