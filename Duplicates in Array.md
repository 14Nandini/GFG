## 01. Duplicates in Array

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/unordered-set-find-duplicate/1)

### Problem Description

**Task:** Given an integer array arr[], return a list containing all distinct elements that appear more than once in the array. The returned list must maintain the order in which these elements are encountered for the second time in the original array.Note: Each duplicate element should appear exactly once in the result. If no duplicates exist return [-1].Example:Input: arr[] = [1, 1, 2, 2]Output: [1, 2]Explanation: Both 1 and 2 appear more than once. The second occurrence of 1 comes before the second occurrence of 2.Input: arr[] = [2, 4, 1, 3, 4, 2, 2, 3]Output: [4, 2, 3]Explanation: The second occurrences of 4, 2 and 3 are encountered in that order.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-11-04 12:44:06
- **Status:** Correct
- **Marks:** 1

```java
class Solution {
	public List<Integer> findDuplicates(int[] arr) {
		// code here
		int max = 0;
          for (int num : arr) {
              if (num > max) {
                  max = num;
              }
          }

          int[] freq = new int[max + 1];
          for (int num : arr) {
              freq[num]++;
          }

          ArrayList<Integer> result = new ArrayList<>();
          HashSet<Integer> added = new HashSet<>();

          for (int num : arr) {
              if (freq[num] > 1 && !added.contains(num)) {
                  result.add(num);
                  added.add(num);
              }
          }

          if (result.isEmpty()) {
              result.add(-1);
          }

          return result;
	}
}
```

*Generated on: 11/4/2026, 12:44:51 PM*