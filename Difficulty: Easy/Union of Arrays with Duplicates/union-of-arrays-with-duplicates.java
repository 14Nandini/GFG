class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < a.length; i++) hs.add(a[i]);
        for(int i = 0; i < b.length; i++) hs.add(b[i]);
        ArrayList<Integer> union = new ArrayList<Integer>(hs);
        Collections.sort(union);
        return union;
    }
}