class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombination(candidates,target,0,new ArrayList<>(),result);
        return result;
    }

    public void findCombination(int[] arr, int target, int ind,List<Integer> dS,  List<List<Integer>> result){
        if(ind == arr.length){
            if(target == 0){
                result.add(new ArrayList<>(dS));
                return;
            }
            return;
        }

        if(arr[ind] <= target){
            dS.add(arr[ind]);
            findCombination(arr, target - arr[ind], ind,dS,result);
            dS.remove(dS.size() - 1);
        }
        
        findCombination(arr, target, ind + 1,dS,result);
        
    }
}