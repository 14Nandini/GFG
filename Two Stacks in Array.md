## 01. Two Stacks in Array

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1)

### Problem Description

**Task:** Given an array of a fixed size. Efficiently implement two stacks in this single array.The following operations must be supported:(i) twoStacks : Initialize the data structures and variables to be used to implement 2 stacks in one array.(ii) push1(x) : pushes element into the first stack.(iii) push2(x) : pushes element into the second stack.(iv) pop1() : pops an element from the first stack and returns the popped element. If the first stack is empty, it should return -1.(v) pop2() : pops an element from the second stack and returns the popped element. If the second stack is empty, it should return -1.Examples:Input: push1(2), push1(3), push2(4), pop1(), pop2() and pop2()

#### Examples

##### Example 1

- **Output:**
```text
[-1, -1, -1] push1(2): the stack1 will be [2] push1(3): the stack1 will be [2,3] push1(4): the stack1 will be [2,3,4] pop2(): the stack2 is empty hence returned -1.pop2(): the stack2 is empty hence returned -1.pop2(): the stack2 is empty hence returned -1.Constraints:1 ≤ number of queries ≤ 10⁴¹ ≤ number of elements in the stack ≤ 100The sum of the count of elements in both the stacks < size of the given array
```

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-23 11:06:32
- **Status:** Correct
- **Marks:** 4

```java
class twoStacks {
    int arr[]=new int[100];
    int top1;
    int top2;
    twoStacks() {
        this.top1=-1;
        this.top2=100;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        if(top1<top2-1){
           arr[++top1]=x; 
        }
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        if(top1<top2-1){
            arr[--top2]=x;
        }
    }

    // Function to remove an element from top of the stack1.

    int pop1() {
        if(top1==-1){
            return -1;
        }
        return arr[top1--];
    }        int pop2() {
        if(top2==100){
            return -1;
        }
        return arr[top2++];
    }
}
```

*Generated on: 10/23/2026, 11:14:16 AM*