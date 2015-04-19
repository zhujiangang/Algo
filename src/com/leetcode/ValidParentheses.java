package com.leetcode;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()"));
	}

	public static boolean match(String left, String right){
		if(left==null || right==null)
			return false;
		if(left.equals("(") && right.equals(")"))
			return true;
		else if(left.equals("[") && right.equals("]"))
			return true;
		else if(left.equals("{") && right.equals("}"))
			return true;
		else return false;
	}
	public static boolean isValid(String s) {
		Stack<String> stack = new Stack<String>();
		for(int i=0; i<s.length(); i++){
			StringBuilder sb = new StringBuilder();
			sb.append(s.charAt(i));
			if(stack.isEmpty())
				stack.push(sb.toString());
			else{
				String top = stack.peek();
				if(match(top,sb.toString()))
					stack.pop();
				else
					stack.push(sb.toString());
			}
		}
		if(stack.isEmpty())
			return true;
		else
			return false;
	}

}
