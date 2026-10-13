## 01. Even Occurring Elements

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/even-occurring-elements4332/1)

### Problem Description

**Task:** Given an array arr[] of integers, find and return the elements with even occurrences in the array. If no such element exists, return -1. Elements should be returned in order of occurrence.

#### Examples

##### Example 1

- **Input:**
```text
arr[] = [9, 12, 23, 10, 12, 12, 15, 23, 14, 12, 15]Output: [12, 15, 23]Explanation: The numbers 12, 15, and 23 each appear an even number of times.
```

##### Example 2

- **Input:**
```text
arr[] = [23, 12, 56, 34, 32]Output: [-1]Explanation: Every number in the array occurs an odd number of times.
```

#### Constraints

- **1.** `1 ≤ arr.size() ≤ 10⁶¹ ≤ arr[i] ≤ 10⁵`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-13 21:41:02
- **Status:** Correct
- **Marks:** 1

```java
import java.util.*;

class Solution {
	public ArrayList<Integer> findEvenOccurrences(int[] arr) {
		// code here
		HashMap<Integer, Integer> map = new HashMap<> ();
		ArrayList<Integer> list = new ArrayList<> ();
		for (int a :arr)
			{
			map.put(a, map.getOrDefault(a, 0) + 1);
		}
		for (int a :arr)
			{
			if (map.get(a)%2 == 0 && list.contains(a) == false)
				list.add(a);
		}
		if (list.isEmpty())
			list.add(-1);
		return list;
	}
}
```

*Generated on: 10/13/2026, 9:43:41 PM*