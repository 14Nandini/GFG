## 01. Deque Implementation

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/deque-implementations/1)

### Problem Description

**Task:** A deque is a double-ended queue that allows enqueue and dequeue operations from both the ends.
Given a deque and q queries. The task is to perform some operation on dequeue according to the queries as given below:1. pb: query to push back the element x.2. pf: query to push element x(given with query) to the front of the deque.3. pp_b(): query to delete element from the back of the deque.4. f: query to return a front element from the deque. If the deque is empty return -1.

#### Examples

##### Example 1

- **Input:**
```text
queries = [[ pf 5 ],[ pf 10 ],[ pb 6 ],[ f ],[ pp_b ]]
```
- **Output:**
```text
10 1. After push front deque will be [5] 2. After push front deque will be [10, 5] 3. After push back deque will be [10, 5, 6] 4. Return front element which is 10 5. After pop back deque will be [10, 5]
```

##### Example 2

- **Input:**
```text
queries = [[ pf 5 ],[ f ]]
```
- **Output:**
```text
5 1. After push front deque will be [5] 2. Return front element which is 5
```

#### Constraints

- **1.** `1 ≤ Number of queries ≤ 10⁵`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(1)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-09-30 15:05:37
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public static void pb(ArrayDeque<Integer> dq, int x) {
        //  code here
        dq.addLast(x);
    }

    public static void ppb(ArrayDeque<Integer> dq) {
        //  code here
        if (!dq.isEmpty()) dq.removeLast();
    }

        
    public static int front_dq(ArrayDeque<Integer> dq) {
        //  code here
        if (!dq.isEmpty()) return dq.peekFirst();
        return -1;
        
    }
        

    public static void pf(ArrayDeque<Integer> dq, int x) {
        //  code here
        dq.addFirst(x);
    }
}
```

*Generated on: 9/30/2026, 3:06:31 PM*