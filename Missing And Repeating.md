## 01. Missing And Repeating

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1)

### Problem Description

**Task:** Given an unsorted array arr[] of size n, containing elements from the range 1 to n, it is known that one number in this range is missing, and another number occurs twice in the array, find the both numbers.Examples:Input: arr[] = [2, 2]

#### Examples

##### Example 1

- **Output:**
```text
[3, 2]
```
- **Explanation:** Repeating number is 3 and the missing number is 2.Input: arr[] = [4, 3, 6, 2, 1, 1]Output: [1, 5]Explanation: Repeating number is 1 and the missing number is 5.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-11-18 19:02:27
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        // al = [-1, -1] 0th idx for duplicate  1st idx for missing
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(-1,-1));
        for(int num : arr){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for(int i = 1; i <= arr.length; i++){
            if(!hm.containsKey(i)) al.set(1,i); // missing
            else if(hm.get(i) > 1) al.set(0,i); // occurs twice
        }
        return al;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-09-08 19:54:14
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        // al = [-1, -1] 0th idx for duplicate  1st idx for missing
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(-1,-1));
        for(int num : arr){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        for(int i = 1; i <= arr.length; i++){
            if(!hm.containsKey(i)) al.set(1,i); // missing
            else if(hm.get(i) > 1) al.set(0,i); // occurs twice
        }
        return al;
    }
}
```

*Generated on: 11/18/2026, 7:03:11 PM*