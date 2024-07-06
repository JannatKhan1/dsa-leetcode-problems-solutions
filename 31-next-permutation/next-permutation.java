class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i+1]>nums[i]){
                index = i;
                break;
            }
        }
        

        if(index == -1){
            for(int i = 0; i < nums.length/2; i++){
                int t = nums[i];
                nums[i] = nums[n-i-1];
                nums[n-i-1] = t;
            }
            return;
        }

        for(int i = n - 1; i >= index; i--){
            if(nums[i] > nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
            
        }
        
        int start = index + 1;
        int end = n - 1;
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        
    }
}