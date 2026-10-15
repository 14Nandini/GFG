## 01. Distinct-Digit Numbers in Range

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/unique-numbers3019/1)

### Problem Description

**Task:** Given two positive integers l and r, find all numbers in the range [l, r] whose digits are all distinct, with no digit repeated. return them in ascending order.

#### Examples

##### Example 1

- **Input:**
```text
l = 10, r = 20
```
- **Output:**
```text
[10, 12, 13, 14, 15, 16, 17, 18, 19, 20]
```
- **Explanation:** Every number from 10 to 20 has all distinct digits, except 11, since its digit 1 repeats. so 11 is excluded from the result.

##### Example 2

- **Input:**
```text
l = 1, r = 9
```
- **Output:**
```text
[1, 2, 3, 4, 5, 6, 7, 8, 9]
```
- **Explanation:** Every number from 1 to 9 is a single digit, so each one trivially has all distinct digits. none are excluded.

#### Constraints

- **1.** `1 ≤ l ≤ r ≤ 10⁵`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O((r - l) * d)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-15 21:46:04
- **Status:** Correct
- **Marks:** 1

```java
class solution {
	ArrayList<Integer> uniqueNumbers(int l, int r) {
		// code here
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = l; i <= r; i++) { 
			boolean isUnique = true; 
			boolean[] seen = new boolean[10]; 
			
			if (i == 0) {
				list.add(i);
				continue;
			}
			
			int num = i;
			while (num > 0) {
				int digit = num % 10; 
				
				if (seen[digit]) {
					isUnique = false;
					break;
				}
				
				seen[digit] = true; 
				num /= 10; 
			}
			
			if (isUnique) list.add(i); 
		}
		
		return list;
	}
}
```

*Generated on: 10/15/2026, 9:49:29 PM*