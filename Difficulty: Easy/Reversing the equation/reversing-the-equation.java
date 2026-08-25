class Solution {

    String reverseEqn(String S) {
        
        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack<>();
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                st.push(sb.toString());
                st.push(Character.toString(ch));
                sb.setLength(0);
            }
            else{
                sb.append(ch);
            }
        }
        st.push(sb.toString());
        String str = "";
        while(!st.isEmpty()) str += st.pop();
        return str;
    }
}

