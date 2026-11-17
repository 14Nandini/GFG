## 01. Easy to understand soln in c++.....

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/binary-search-1587115620/1)

### Problem Description

**Task:** Given a sorted array arr[] and an integer k, find the position(0-based indexing) at which k is present in the array using binary search. If k doesn't exist in arr[] return -1. Note: If multiple occurrences are there, please return the smallest index.Examples:Input: arr[] = [1, 2, 3, 4, 5], k = 4

#### Examples

##### Example 1

- **Output:**
```text
0
```
- **Explanation:** 1 appears at index 0.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(log n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-11-17 15:19:07
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k) return i;
        }
        return -1;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-09-17 20:27:34
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k) return i;
        }
        return -1;
    }
}
```

*Generated on: 11/17/2026, 3:19:42 PM*