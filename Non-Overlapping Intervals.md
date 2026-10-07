## 01. Non-Overlapping Intervals

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/non-overlapping-intervals/1)

### Problem Description

**Task:** Given a 2D array intervals[][] of size n, where intervals[i] = [start_i, end_i]. Return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.Note: Two intervals are considered non-overlapping if the end time of one interval is less than or equal to the start time of the next interval.Examples:Input: intervals[][] = [[1, 2], [2, 3], [3, 4], [1, 3]]Output: 1Explanation: [1, 3] can be removed and the rest of the intervals are non-overlapping.Input: intervals[][] = [[1, 3], [1, 3], [1, 3]]Output: 2Explanation: You need to remove two [1, 3] to make the rest of the intervals non-overlapping.Input: intervals[][] = [[1, 2], [5, 10], [18, 35], [40, 45]]Output: 0Explanation: All intervals are already non-overlapping.Constraints:1 ≤ n ≤ 1050 ≤ starti < endi ≤ 5*104

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n log n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-07 14:18:59
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public int minRemoval(int intervals[][]) {
        // code here
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int c = 0, prevEnd = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            int nextStart = intervals[i][0];
            if(prevEnd > nextStart) c++;
            else prevEnd = intervals[i][1];
        }
        return c;
    }
}
```

*Generated on: 10/7/2026, 2:19:32 PM*