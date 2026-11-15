## 01. Bus Ticket Change

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/bus-ticket-change/1)

### Problem Description

**Task:** You are given an array arr[] representing passengers in a queue. Each bus ticket costs 5 coins, and arr[i] denotes the note a passenger uses to pay (which can be 5, 10, or 20). You must serve the passengers in the given order and always provide the correct change so that each passenger effectively pays exactly 5 coins. Your task is to determine whether it is possible to serve all passengers in the queue without ever running out of change.Examples:Input: arr[] = [5, 5, 5, 10, 20]Output: trueExplanation: From the first 3 customers, we collect three $5 bills in order.From the fourth customer, we collect a $10 bill and give back a $5.From the fifth customer, we give a $10 bill and a $5 bill.Since all customers got correct change we return true.Input: arr[] = [5, 5, 10, 10, 20]Output: falseExplanation: From the first two customers in order, we collect two $5 bills. For the next two customers in order, we collect a $10 bill and give back a $5 bill. For the last customer, we can not give the change of $15 back because we only have two $10 bills. Since not every customer received the correct change, the answer is false.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-01-20 21:45:29
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    public boolean canServe(int[] arr) {
        int n = arr.length;
        int c5 = 0, c10 = 0, c20 = 0;
		for(int i = 0; i < n; i++){
			if(arr[i] == 5) c5++;
			else if(arr[i] == 10){
				if(c5 == 0) return false;
				c5--;
				c10++;
			}
			else if(arr[i] == 20){
				if(c10 > 0 && c5 > 0){
					c10--;
					c5--;
				}
				else if(c5 >= 3) c5 -= 3;
				else return false;
			}
		}
		return true;
    }
}
```

*Generated on: 11/15/2026, 7:39:09 PM*