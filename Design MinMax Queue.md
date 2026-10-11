## 01. Design MinMax Queue

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/design-minmax-queue/1)

### Problem Description

**Task:** Design a SpecialQueue data structure that functions like a normal queue but with additional support for retrieving the minimum and maximum element efficiently.The SpecialQueue must support the following operations:
enqueue(x): Insert an element x at the rear of the queue.
dequeue(): Remove the element from the front of the queue.
getFront(): Return the front element without removing.
getMin(): Return the minimum element in the queue in O(1) time.
getMax(): Return the maximum element in the queue in O(1) time.
There will be a sequence of queries queries[][]. The queries are represented in numeric form:
1 x : Call enqueue(x)
2: Call dequeue()
3: Call getFront()
4: Call getMin()
5: Call getMax()
The driver code will process the queries, call the corresponding functions, and print the outputs of getFront(), getMin(), getMax() operations.You only need to implement the above five functions.

> **Note:** It is guaranteed that all the queries are valid.

#### Examples

##### Example 1

- **Input:**
```text
q = 6, queries[][] = [[1, 4], [1, 2], [3], [4], [2], [5]]
```
- **Output:**
```text
[4, 2, 2]
```
- **Explanation:** Queries on queue are as follows:enqueue(4): Insert 4 at the rear of the queue. enqueue(2): Insert 2 at the rear of the queue.return the front element i.e 4 return minimum element from the queue i.e 2dequeue(): Remove the front element 4 from the queue return maximum element from the queue i.e 2

##### Example 2

- **Input:**
```text
q = 4, queries[][] = [[1, 3], [4], [1, 5], [5]]
```
- **Output:**
```text
[3, 5]
```
- **Explanation:** Queries on queue are as follows:enqueue(3): Insert 3 at the rear of the queue. return minimum element from the queue i.e 3enqueue(5): Insert 5 at the rear of the queue.return maximum element from the queue i.e 5

#### Constraints

- **1.** `1 ≤ queries.size() ≤ 10⁵⁰ ≤ values in the queue ≤ 10⁹`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(1)
- **Expected Auxiliary Space Complexity:** O(n)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-11 22:18:53
- **Status:** Correct
- **Marks:** 4

```java
class SpecialQueue {
	Deque<Integer>dq = new ArrayDeque<>();
	Map<Integer, Integer>mp = new HashMap<>();
	PriorityQueue<Integer>max = new PriorityQueue<>((a, b)->b - a);
	PriorityQueue<Integer>min = new PriorityQueue<>();
	public SpecialQueue() {
		// Define Data Structures
	}
	
	public void enqueue(int x) {
		// Insert element into the queue
		dq.addLast(x);
		mp.put(x, mp.getOrDefault(x, 0) + 1);
		max.add(x);
		min.add(x);
	}
	
	public void dequeue() {
		// Remove element from the queue
		int x = dq.removeFirst();
		mp.put(x, mp.getOrDefault(x, 0) - 1);
		if (mp.get(x) == 0)mp.remove(x);
	}
	
	public int getFront() {
		// Get front element
		return dq.peekFirst();
	}
	
	public int getMin() {
		// Get minimum element
		while (!min.isEmpty() && !mp.containsKey(min.peek()))
			{
			min.remove();
		}
		return min.peek();
	}
	
	public int getMax() {
		// Get maximum element
		while (!max.isEmpty() && !mp.containsKey(max.peek()))
			{
			max.remove();
		}
		return max.peek();
	}
}
```

*Generated on: 10/11/2026, 10:19:19 PM*