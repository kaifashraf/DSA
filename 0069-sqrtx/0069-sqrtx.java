class Solution {
    public int mySqrt(int x) {
        if (x == 1||x==0)
            return x;
        int l=1,r=x,ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid<=x/mid){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
}