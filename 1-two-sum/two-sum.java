class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int ans[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            int rem = target - nums[i];
            if(mpp.containsKey(rem)){
                ans[0] = i;
                ans[1] = mpp.get(rem);
            }
            mpp.put(nums[i],i);
        }
        return ans;
    }
}