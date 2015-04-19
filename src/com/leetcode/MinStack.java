package com.leetcode;

import java.util.Stack;

public class MinStack {

	int min = Integer.MAX_VALUE;
    Stack<Integer> minStack = new Stack<Integer>();
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        stack.push(x);
        if(x<min){
            min = x;
        }
        minStack.push(min);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
        if(minStack.isEmpty())
        	min = Integer.MAX_VALUE;
        else
            min = minStack.peek();
    }

    public int top() {
    	System.out.println(stack.peek());
        return stack.peek();
    }

    public int getMin() {
    	System.out.println(minStack.peek());
        return minStack.peek();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack ms = new MinStack();
		ms.push(2147483646);
		ms.push(2147483646);
		ms.push(2147483647);
		ms.top();
		ms.pop();
		ms.getMin();
		ms.pop();
		ms.getMin();
		ms.pop();
		ms.push(2147483647);
		ms.top();
		ms.getMin();
		ms.push(-2147483648);
		ms.top();
		ms.getMin();
		ms.pop();
		ms.getMin();
	}

}
