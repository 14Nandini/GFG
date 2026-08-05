class Solution {
    public int longestSubarray(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0, len = 0, maxlen = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                len = 0;
                sum = 0;
                continue;
            }
            sum += arr[i];
            if(sum > maxsum) maxsum = sum;
            len++;
            if(len > maxlen) maxlen = len;

            if(sum < 0){
                len = 0;
                sum = 0;
            }
        }
        return maxlen;
    }
}