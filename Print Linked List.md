## 01. Print Linked List

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/print-linked-list-elements/1)

### Problem Description

**Task:** You are given the head of a singly linked list. Return an array containing the values of the nodes.Examples:Input: Output: [1, 2, 3, 4, 5]

#### Examples

##### Example 1

- **Explanation:** The linked list contains 5 elements [10, 20, 30, 40, 50, 60]. The elements are printed in a single line.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-09-28 11:44:37
- **Status:** Correct
- **Marks:** 1

```java
/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        Node temp = head;
        while(temp != null){
            res.add(temp.data);
            temp = temp.next;
        }
        return res;
    }
}
```

*Generated on: 9/28/2026, 11:45:05 AM*