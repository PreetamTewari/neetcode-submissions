class Solution {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();
        Map<Character, Character> brackets = Map.of('(', ')','{','}','[',']');

        for(char c: s.toCharArray()) {
            if(brackets.containsKey(c)) {
                stack.add(c);
            }else {
                if(stack.isEmpty()) return false;

                char pop = stack.removeLast();
                if(brackets.get(pop) != c) return false; 
            }
        }
        return stack.isEmpty();
    }
}
