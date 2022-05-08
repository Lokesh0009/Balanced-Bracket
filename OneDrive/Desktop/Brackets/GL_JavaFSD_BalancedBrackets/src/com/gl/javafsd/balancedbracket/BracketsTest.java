package com.gl.javafsd.balancedbracket;

public class BracketsTest {
	
	public static void main(String[] args) {
		
		test("{[()]}");
		test("{}");
		test("[[{}]]");

		
		test("{}");

		
		test("[]");
		test("[{}]");
		test("[<>]");
		test("[<<]");
		test("({[<>]})");
		test("M[MW]W");
		test("M[]");
		test("[<>");
		
	}
	
	private static void test(String brackets) {
			
		BracketChecker checker = new BracketChecker(brackets);
		boolean result = checker.check();
		
		if (result) {
			System.out.println("Bracket expression '" + brackets + "' is balanced");			
		}
		else {
			System.out.println("Bracket expression '" + brackets + "' is NOT balanced");
		}		
	}

}
