## 01. Median of Array

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/find-the-median0527/1)

### Problem Description

**Task:** Given an array arr[] of integers, calculate the median.Examples:Input: arr[] = [90, 100, 78, 89, 67]

#### Examples

##### Example 1

- **Output:**
```text
89
```
- **Explanation:** After sorting the array middle element is the median

##### Example 2

- **Input:**
```text
arr[] = [56, 67, 30, 79]
```
- **Output:**
```text
61.5
```
- **Explanation:** In case of even number of elements, average of two middle elements is the median. Input: arr[] = [1, 2]Output: 1.5Explanation: The average of both elements will result in 1.5.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n log n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-16 20:09:53
- **Status:** Correct
- **Marks:** 1

```java
class Solution {
	public double findMedian(int[] arr) {
		// Code here.
		Arrays.sort(arr);
		int n = arr.length;
		if (n % 2 != 0) {
			return arr[n / 2];
		}
		else {
			return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
		}
	}
}
```

*Generated on: 10/16/2026, 8:10:34 PM*