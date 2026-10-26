## 01. Array End Insert

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/array-insert-at-end/1)

### Problem Description

**Task:** Given an array arr that is not completely filled and a value val, you have to insert the value at the end of the array.

#### Examples

##### Example 1

- **Input:**
```text
arr[] = [1, 2, 3, 4, 5], val = 90
```
- **Output:**
```text
[1, 2, 3, 4, 5, 90]Explanation: After inserting 90 at the end, we have array elements as 1 2 3 4 5 90.
```

##### Example 2

- **Input:**
```text
arr[] = [1, 2, 3], val = 50
```
- **Output:**
```text
[1, 2, 3, 50]
```
- **Explanation:** After inserting 50 at the end, we have array elements as 1 2 3 50.

#### Constraints

- **1.** `1 ≤ arr.size() ≤ 10⁵⁰ ≤ element, arr[i]_ ≤ 10⁶`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(1)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-26 09:38:40
- **Status:** Correct
- **Marks:** 1

```java
class Solution {
    public void insertAtEnd(ArrayList<Integer> arr, int val) {
        // code here
        arr.add(val);
    }
}
```

*Generated on: 10/26/2026, 9:39:09 AM*