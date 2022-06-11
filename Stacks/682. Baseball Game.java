class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        
        for (int i = 0; i < ops.length; i++) {
            char c = ops[i].charAt(0);
            if (c == 'C') {
                sum -= stack.pop(); 
            } else if (c == 'D') {
                stack.push(2 * stack.peek());
                sum += stack.peek();
            } else if (c == '+') {
                int lastEle = stack.pop();
                int secondLastEle = stack.peek();
                stack.push(lastEle);
                stack.push(lastEle + secondLastEle);
                sum += stack.peek();
            } else {
                stack.push(Integer.parseInt(ops[i]));
                sum += stack.peek();
            }
        }
        return sum;
    }
}
