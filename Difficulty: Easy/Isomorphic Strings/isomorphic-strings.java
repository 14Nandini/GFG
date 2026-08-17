class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        HashMap<Character, Character> hm = new HashMap<>();
        for(int i = 0; i< s1.length(); i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(hm.containsKey(ch1)){ 
                if(hm.get(ch1) != ch2) return false;
            }
            else if(hm.containsValue(ch2)){
                return false;
            }
            else hm.put(ch1, ch2);
        }
        return true;
    }
}