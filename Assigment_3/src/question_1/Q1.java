package question_1;

import java.util.Stack;

public class Q1 {
	
	public static int prefixEvaluation(String [] prefix) {
		Stack<Integer> st = new Stack<>();
		for(int i = prefix.length-1; i>=0; i--) {
			if(Character.isDigit(prefix[i].charAt(0)) || (prefix[i].length()>1 && prefix[i].charAt(0) == '-')) {
				st.push(Integer.parseInt(prefix[i]));
			} else {
				int val1 = st.pop();
				int val2 = st.pop();
				
				if(prefix[i].equals("+")) {
					st.push(val1 + val2);
				} else if(prefix[i].equals("-")) {
					st.push(val1 - val2);
				} else if(prefix[i].equals("*")) {
					st.push(val1 * val2);
				} else if(prefix[i].equals("/")) {
					st.push(val1/val2);
				} else if(prefix[i].equals("^")) {
					st.push(val1^val2);
				}
				
			}
		}
		return st.pop();
		
	}
	
	public static int postfixEvaluation(String[] postfix) {
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<postfix.length; i++) {
			if(Character.isDigit(postfix[i].charAt(0)) || (postfix[i].length() > 1 && postfix[i].charAt(0) == '-')) {
				st.push(Integer.parseInt(postfix[i]));
			} else {
				int val1 = st.pop();
				int val2 = st.pop();
				
				if(postfix[i].equals("+")) {
					st.push(val1 + val2);
				} else if(postfix[i].equals("-")) {
					st.push(val2 - val1);
				} else if(postfix[i].equals("*")) {
					st.push(val1 * val2);
				} else if(postfix[i].equals("/")) {
					st.push(val1/val2);
				} else if(postfix[i].equals("^")) {
					st.push(val1^val2);
				}
			}
		}
		return st.pop();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String prefix[] = {"+", "*", "/", "+", "100", "200", "2", "5", "7"};
		int ans = prefixEvaluation(prefix);
		
		
		System.out.println("Prefix: "  + ans);
		
		String postfix[] = {"200", "300", "100", "*", "+", "900", "-"};
		
		int ans1 = postfixEvaluation(postfix);
		
		System.out.println("Postfix: "  + ans1);

	}	
}
