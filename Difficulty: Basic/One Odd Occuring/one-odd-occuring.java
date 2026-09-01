class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        // code here

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int a : arr){
            hm.put(a, hm.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: hm.entrySet())
        {
            if(entry.getValue() % 2 != 0) return entry.getKey();
        }

        return -1;
    }
}