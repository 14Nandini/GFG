## 01. Count Sum Pairs in Sorted

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1)

### Problem Description

**Task:** You are given an integer target and an array arr[]. You need to find number of pairs in arr[] which sums up to target. It is given that the elements of the arr[] are in sorted order.Note: Pairs should have elements of distinct indexes.

#### Examples

##### Example 1

- **Input:**
```text
arr[] = [-1, 1, 5, 5, 7], target = 6
```
- **Output:**
```text
3
```
- **Explanation:** There are 3 pairs which sum up to 6 : {1, 5}, {1, 5} and {-1, 7}.

##### Example 2

- **Input:**
```text
arr[] = [1, 1, 1, 1], target = 2Output: 6Explanation: There are 6 pairs which sum up to 2 : {1, 1}, {1, 1}, {1, 1}, {1, 1}, {1, 1} and {1, 1}.
```

##### Example 3

- **Input:**
```text
arr[] = [-1, 10, 10, 12, 15], target = 125
```
- **Output:**
```text
0
```
- **Explanation:** There is no such pair which sums up to 125.

#### Constraints

- **1.** `-10⁵ <= target <= 10⁵`
- **2.** `2 <= arr.size() <= 10⁵-10⁵ <= arr[i] <= 10⁵`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-02 14:14:49
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    int countPairs(int arr[], int target) {
        //  Code Here
        HashMap<Integer, Integer> hm = new HashMap<>();
        int c = 0;
        for(int num : arr){
            int temp = target - num;
            if(hm.containsKey(temp)){
                c += hm.get(temp);
            }
            hm.put(num, hm.getOrDefault(num , 0) + 1);
        }
        return c;
    }
}
```

*Generated on: 10/2/2026, 2:16:02 PM*