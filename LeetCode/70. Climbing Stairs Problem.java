// Intuition
// When solving this problem, it becomes apparent that each step can be reached by either taking one step from the previous stair or two steps from the stair before that. This leads to a recurrence relation similar to the Fibonacci sequence. We can leverage this observation to calculate the number of ways to climb the stairs.

// Approach
// Recognize that the number of ways to climb n stairs can be derived from the number of ways to climb n-1 and n-2 stairs.
// Use two variables to keep track of the number of ways to climb the last two steps.
// Start with base cases for n = 1 and n = 2, which are 1 and 2 respectively.
// Iterate from 3 to n, calculating the current number of ways as the sum of the previous two.
// Return the last calculated value, which represents the number of ways to climb n stairs.

// Complexity
// Time complexity:
// O(n): A single loop runs from 3 to n, performing constant-time operations in each iteration.

// Space complexity:
// O(1): Only a fixed amount of extra space is used to store two variables for the previous results.

Code
class Solution {
    public int climbStairs(int n) {
       if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        int prev1 = 1;
        int prev2 = 2;

        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return prev2;  
    }
}
