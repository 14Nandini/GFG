## 01. Count Types of Characters

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/count-type-of-characters3635/1)

### Problem Description

**Task:** Given a string s, count the occurrence of the following in it.
Lowercase characters
Uppercase characters
Special characters
Numeric Values

> **Note:** There are no white spaces in the string.

#### Examples

##### Example 1

- **Input:**
```text
s = "#GeeKs01fOr@gEEks07"
```
- **Output:**
```text
[5, 8, 4, 2]
```
- **Explanation:** There are 5 uppercase characters, 8 lowercase characters, 4 numeric characters and 2 special characters.

##### Example 2

- **Input:**
```text
s = "*GeEkS4GeEkS*"
```
- **Output:**
```text
[6, 4, 1, 2]
```
- **Explanation:** There are 6 uppercase characters, 4 lowercase characters, 1 numeric character and 2 special characters.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-24 16:18:45
- **Status:** Correct
- **Marks:** 1

```java
class Sol {
    int[] count(String s) {
        // your code here
        int lcnt = 0, ucnt = 0, scnt = 0, ncnt = 0;
        for(char ch : s.toCharArray()){
            if(Character.isLowerCase(ch)) lcnt ++;
            else if(Character.isUpperCase(ch)) ucnt++;
            else if(Character.isDigit(ch)) ncnt++;
            else scnt++;
        }
        return new int[]{ucnt, lcnt, ncnt, scnt};
    }
}
```

*Generated on: 10/24/2026, 4:19:56 PM*