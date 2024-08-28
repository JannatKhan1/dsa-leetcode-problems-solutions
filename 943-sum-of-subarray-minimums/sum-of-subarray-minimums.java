class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] psee = findPSEE(arr);
        int[] nse = findNSE(arr);
        int mod = 1000000007;
        int total = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int left = i - psee[i];
            int right = nse[i] - i;
            long contribution = ((long)right * left % mod * arr[i] % mod) % mod;
            total = (total + (int)contribution) % mod;
        } 
        return total;
    }

    public int[] findPSEE(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] pse = new int[n];
        for(int i = 0; i < n; i++ ){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;   
    }

    public int[] findNSE(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nse = new int[n];
        for(int i = n - 1; i >= 0; i-- ){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return nse;   
    }
}