class Solution {
    public boolean isHappy(int n) {
        // HashSet<Integer> visit = new HashSet<>();
        // while( !visit.contains(n)) {
        //     visit.add(n);
        //     n = sumOfSquares(n);
        //     if(n == 1) return true;
        // }
        // return false;
        int slow = n, fast = sumOfSquares(n);
        while(slow != fast) {
            fast = sumOfSquares(sumOfSquares(fast));
            slow = sumOfSquares(slow);
        }
        return slow == 1;
    }

    private int sumOfSquares(int n) {
        int output = 0;
        while (n > 0) {
            int digit = n % 10;
            digit = digit * digit;
            output += digit;
            n = n / 10;
        }
        return output;
    }
}
