class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> brackets = Map.of(')','(','}','{',']','[');

        for(char c: s.toCharArray()) {
            if(brackets.containsKey(c)) {
                if(!stack.isEmpty() && stack.peek()== brackets.get(c)){
                    stack.pop();
                }else {
                    return false;
                }
            }else{
                stack.add(c);
            }
        }
        return stack.isEmpty();
    } 
}
