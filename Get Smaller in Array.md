## 01. Get Smaller in Array

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/get-smaller-elements/1)

### Problem Description

**Task:** Given an array arr[], return all the elements which are less than a given value x. The order of returned smaller elements should be according their appearance in the input array. Examples:Input: arr[] = [54, 43, 2, 1, 5], x = 7

#### Examples

##### Example 1

- **Output:**
```text
2 2
```
- **Explanation:** 2, 2 are smaller than 3.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-11-02 09:56:21
- **Status:** Correct
- **Marks:** 1

```java
class Solution {
    public ArrayList<Integer> getSmaller(int arr[], int target) {
        // code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int a : arr){
            if(a < target) res.add(a);
        }
        return res;
    }
}
```

*Generated on: 11/2/2026, 7:58:24 PM*