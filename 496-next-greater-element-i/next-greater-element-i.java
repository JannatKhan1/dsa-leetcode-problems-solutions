class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = nums2.length - 1; i >= 0; i--){
            int nums = nums2[i];

            while(!st.isEmpty() && st.peek() <= nums ){
                st.pop();
            }
            
            if(st.isEmpty()){
                mp.put(nums,-1);
            }else {
                mp.put(nums,st.peek());
            }
            st.push(nums);
        }

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = mp.get(nums1[i]);
        }
        return nums1;
    }
}