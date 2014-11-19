package edu.lmu.cmsi.gabriel.recursionandstacks.recursivestringtoint;

public class RecursiveStringToInt {
	public static int convert (String input){
		if (input.equals("")){
			return 0;
		}
	
		int rootNum = Character.getNumericValue( input.charAt(input.length()-1) );
		return rootNum + 10 * convert(input.substring(0, input.length() > 1 ? input.length() - 1 : 0));
	}
}