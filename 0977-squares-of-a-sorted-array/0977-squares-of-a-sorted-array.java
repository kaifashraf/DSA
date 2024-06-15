class Solution {
    public int[] sortedSquares(int[] nums) {
        int l,r;
        int[] ans= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            l=nums[i];
            r=nums[i];
            ans[i]=l*r;
        }
        Arrays.sort(ans);
        return ans;
    }
}