package JavaBasicPrograms;

import java.util.Stack;

public class ValidateParenthesisWithAllTypeOfBrackets {
	
	
	public static boolean isValidParenthesis(String input) {
	char[] charArray = input.toCharArray();
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			
			if(charArray[i] == '{' ||charArray[i] == '(' ||charArray[i] == '[' ) {
				stack.push(charArray[i]);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				
				Character pop = stack.peek();
				if( charArray[i] == '}' && pop=='{' || charArray[i] == ']' && pop=='[' ||charArray[i] == ')' && pop=='(') {
					stack.pop();
				}
				
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
		
		String brackets = "{{()[[]]}}";
		
		boolean validParenthesis = isValidParenthesis(brackets);
		
		System.out.println(validParenthesis);
	
		
		
	}

}
