class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        findSubset(0, nums, new ArrayList<>(), res);
        return res;
    }

    public static void findSubset(int ind, int[] nums, List<Integer> ds, List<List<Integer>> res){
        res.add(new ArrayList<>(ds));

        for(int i = ind; i < nums.length; i++){
            if(i != ind && nums[i-1] == nums[i]) continue;
            ds.add(nums[i]);
            findSubset(i+1, nums, ds, res);
            ds.remove(ds.size() - 1);
        }
    }
}