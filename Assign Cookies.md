## 01. Assign Cookies

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/assign-cookies/1)

### Problem Description

**Task:** You are given an array greed[], where greed[i] represents the minimum size of cookie required to satisfy the i-th child, and an array cookie[], where cookie[j] represents the size of the j-th cookie. Each child can receive at most one cookie. A child i will be satisfied if they receive a cookie j such that cookie[j] >= greed[i]. Your task is to determine the maximum number of children that can be satisfied.

#### Examples

##### Example 1

- **Input:**
```text
greed[] = [1, 10, 3], cookie = [1, 2, 3]Output: 2Explanation: We can only assign cookie to the first and third child.
```

##### Example 2

- **Input:**
```text
greed[] = [10, 100], cookie = [1, 2]Output: 0Explanation: We can not assign cookies to any child.
```

#### Constraints

- **1.** `1 ≤ greed.size() ≤ 10⁵¹ ≤ cookie.size() ≤ 10⁵¹ ≤ greed[i] , cookie[i] ≤ 10⁹`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n log n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-06 20:07:06
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public int maxChildren(int[] greed, int[] cookie) {
        // code here
        Arrays.sort(greed);
        Arrays.sort(cookie);
        int i = 0, j = 0, c = 0;
        while(i < greed.length && j < cookie.length){
            if(greed[i] <= cookie[j]){
                c++;
                i++;
                j++;
            }
            else j++;
        }
        return  c;
    }
}
```

*Generated on: 10/6/2026, 8:07:34 PM*