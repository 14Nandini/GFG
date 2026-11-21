## 01. Compress String

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/easy-string2212/1)

### Problem Description

**Task:** Given a string s, compress it by replacing each group of consecutive identical characters with the lowercase character followed by its frequency.
Uppercase and lowercase versions of the same letter are treated as identical.
If the same character appears again after a different character, it forms a new group.

#### Examples

##### Example 1

- **Input:**
```text
s = "aaABBb"
```
- **Output:**
```text
"a3b3"
```
- **Explanation:** Treating uppercase and lowercase letters as the same, the string becomes "aaabbb". Thus, 'a' appears 3 times consecutively, followed by 'b' appearing 3 times.

##### Example 2

- **Input:**
```text
s = "aaacca"
```
- **Output:**
```text
"a3c2a1"
```
- **Explanation:** The first three 'a' characters form one group, followed by two 'c' characters. The last 'a' forms a separate group since it is not consecutive with the first one.

#### Constraints

- **1.** `1 ≤ |s| ≤ 10⁵s contains only lowercase and uppercase characters.`

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (2)

#### Solution 1 (Java)

- **Submitted:** 2026-11-21 21:33:00
- **Status:** Correct
- **Marks:** 0

```java
class Solution {
    public String compressString(String s) {
        int count=1;
        String g=s.toLowerCase();
        StringBuilder sb=new StringBuilder ();
          for(int i=0;i<g.length()-1;i++){
              char ch=g.charAt(i);
              char ch1=g.charAt(i+1);
              if(ch==ch1){
                  count+=1;
              }
              else{
                  sb.append(ch);
                  String str=String.valueOf(count);
                  sb.append(str);
                  count=1;
          }
          }
          sb.append(g.charAt(g.length()-1));
          sb.append(count);


          return sb.toString();
    }

}
```

#### Solution 2 (Java)

- **Submitted:** 2025-10-03 11:53:12
- **Status:** Correct
- **Marks:** 2

```java
class Solution {
    String transform(String S) {
        String str = S.toLowerCase();
        StringBuilder sb = new StringBuilder();
        int c = 1;
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1) != str.charAt(i)) {
                sb.append(c);
                sb.append(str.charAt(i-1));
                c = 1;
            } 
            else {
                c++;
            }
        }
        sb.append(c);
        sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }
}
```

*Generated on: 11/21/2026, 9:33:32 PM*