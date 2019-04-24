/*A valid parentheses string is either empty (""), "(" + A + ")", or A + B, 
where A and B are valid parentheses strings, and + represents string concatenation.  
For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
A valid parentheses string S is primitive if it is nonempty, and 
there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.
Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, 
where P_i are primitive valid parentheses strings.
Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.

Example 1:
Input: "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".*/

package removeoutermostparantheses;

public class RemoveOuterMostParantheses {

     /*Explanation: opened count the number of opened parenthesis.
        Add every char to the result unless the first left parenthesis,
        and the last right parenthesis.*/
    public static String removeOuterMostParantheses(String S){
        StringBuilder sb = new StringBuilder();
        int opened = 0;
        
        for(char c : S.toCharArray()){
            if(c == '('){
                if(opened > 0){
                    sb.append(c);
                }
                opened++;
            }
            if(c == ')'){
                if(opened > 1){
                    sb.append(c);
                }
                opened--;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String input = "(()())(())";
        String output = removeOuterMostParantheses(input);
        System.out.println(output);
        
        
    }
    
}
