/*
Palindrome Number

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1

*/

class Solution {
    public boolean isPalindrome(int x) {
        int rx = 0;
        int t = x;
        while(t>0){
            rx = (rx*10)+(t%10);
            t /= 10;
        }
        if(x == rx){
            return true;
        } else {
            return false;
        }
        
    }
}
