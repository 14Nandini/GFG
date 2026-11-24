## 01. Kadane's Algorithm

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1)

### Problem Description

**Task:** You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].Examples:Input: arr[] = [2, 3, -8, 7, -1, 2, 3]

#### Examples

##### Example 1

- **Output:**
```text
11
```
- **Explanation:** The subarray [7, -1, 2, 3] has the largest sum 11.

##### Example 2

- **Input:**
```text
arr[] = [-2, -4]
```
- **Output:**
```text
25
```
- **Explanation:** The subarray [5, 4, 1, 7, 8] has the largest sum 25.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-11-24 20:54:22
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n = arr.length, sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            sum +=  arr[i];
            if(sum > max ) max = sum;
            if( sum < 0 ) sum = 0;
        }
        return max;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-07-26 20:07:35
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n = arr.length, sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            sum +=  arr[i];
            if(sum > max ) max = sum;
            if( sum < 0 ) sum = 0;
        }
        return max;
    }
}
```

*Generated on: 11/24/2026, 8:54:58 PM*