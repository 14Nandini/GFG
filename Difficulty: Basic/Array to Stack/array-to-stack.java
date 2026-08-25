class Solution {

    // Push elements of an array into a stack.
    public static Stack<Integer> push(int arr[]) {
        Stack<Integer> st = new Stack<>();
        for(int e : arr) st.push(e);
        return st;
    }

    // Print elements of a stack and pop them.
    public static void printAndPop(Stack<Integer> s) {
        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
}