## 01. Maximize partitions in a String

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/maximize-partitions-in-a-string/1)

### Problem Description

**Task:** Given a string s of lowercase English alphabets, your task is to return the maximum number of substrings formed, after possible partitions (probably zero) of s such that no two substrings have a common character.

#### Examples

##### Example 1

- **Input:**
```text
s = "acbbcc"Output: 2Explanation: "a" and "cbbcc" are two substrings that do not share any characters between them.
```

##### Example 2

- **Input:**
```text
s = "ababcbacadefegdehijhklij"Output: 3Explanation: Partitioning at the index 8 and at 15 produces three substrings: “ababcbaca”, “defegde”, and “hijhklij” such that none of them have a common character. So, the maximum number of substrings formed is 3.
```

##### Example 3

- **Input:**
```text
s = "aaa"Output: 1Explanation: Since the string consists of same characters, no further partition can be performed. Hence, the number of substring (here the whole string is considered as the substring) is 1.
```

#### Constraints

- **1.** `1 ≤ s.size() ≤ 10⁵'a' ≤ s[i] ≤ 'z'`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-07 21:10:31
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
	public int maxPartitions(String s) {
		// code here
		int n = s.length();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = n - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			if (!hm.containsKey(ch))
				hm.put(ch, i);
		}
		int j = 0, c = 0;
		for (int k = 0; k < n; k++) {
			char ch = s.charAt(k);
			int lastOcc = hm.get(ch);
			j = Math.max(j, lastOcc);
			if (k == j) {
				c++;
			}
		}
		return c;
	}
}
```

*Generated on: 10/7/2026, 9:12:24 PM*