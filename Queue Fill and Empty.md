## 01. Queue Fill and Empty

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/queue-designer/1)

### Problem Description

**Task:** Given an array arr[], implement the functions: fillQ(): Enqueue all elements of the array into a queue and return the queue.emptyQ(): Dequeue all elements from the queue and print them in a single line, separated by spaces, followed by a newline.Example 1:Input: arr[] = [1, 2, 3, 4, 5]

#### Examples

##### Example 1

- **Output:**
```text
[1, 6, 43, 1, 2, 0, 5]Constraints:1 ≤ arr[i] ≤ 10³
```

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-09-27 21:03:38
- **Status:** Correct
- **Marks:** 1

```java
class Solution {

    public Queue<Integer> fillQ(int[] arr) {
        
        Queue<Integer> q = new LinkedList<>();
        for (int num : arr) {
            q.add(num);
        }
        return q;
    }

    public void emptyQ(Queue<Integer> q) {
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
        System.out.println();
    }
}
```

*Generated on: 9/27/2026, 9:09:47 PM*