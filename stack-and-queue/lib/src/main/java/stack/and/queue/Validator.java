package stack.and.queue;

public class Validator {
    public boolean validateBrackets(String str){
        char[] stringArr=str.toCharArray();
        Stack<Character> validatorStack=new Stack<>();
        for (char el : stringArr) {
            if (el == '{' || el == '[' || el == '(') {
                validatorStack.push(el);
            } else if (el == '}' || el == ']' || el == ')') {
                if (validatorStack.isEmpty()) {
                    return false;
                } else if (el == '}' && validatorStack.peek() != '{') {
                    return false;
                } else if (el == ']' && validatorStack.peek() != '[') {
                    return false;
                } else if (el == ')' && validatorStack.peek() != '(') {
                    return false;
                } else {
                    validatorStack.pop();
                }
            }
        }


        return validatorStack.isEmpty();
    }
}
