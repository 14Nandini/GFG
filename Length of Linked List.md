## 01. Length of Linked List

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/1)

### Problem Description

**Task:** Given head of a singly linked list. Find the length of the linked list, where length is defined as the number of nodes in the linked list.Examples :Input: head: 1 - > 2 - > 3 - > 4 - > 5Output: 5

#### Examples

##### Example 1

- **Explanation:** Length of the linked list is 5, as there are 5 nodes present in it.

##### Example 2

- **Input:**
```text
head: 2 - > 4 - > 6 - > 7 - > 5 - > 1 - > 0 Output: 7
```
- **Explanation:** Length of the linked list is 7, as there are 7 nodes present in it.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-09-28 11:38:54
- **Status:** Correct
- **Marks:** 0

```java
/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        // code here
        Node node = head;
        int len = 0;
        while(node != null){
            len++;
            node = node.next;
        }
        return len;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-02-23 20:16:02
- **Status:** Correct
- **Marks:** 1

```java
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        int c = 0;
		Node p =head;
		while(p != null){
			c++;
			p = p.next;
		}
		return c;
    }
}
```

*Generated on: 9/28/2026, 11:39:35 AM*