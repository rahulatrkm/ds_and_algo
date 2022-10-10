 # Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without repeating characters.

 
```
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

```
```
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```
```
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

```

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
```

---
 
# Solution
An optimized approach. We start traversing the string from left to right and maintain track of:

- the current substring with non-repeating characters with the help of a start and end index
- the longest non-repeating substring output
- a lookup table of already visited characters
```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>mymap = new HashMap<>();
        int left =0,right = 0;
        int n = s.length();
        int len = 0;
        while(right<n){
            if(mymap.containsKey(s.charAt(right)))
                left = Math.max(mymap.get(s.charAt(right))+1,left);
                
            mymap.put(s.charAt(right),right);
            len = Math.max(len,right - left+1);
            right++;
        }
        return len;
    }
}
```