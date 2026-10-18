## 01. Sum of Matrix

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/sum-of-elements-in-a-matrix2000/1)

### Problem Description

**Task:** Given a non-null integer matrix mat[][] of size n × m, compute the sum of all its elements.Examples:Input: mat[][] = [[1, 0, 1], [-8, 9, -2]]

#### Examples

##### Example 1

- **Output:**
```text
0
```
- **Explanation:** The sum of all elements of the matrix is: (1 + 0 + 1 + 0 + 1 + 0 + 1 + 0 + 1 + 0 - 1 - 1 - 1 - 1 - 1) = 0.Constraints:1 ≤ n, m ≤ 10³-10³ ≤ mat[i][j] ≤ 10³

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n * m)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-10-18 13:56:24
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    int sumOfMatrix(int[][] Grid) { 
        int N = Grid.length;         // Total rows
        int M = Grid[0].length;      // Total columns
        int sum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sum = sum + Grid[i][j];
            }
        }
        return sum;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2025-10-05 20:13:51
- **Status:** Correct
- **Marks:** 1

```java
class Solution {
    int sumOfMatrix(int N, int M, int[][] Grid) {
        int sum = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                sum = sum + Grid[i][j];
            }
        }
        return sum;
    }
}
```

*Generated on: 10/18/2026, 1:57:08 PM*