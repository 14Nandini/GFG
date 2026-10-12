## 01. Power of 2

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/power-of-2-1587115620/1)

### Problem Description

**Task:** Given a non-negative integer n, return true if it is a power of 2. Otherwise, return false. Examples:Input: n = 8

#### Examples

##### Example 1

- **Output:**
```text
true
```
- **Explanation:** 1 is equal to 2 raised to 0 (2⁰ = 1).

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(1)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-12 21:24:45
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
	public boolean isPowerofTwo(int n) {
		// code here
		int res = 0;
		String s1 = "";
		while (n != 0) {
			res = n%2;
			n /= 2;
			s1 += res;
		}
		int c = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == '1')
				c++;
		}
		if (c == 1) return true;
		else return false;
	}
}
```

*Generated on: 10/12/2026, 9:26:08 PM*