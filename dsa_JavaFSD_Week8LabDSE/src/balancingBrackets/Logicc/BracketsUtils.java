package balancingBrackets.Logicc;

import java.util.HashSet;
import java.util.Set;

public class BracketsUtils {

	static Set<BracketPair> bracketPairSet = new HashSet<>();
	
	static {
		
		BracketPair one = new BracketPair('(', ')');
		BracketPair two = new BracketPair('[', ']');
		BracketPair three = new BracketPair('{', '}');
//		BracketPair four = new BracketPair('M', 'W'); when we need to add extra characters
		
		bracketPairSet.add(one);
		bracketPairSet.add(two);
		bracketPairSet.add(three);
		
	}
	
	static BracketPair getBracketPair(Character closeBracketChar){
	
		for (BracketPair aBracketPair : bracketPairSet) {
			
			if (aBracketPair.getCloseChar().equals(closeBracketChar)) {
				
				return aBracketPair;
			}
		}
		return null;
	}
	
	static Set<Character> getOpenBrackets(){

		Set<Character> results = new HashSet<>();
		
		for (BracketPair aBracketPair : bracketPairSet) {
			
			results.add(aBracketPair.getOpenChar());
			
		}
		return results;

	}

	static Set<Character> getCloseBrackets(){

		Set<Character> results = new HashSet<>();
		
		for (BracketPair aBracketPair : bracketPairSet) {			
			results.add(aBracketPair.getCloseChar());			
		}
		return results;

	}

}