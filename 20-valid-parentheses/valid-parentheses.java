class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char[] str = s.toCharArray();
        for(char ch: str){
            if(st.isEmpty()){
                st.push(ch);
            } 
            else{
                if((st.peek() == '(' && ch == ')') || (st.peek() == '[' && ch == ']') || (st.peek() == '{' && ch == '}')){
                    st.pop();
                }
                else{
                    st.push(ch);
                }
            }
        }

        if(st.isEmpty()){
            return true;
        } 
        return false;
    }
}