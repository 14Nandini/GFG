## 01. Juggler Sequence

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/juggler-sequence3930/1)

### Problem Description

**Task:** Juggler Sequence is a series of integers in which the first term starts with a positive integer number a and the remaining terms are generated from the immediate previous term using the below recurrence relation:Given a number n, find the Juggler Sequence for this number as the first term of the sequence until it becomes 1.

#### Examples

##### Example 1

- **Input:**
```text
n = 9
```
- **Output:**
```text
9 27 140 11 36 6 2 1 Explaination: We start with 9 and use above formula to get next terms.
```

##### Example 2

- **Input:**
```text
n = 6
```
- **Output:**
```text
6 2 1 Explaination: [6¹/2] = 2. [2¹/2] = 1.
```

#### Constraints

- **1.** `1 ≤ n ≤ 100`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-11-07 21:49:33
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    static List<Long> jugglerSequence(long n) {
        List<Long> l = new ArrayList<>();
        l.add(n);
        while(n>1){
            if(n%2==0){
                n =(long) Math.floor(Math.sqrt(n));
                l.add(n);
            }
            else{
                n =(long)Math.floor(Math.pow(n,1.5));
                l.add(n);
            }
        }
        return l;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2025-08-16 08:49:00
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    static List<Long> jugglerSequence(long n) {
        List<Long> l = new ArrayList<>();
        l.add(n);
        while(n>1){
            if(n%2==0){
                n =(long) Math.floor(Math.sqrt(n));
                l.add(n);
            }
            else{
                n =(long)Math.floor(Math.pow(n,1.5));
                l.add(n);
            }
        }
        return l;
    }
}
```

*Generated on: 11/7/2026, 9:50:11 PM*