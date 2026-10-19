## 01. Closest to n and Divisible by m

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/closest-number5728/1)

### Problem Description

**Task:** Given two integers n and m (m ! = 0). The problem is to find the number closest to n and divisible by m. If there is more than one such number, then output the one having the maximum absolute value.

#### Examples

##### Example 1

- **Input:**
```text
n = 13, m = 4
```
- **Output:**
```text
12
```
- **Explanation:** 12 is the Closest Number to 13 which is divisible by 4.

##### Example 2

- **Input:**
```text
n = -15, m = 6
```
- **Output:**
```text
-18
```
- **Explanation:** Both -12 and -18 are closest to -15 and divisible by 6, but -18 has the maximum absolute value. So, output is -18.

#### Constraints

- **1.** `-10⁵ ≤ n, m ≤ 10⁵`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(1)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-19 12:42:39
- **Status:** Correct
- **Marks:** 1

```java
class Solution {
	static int closestNumber(int n, int m) {
		// code here
		int q = n/m;
		int a = q*m;
		int b;
		if (n*m>0)
			b = (q + 1)*m;
		else
			b = (q - 1)*m;
		int d1 = Math.abs(n - a);
		int d2 = Math.abs(n - b);
		if (d1<d2)
			return a;
		else if (d2<d1)
			return b;
		else
			return Math.abs(a)>Math.abs(b)?a:b;
	}
}
```

*Generated on: 10/19/2026, 12:44:08 PM*