## 01. Minimum Sum Subarray

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/smallest-sum-contiguous-subarray/1)

### Problem Description

**Task:** Given an array arr[], find the minimum sum of a subarray containing atleast one element in the given array.Examples:Input: arr[] = [3, -4, 2, -3, -1, 7, -5]

#### Examples

##### Example 1

- **Output:**
```text
1
```
- **Explanation:** The subarray [1] has the minimum sum, which is 1.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-21 19:43:44
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
	public int minSubarraySum(int[] arr) {
		// code here
		int minSum = arr[0];
		int currSum = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
		    
			if (currSum > 0) currSum = arr[i];
			else currSum += arr[i];
			
			if (currSum < minSum) minSum = currSum;
		}
		
		return minSum;
	}
}
```

*Generated on: 10/21/2026, 7:44:16 PM*