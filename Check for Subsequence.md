## 01. Check for Subsequence

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/given-two-strings-find-if-first-string-is-a-subsequence-of-second/1)

### Problem Description

**Task:** Given two strings s1 and s2. You have to check that s1 is a subsequence of s2 or not. Note: A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements.

#### Examples

##### Example 1

- **Input:**
```text
s1 = "AXY", s2 = "YADXCP"
```
- **Output:**
```text
false
```
- **Explanation:** s1 is not a subsequence of s2 as 'Y' appears before 'A'.

##### Example 2

- **Input:**
```text
s1 = "gksrek", s2 = "geeksforgeeks"
```
- **Output:**
```text
true
```
- **Explanation:** If we combine the bold character of "geeksforgeeks", it equals to s1. So s1 is a subsequence of s2.

#### Constraints

- **1.** `1 ≤ s1.size(), s2.size() ≤ 10⁶`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-11-13 21:27:40
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public boolean isSubSeq(String s1, String s2) {
        int i = 0;
        int j = 0;

        while (i < s1.length() && j < s2.length()) {

            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s1.length();
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2025-10-04 11:24:39
- **Status:** Correct
- **Marks:** 1

```java
class Solution {
    public boolean decode(String S) {
        String str = "hello";
        int a = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == str.charAt(a)){
                a++;
                if( a == 5){
                    return true;
                }
            }
        }
        return false;
    }
}
```

*Generated on: 11/13/2026, 9:28:15 PM*