## 01. Last Index of Character

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/last-index-of-a-character-in-the-string4516/1)

### Problem Description

**Task:** Given a string s of size n and a character c, find the last index (0-based indexing) of c in s. If the character is not present, return -1. Both s and c contain only lowercase and uppercase English alphabets.Examples:Input: s = "Geeks", c = 'e'

#### Examples

##### Example 1

- **Output:**
```text
2
```
- **Explanation:** The last occurrence of 'e' is at index 2.

##### Example 2

- **Input:**
```text
s = "okiyh", c = 'z'
```
- **Output:**
```text
-1
```
- **Explanation:** The character 'z' is not present in the string.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-11-05 11:15:17
- **Status:** Correct
- **Marks:** 1

```java
class Solution {
	int lastIndex(String s, char c) {
		// code here
		int indx = -1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) indx = i;
		}
		return indx;
	}
}
```

*Generated on: 11/5/2026, 11:16:44 AM*