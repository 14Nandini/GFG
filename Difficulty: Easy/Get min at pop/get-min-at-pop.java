class GetMin {
    public static Stack<Integer> _push(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            int min_val = Math.min(min, arr[i]);
            min = min_val;
            st.push(min);
        }
        return st;
    }

    static void _getMinAtPop(Stack<Integer> s) {
        while(!s.isEmpty()) System.out.print(s.pop() + " ");
    }
}