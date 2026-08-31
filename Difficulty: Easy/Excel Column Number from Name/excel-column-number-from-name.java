class Solution {
    public int excelColumnNumber(String s) {
        // code here
        long res = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            res = res * 26 + (ch - 'A' + 1);
        }
        return (int)res;
    }
}