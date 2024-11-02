class Solution {
    public int search(int[] nums, int target) {
        // using linear search
    //     for(int i=0;i<nums.length;i++){
    //     if(nums[i]==target){
    //         return i;
    //     }
    //    }
    //    return -1;
    //using binary search
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==target){
                return mid;
            }//identify th esorted half eitherr left or right sorted
            //left sorted
            if(nums[l]<=nums[mid]){
                if(nums[l]<=target && target<=nums[mid]){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }
            //right sorted half
            else{
                if(nums[mid]<=target && target<=nums[h]){
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
}