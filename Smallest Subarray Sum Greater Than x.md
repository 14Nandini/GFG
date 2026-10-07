## 01. Smallest Subarray Sum Greater Than x

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1)

### Problem Description

**Task:** Given a number x and an array of integers arr, find the smallest subarray with sum strictly greater than the given value. If such a subarray do not exist return 0 in that case.

#### Examples

##### Example 1

- **Input:**
```text
x = 51, arr[] = [1, 4, 45, 6, 0, 19]
```
- **Output:**
```text
3
```
- **Explanation:** Minimum length subarray is [4, 45, 6]

##### Example 2

- **Input:**
```text
x = 100, arr[] = [1, 10, 5, 2, 7]
```
- **Output:**
```text
0
```
- **Explanation:** No subarray exist

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-07 10:11:43
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // code here
        int i = 0, sum = 0, res = Integer.MAX_VALUE;
        for(int j = 0; j < arr.length; j++){
            sum += arr[j];
            while(sum > x){
                res = Math.min(res, (j-i+1));
                sum -= arr[i];
                i++;
            }
        }
        return (res == Integer.MAX_VALUE) ? 0 : res;
    }
}
```

*Generated on: 10/7/2026, 10:12:12 AM*