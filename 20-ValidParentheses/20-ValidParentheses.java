// Last updated: 7/14/2026, 2:15:33 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='[' || c=='{' || c=='('){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(c==']' && top!='['){
                    return false;
                }
                if(c=='}' && top!='{'){
                    return false;
                }
                if(c==')' && top!='('){
                    return false;
                }
            }
        }
        return stack.isEmpty();  
    }
}