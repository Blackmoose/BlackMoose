package com.blackmoose.pie.strings;

import java.util.Hashtable;

public class EvenBetterHashTableFindRepeatCharacter {

	private static String one = "four score and seven years ago.";
	private static String two = "in the beginning, God created the heavens and the earth!";
	
	private static Hashtable<String,Integer> htable1 = new Hashtable<String,Integer>();      
    
	
	public EvenBetterHashTableFindRepeatCharacter() {
		
	}
	
	public void saveForRepeat(String charToFind) {
		
		Integer i = htable1.get(charToFind);
		if ( i != null ) {
//			System.out.println(i + 1);
			htable1.put(charToFind, i + 1);
		} else {
			htable1.put(charToFind, 1);
		}
			
		
		
	}
	
	

	
	public void findFirstNonRepeat(String searchString) {
		Character nonRepeatChar = ' ' ;

		for ( int i = 0 ; i < searchString.length() ; i++){
			nonRepeatChar = searchString.charAt(i);
//			System.out.println(  nonRepeatChar  );
			saveForRepeat( Character.toString(nonRepeatChar));
		}
		for ( int i = 0 ; i < searchString.length() ; i++){
			nonRepeatChar = searchString.charAt(i);
			Integer ii = htable1.get(nonRepeatChar.toString());
//			System.out.println(ii);
			if ( ii != null) {
				if ( 1 == ii ) {
						System.out.println("The first not repeat is ..." + nonRepeatChar);
						break;
				}
				
			}
				
		}
		
		
		System.out.println("The first non repeat char is ...." + nonRepeatChar );
	}
	
	public static void main(String[] args) {
		EvenBetterHashTableFindRepeatCharacter sf = new EvenBetterHashTableFindRepeatCharacter();

		sf.findFirstNonRepeat(one);

		
		sf.findFirstNonRepeat(two);
		

	}

}
