## 01. Majority Element - More Than n/3

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/majority-vote/1)

### Problem Description

**Task:** Given an array arr[] consisting of n integers, find all the array elements which occurs more than floor(n/3) times. Return the resulting array in strictly increasing order. If no such elements exist, return an empty array.Examples:Input: arr[] = [2, 2, 3, 1, 3, 2, 1, 1]

#### Examples

##### Example 1

- **Output:**
```text
[-5]Explanation: The frequency of -5 is 2, which is more than floor n/3 (3/3 = 1).Input: arr[] = [3, 2, 2, 4, 1, 4]Output: []Explanation: There is no majority element.
```
- **Explanation:** The frequency of 1 and 2 is 3, which is more than floor n/3 (8/3 = 2).Input: arr[] = [-5, 3, -5]

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-11-22 12:51:50
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        int c1 = 0, c2 = 0;
        int cnt1 = 0, cnt2 = 0;
        for (int num : arr) {
            if (num == c1) cnt1++;
            else if (num == c2) 
                cnt2++;
            else if (cnt1 == 0) 
            {
                c1 = num;
                cnt1 = 1;
            }
            else if (cnt2 == 0) {
                c2 = num;
                cnt2 = 1;
            } 
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0;
        for (int num : arr) {
            if (num == c1)
                cnt1++;
            else if (num == c2) cnt2++;
        }
        int t = n / 3;
        if (cnt1 > t) al.add(c1);
        if (cnt2 > t) al.add(c2);
        Collections.sort(al);
        return al;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2025-09-09 21:05:18
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        int c1 = 0, c2 = 0;
        int cnt1 = 0, cnt2 = 0;
        for (int num : arr) {
            if (num == c1) cnt1++;
            else if (num == c2) 
                cnt2++;
            else if (cnt1 == 0) 
            {
                c1 = num;
                cnt1 = 1;
            }
            else if (cnt2 == 0) {
                c2 = num;
                cnt2 = 1;
            } 
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0;
        for (int num : arr) {
            if (num == c1)
                cnt1++;
            else if (num == c2) cnt2++;
        }
        int t = n / 3;
        if (cnt1 > t) al.add(c1);
        if (cnt2 > t) al.add(c2);
        Collections.sort(al);
        return al;
    }
}
```

*Generated on: 11/22/2026, 12:52:21 PM*