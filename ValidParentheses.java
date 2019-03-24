/*Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:
Input: "()"
Output: true

Example 2:
Input: "()[]{}"
Output: true*/
 
package validparentheses;

import java.util.Stack;


public class ValidParentheses {

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }
            else if(!stack.isEmpty() && c == '}' && stack.peek() == '{'){
                stack.pop();
            }else if(!stack.isEmpty() && c == ']' && stack.peek() == '['){
                stack.pop();
            }else if(!stack.isEmpty() && c == ')' && stack.peek() == '('){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()[]{";
        boolean result = isValid(s);
        System.out.println(result);
    }
    
}
