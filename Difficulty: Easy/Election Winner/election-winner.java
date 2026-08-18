import java.util.*;

class Solution {
    public ArrayList<String> winner(String[] arr) {
        // code here
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            String str = arr[i];
            hm.put(str, hm.getOrDefault(str,0)+1);
        }
        ArrayList<String> sortedKeys = new ArrayList<>(hm.keySet());
        Collections.sort(sortedKeys);
        String wname = "";
        int max = 0;
        for(String key : sortedKeys){
            if(hm.get(key) > max){
                max = hm.get(key);
                wname = key;
            }
        }
        return new ArrayList<>(List.of(wname, String.valueOf(max)));
    }
}