class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();
        for(String i : tokens){
            if("+/*-".contains(i)){
                int a = stack.pop();
                int b = stack.pop();
                if (i.equals("+")) {
                    stack.push(b + a); 
                } else if (i.equals("-")) {
                    stack.push(b - a); 
                } else if (i.equals("*")) {
                    stack.push(b * a);
                } else if (i.equals("/")) {
                    stack.push(b / a);
                }
            }else{
                stack.push(Integer.parseInt(i));
            }
        }
        return stack.pop();
    }
}