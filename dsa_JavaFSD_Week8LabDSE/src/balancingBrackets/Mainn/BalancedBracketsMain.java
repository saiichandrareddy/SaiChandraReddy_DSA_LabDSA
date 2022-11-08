package balancingBrackets.Mainn;

import balancingBrackets.Logicc.BalancedBracketsChecker;

public class BalancedBracketsMain {

	public static void main(String[] args) {
			test("([[{}]])");		
			test("([[{}]]))");
	}
	static void test(String brackets) {
		
		BalancedBracketsChecker checker = new BalancedBracketsChecker(
			brackets);
		boolean result = checker.check();
		if (result) {
			System.out.println("The entered String has Balanced Brackets");
		}else {
			System.out.println("The entered String do not contain Balanced Brackets");			
		}		
	}
}
