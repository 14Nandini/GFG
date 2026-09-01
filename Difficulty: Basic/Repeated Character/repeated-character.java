class Solution {
    char firstRep(String S) {
        // your code here
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch : S.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for(char ch : S.toCharArray()){
            if(hm.containsKey(ch) && hm.get(ch) > 1) return ch;
        }
        return '#';
    }
}