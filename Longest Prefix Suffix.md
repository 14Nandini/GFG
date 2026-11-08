## 01. Longest Prefix Suffix

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/longest-prefix-suffix2527/1)

### Problem Description

**Task:** Given a string s, of lowercase english alphabets, find the length of the longest proper prefix which is also a suffix.Note: Prefix and suffix can be overlapping but they should not be equal to the entire string.Examples :Input: s = "abab"

#### Examples

##### Example 1

- **Output:**
```text
3
```
- **Explanation:** "aaa" is the longest prefix and suffix.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-11-08 22:23:09
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    int getLPSLength(String s) {
        
        int n=s.length();
        int p=0;
        int su=1;
        int count=0;
        int pos=1;
        while(p<n && su<n){
            if(s.charAt(p)==s.charAt(su)){
                p++;
                su++;
                count++;
            }
            else{
                p=0;
                count=0;
                pos++;
                su=pos;
            }
        }
        return count;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-05-05 19:39:31
- **Status:** Correct
- **Marks:** 8

```java
class Solution {
    int getLPSLength(String s) {
        
        int n=s.length();
        int p=0;
        int su=1;
        int count=0;
        int pos=1;
        while(p<n && su<n){
            if(s.charAt(p)==s.charAt(su)){
                p++;
                su++;
                count++;
            }
            else{
                p=0;
                count=0;
                pos++;
                su=pos;
            }
        }
        return count;
    }
}
```

*Generated on: 11/8/2026, 10:23:37 PM*