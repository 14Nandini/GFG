## 01. Insert at Middle of Linked List

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1)

### Problem Description

**Task:** Given the head of a Singly Linked List and a value x. Insert the key in the middle of the linked list.

#### Examples

##### Example 1

- **Input:**
```text
1- > 2- > 4, x = 3
```
- **Output:**
```text
1- > 2- > 3- > 4
```

##### Example 2

- **Input:**
```text
10- > 20- > 40- > 50, x = 30
```
- **Output:**
```text
10- > 20- > 30- > 40- > 50
```

#### Constraints

- **1.** `0 ≤ number of nodes ≤ 10⁵⁰ ≤ node- > data , x ≤ 10³`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-01 11:03:18
- **Status:** Correct
- **Marks:** 2

```java
/* Structure of a linked list node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        // code here
        Node node = new Node(x);
        if(head == null) return node;
        
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        node.next = slow.next;
        slow.next = node;
        return head;
    }
}
```

*Generated on: 10/1/2026, 11:20:02 AM*