class Solution {
    public boolean search(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         return true;
        //     }
            
        // }
        // return false;
        


        //bs 
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                return true;

            }if(nums[mid]==nums[l] && nums[mid]==nums[h]){
                l++;
                h--;
            }
            else if(nums[h]>=nums[mid]){
                if(nums[mid]<=target && target<=nums[h]){
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }
            else{
                if(nums[mid]>=target && target>=nums[l]){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }
            
        }
        return false;
    }
}