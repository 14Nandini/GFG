## 01. Count Subarrays with k Odds

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/count-subarray-with-k-odds/1)

### Problem Description

**Task:** You are given an array arr[] of positive integers and an integer k. You have to count the number of subarrays that contain exactly k odd numbers.

#### Examples

##### Example 1

- **Input:**
```text
arr[] = [2, 5, 6, 9], k = 2
```
- **Output:**
```text
2
```
- **Explanation:** There are 2 subarrays with 2 odds: [2, 5, 6, 9] and [5, 6, 9].

##### Example 2

- **Input:**
```text
arr[] = [2, 2, 5, 6, 9, 2, 11], k = 2
```
- **Output:**
```text
8Explanation: There are 8 subarrays with 2 odds: [2, 2, 5, 6, 9], [2, 5, 6, 9], [5, 6, 9], [2, 2, 5, 6, 9, 2], [2, 5, 6, 9, 2], [5, 6, 9, 2], [6, 9, 2, 11] and [9, 2, 11].
```

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-03 16:22:03
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public int countSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int currCnt = 0, subCnt = 0;
        for(int num : arr){
            currCnt += num % 2;
            if(hm.containsKey(currCnt - k)){
                subCnt += hm.get(currCnt - k);
            }
            hm.put(currCnt, hm.getOrDefault(currCnt, 0) + 1);
        }
        return subCnt;
    }
}
```

*Generated on: 10/3/2026, 4:26:28 PM*