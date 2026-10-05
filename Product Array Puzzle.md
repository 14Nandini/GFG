## 01. Product Array Puzzle

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1)

### Problem Description

**Task:** Given an array, arr[], construct a product array, res[] where each element in res[i] is the product of all elements in arr[] except arr[i]. Return this resultant array, res[].Note: Each element is res[] lies inside the 32-bit integer range.Examples:Input: arr[] = [10, 3, 5, 6, 2]

#### Examples

##### Example 1

- **Output:**
```text
[180, 600, 360, 300, 900]
```
- **Explanation:** For i = 0, res[i] = 3 * 5 * 6 * 2 is 180. For i = 1, res[i] = 10 * 5 * 6 * 2 is 600. For i = 2, res[i] = 10 * 3 * 6 * 2 is 360. For i = 3, res[i] = 10 * 3 * 5 * 2 is 300. For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.

##### Example 2

- **Input:**
```text
arr[] = [12, 0]
```
- **Output:**
```text
[0, 12]Explanation: For i = 0, res[i] is 0.For i = 1, res[i] is 12.
```

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-05 19:33:50
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
	public static int[] productExceptSelf(int arr[]) {
		// code here
		int n = arr.length;
		int[] ans = new int[n];
		ans[0] = 1;
		
		for (int i = 1; i<n; i++) {
			ans[i] = ans[i - 1] * arr[i - 1];
		}
		
		int suffix = 1;
		
		for (int j = n - 1; j >= 0; j--) {
			ans[j] *= suffix;
			suffix *= arr[j];
		}
		
		return ans;
	}
}
```

*Generated on: 10/5/2026, 7:44:41 PM*