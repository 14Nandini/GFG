class Solution {
    public String colName(int n) {
        // code here
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            n = n - 1;
            int r = n % 26;
            sb.append((char) ('A' + r));
            n = n / 26;
        }
        return sb.reverse().toString();
    }
}