class Solution {
    public int getCount(int[] arr, int x, int y) {
        int xidx = -1, yidx = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                xidx = i;
                break;
            }
        }
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == y){
                yidx = i;
                break;
            }
        }
        if(yidx == -1 || xidx == -1) return -1;
        return yidx - xidx - 1;
    }
}