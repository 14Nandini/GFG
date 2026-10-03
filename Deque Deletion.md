## 01. Deque Deletion

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/deque-deletion/1)

### Problem Description

**Task:** Given a Deque deq containing non-negative integers.
Complete below functions depending type of query as mentioned and provided to you (indexing starts from 0):1. eraseAt(x): this function should remove the element from specified position x in deque.2. eraseInRange(start, end): this function should remove the elements in range start (inclusive), end (exclusive) specified in the argument of the function. If start is equal to end then simply return.3. eraseAll(): remove all the elements from the deque.

#### Examples

##### Example 1

- **Input:**
```text
deq = [1 2 4 5 6], query = [1 2]
```
- **Output:**
```text
1 2 5 6
```
- **Explanation:** Here the query type is 1 and the position is 2. So we remove element at position 2. The element at position 2 is 1 2 4 5 6. So, we remove 4 and get 1 2 5 6.

##### Example 2

- **Input:**
```text
deq = [1 2 3 4], query = [2 1 3]
```
- **Output:**
```text
1 4
```
- **Explanation:** Here the query type is 2 and the range is [1, 3). So we need to delete 1 2 3 4. Remember that end is exclusive. So the updated dequeue is 1 4.

##### Example 3

- **Input:**
```text
deq = [1 2 3], query = [3]
```
- **Output:**
```text
Empty
```
- **Explanation:** Here the query is of type 3 so we remove all the elements of dequeue.

#### Constraints

- **1.** `1 ≤ deq.size() ≤ 10⁵`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-03 15:57:00
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public void eraseAt(ArrayDeque<Integer> deq, int x) {
        // code here
        List<Integer> list = new ArrayList<>(deq);
        list.remove(x);
        deq.clear();
        deq.addAll(list);
        
    }

    public void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        // code here
        List<Integer> list = new ArrayList<>(deq);
        for(int i = end - 1; i >= start; i--){
            list.remove(i);
        }
        deq.clear();
        deq.addAll(list);
    }

        
    public void eraseAll(ArrayDeque<Integer> deq) {
        // code here
        deq.clear();
    }
}
```

*Generated on: 10/3/2026, 4:22:51 PM*