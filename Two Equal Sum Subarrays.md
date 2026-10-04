## 01. Two Equal Sum Subarrays

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/split-an-array-into-two-equal-sum-subarrays/1)

### Problem Description

**Task:** Given an array of integers arr[], return true if it is possible to split it in two subarrays (without reordering the elements), such that the sum of the two subarrays are equal. If it is not possible then return false.

#### Examples

##### Example 1

- **Input:**
```text
arr[] = [1, 2, 3, 4, 5, 5]Output: trueExplanation: We can divide the array into [1, 2, 3, 4] and [5, 5]. The sum of both the subarrays are 10.
```

##### Example 2

- **Input:**
```text
arr[] = [4, 3, 2, 1]Output: falseExplanation: We cannot divide the array into two subarrays with equal sum.
```

#### Constraints

- **1.** `1 ≤ arr.size() ≤ 10⁵ 1 ≤ arr[i] ≤ 10⁶`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-04 14:13:27
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int n = arr.length - 1;
        int totalSum = 0;
        for(int num : arr) totalSum += num;
        int temp = 0;
        for(int i = n; i >= 0; i--){
            temp += arr[i];
            totalSum -= arr[i];
            if(temp == totalSum) return true;
        }
        return false;
    }
}
```

*Generated on: 10/4/2026, 2:14:09 PM*