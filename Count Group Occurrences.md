## 01. Count Group Occurrences

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/count-the-characters1821/1)

### Problem Description

**Task:** Given a string s and an integer k, count the number of distinct characters that appear in exactly k groups in the string.A group is defined as one or more consecutive occurrences of the same character. For example, in the string "aaabbcca", the groups are "aaa", "bb", "cc" and "a".Examples:Input: s = "abc", k = 1Output: 3Explanation: The characters 'a', 'b' and 'c' each appear in exactly one group.Input: s = "geeksforgeeks", k = 2Output: 4Explanation: The characters 'g', 'e', 'k' and 's' each appear in exactly two groups.Input: s = "aaaaa", k = 2Output: 0Explanation: The character 'a' appears in only one group, so no character appears in exactly two groups.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-11-09 19:13:47
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
	int getCount(String S, int N) {
		HashMap<Character, Integer> hm = new HashMap<>();
		int i = 0;
		while (i < S.length()) {
			char ch = S.charAt(i);
			int j = i;
			while (j < S.length() && S.charAt(j) == ch)
				j++;
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
			i = j;
		}
		int c = 0;
		for (int val : hm.values()) {
			if (val == N)
				c++;
		}
		return c;
	}
}
```

#### Solution 2 (Java)

- **Submitted:** 2025-09-24 21:55:27
- **Status:** Correct
- **Marks:** 1

```java
class Sol {
    int getCount(String S, int N) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0;
        while (i < S.length()) {
            char ch = S.charAt(i);
            int j = i;
            while (j < S.length() && S.charAt(j) == ch) j++;
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            i = j;
        }
        int c = 0;
        for (int val : hm.values()) {
            if (val == N) c++;
        }
        return c;
    }
}
```

*Generated on: 11/9/2026, 7:15:43 PM*