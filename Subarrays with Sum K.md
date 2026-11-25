## 01. Subarrays with Sum K

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1)

### Problem Description

**Task:** Given an unsorted array arr[] of integers, find the number of subarrays whose sum exactly equal to a given number k.

#### Examples

##### Example 1

- **Input:**
```text
arr[] = [10, 2, -2, -20, 10], k = -10
```
- **Output:**
```text
3
```
- **Explanation:** Subarrays: arr[0...3], arr[1...4], arr[3...4] have sum exactly equal to -10.

##### Example 2

- **Input:**
```text
arr[] = [9, 4, 20, 3, 10, 5], k = 33
```
- **Output:**
```text
2
```
- **Explanation:** Subarrays: arr[0...2], arr[2...4] have sum exactly equal to 33.

##### Example 3

- **Input:**
```text
arr[] = [1, 3, 5], k = 0Output: 0
```
- **Explanation:** No subarray with 0 sum.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-11-25 22:32:14
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public int cntSubarrays(int[] arr, int k) {
        int n = arr.length;
        int res = 0, psum = 0, c = 0;
		Map<Integer, Integer> hm = new HashMap<>();
		hm.put(0,1);
		for(int i = 0; i < n; i++){
			psum = psum + arr[i];
			if(hm.containsKey(psum - k)){
				c = c + hm.get(psum - k);
			}
			hm.put(psum, hm.getOrDefault(psum, 0) + 1);
		}
		return c;
    }
}
```

#### Solution 2 (Java)

- **Submitted:** 2026-01-04 10:35:41
- **Status:** Correct
- **Marks:** 4

```java
class Solution {
    public int cntSubarrays(int[] arr, int k) {
        int n = arr.length;
        int res = 0, psum = 0, c = 0;
		Map<Integer, Integer> hm = new HashMap<>();
		hm.put(0,1);
		for(int i = 0; i < n; i++){
			psum = psum + arr[i];
			if(hm.containsKey(psum - k)){
				c = c + hm.get(psum - k);
			}
			hm.put(psum, hm.getOrDefault(psum, 0) + 1);
		}
		return c;
    }
}
```

*Generated on: 11/25/2026, 10:33:00 PM*