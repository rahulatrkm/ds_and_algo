# String to Integer (atoi)
---
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).

The algorithm for myAtoi(string s) is as follows:

Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.  
Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).   
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.   
Return the integer as the final result.
Note:

Only the space character ' ' is considered a whitespace character.
Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 
```
Example 1:

Input: s = "42"  
Output: 42  
Explanation: The underlined characters are what is read in, the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
           ^
The parsed integer is 42.
Since 42 is in the range [-231, 231 - 1], the final result is 42.
```
```
Example 2:

Input: s = "   -42"
Output: -42
Explanation:
Step 1: "   -42" (leading whitespace is read and ignored)
            ^
Step 2: "   -42" ('-' is read, so the result should be negative)
             ^
Step 3: "   -42" ("42" is read in)
               ^
The parsed integer is -42.
Since -42 is in the range [-231, 231 - 1], the final result is -42.
```
```
Example 3:

Input: s = "4193 with words"
Output: 4193
Explanation:
Step 1: "4193 with words" (no characters read because there is no leading whitespace)
         ^
Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
             ^
The parsed integer is 4193.
Since 4193 is in the range [-231, 231 - 1], the final result is 4193.
```
 
```
Constraints:

0 <= s.length <= 200
s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
```

# Solution
```
class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        int result = 0;
        int index = 0;
        int n = s.length();
        while(index<n && s.charAt(index)==' '){
            index++;
        }
        if(index< n && s.charAt(index)=='+'){
            sign = 1;
            index++;
        }
        else if(index<n && s.charAt(index)=='-'){
            sign = -1;
            index++;
        }
        // The java.lang.Character.isDigit(char ch) is an inbuilt method in java which determines whether a specified character is a digit or not. There are few conditions that a character must accomplish to be accepted as a digit.
        while(index < n && Character.isDigit(s.charAt(index))){
            int digit = s.charAt(index)-'0';
            
            if((result>Integer.MAX_VALUE/10)||(result==Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10)){
                return sign ==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
        
        
        result = 10*result+digit;
        index++;
        
    }
    return sign * result;
}
}
```

# Algorithm
```
1. Initialize two variables:
- sign (to store the sign of the final result) as 1.
- result (to store the 32-bit integer result) as 0.

2. Skip all leading whitespaces in the input string.

3. Check if the current character is a '+' or '-' sign:

- If there is no symbol or the current character is '+', keep sign equal to 1.
- Otherwise, if the current character is '-', change sign to -1.

4. Iterate over the characters in the string as long as the current character represents a digit or until we reach the end of the input string.

- Before appending the currently selected digit, check if the 32-bit signed integer range is violated. If it is violated, then return INT_MAX or INT_MIN as appropriate.

- Otherwise, if appending the digit does not result in overflow/underflow, append the current digit to the result.
Return the final result with its respective sign, sign * result.
```