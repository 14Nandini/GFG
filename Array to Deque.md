## 01. Array to Deque

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/insertion-in-deque/1)

### Problem Description

**Task:** Given an array arr[] containing non-negative integers. You need to insert all elements of the array to deque and return it.Examples:Input: arr[] = [1, 2, 3, 4, 5]

#### Examples

##### Example 1

- **Output:**
```text
[1, 2, 3, 4, 5]
```
- **Explanation:** After insert in the deque it will look like [1, 2, 3, 4, 5].

##### Example 2

- **Input:**
```text
arr[] = [1]
```
- **Output:**
```text
[1]
```
- **Explanation:** After insert in the deque it will look like [1].

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(1)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-11-23 18:43:20
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        Deque<Integer> dq = new ArrayDeque<>();
        for(int e : arr){
            dq.addLast(e);
        }
        return dq;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-08-27 16:02:09
- **Status:** Correct
- **Marks:** 1

```java
class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        // code here
        Deque<Integer> dq = new ArrayDeque<>();
        for(int e : arr){
            dq.addLast(e);
        }
        return dq;
    }
}
```

*Generated on: 11/23/2026, 6:44:21 PM*