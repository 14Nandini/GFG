## 01. Print n to 1 Without Loop

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1)

### Problem Description

**Task:** Given an integer n, print all numbers from n to 1 in decreasing order, separated by spaces, without using any loops.Examples :Input: n = 5

#### Examples

##### Example 1

- **Output:**
```text
3 2 1
```
- **Explanation:** The numbers from 3 to 1 are printed in decreasing order

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-20 11:42:55
- **Status:** Correct
- **Marks:** 1

```java
class Solution {
    public void printNos(int n) {
        // code here
        if(n == 0) return;
        
        System.out.print(n + " ");
        printNos(n-1);

    }
}
```

*Generated on: 10/20/2026, 11:44:24 AM*