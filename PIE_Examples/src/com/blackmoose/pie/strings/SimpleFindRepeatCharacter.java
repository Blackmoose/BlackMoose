package com.blackmoose.pie.strings;

public class SimpleFindRepeatCharacter {

	private static String one = "four score and seven years ago.";
	private static String two = "in the beginning, God created the heavens and the earth!";
	
	
	public SimpleFindRepeatCharacter() {
		
	}
	
	public Boolean searchForRepeat(String searchString, String charToFind, Integer index) {
	   
		return searchString.substring(index, searchString.length()).contains(charToFind);
		
		
		
	}
	
	

	
	public void findFirstNonRepeat(String searchString) {
		Character nonRepeatChar = ' ' ;

		for ( int i = 0 ; i < searchString.length() ; i++){
			nonRepeatChar = searchString.charAt(i);
			System.out.println(  nonRepeatChar  );
			if ( searchForRepeat(searchString, Character.toString(nonRepeatChar) , i + 1 ) ) {
				
			} else {
				break;
			}
		}
		
		System.out.println("The first non repeat char is ...." + nonRepeatChar );
	}
	
	public static void main(String[] args) {
		SimpleFindRepeatCharacter sf = new SimpleFindRepeatCharacter();
		
		
		sf.findFirstNonRepeat(two);
		

	}

}
