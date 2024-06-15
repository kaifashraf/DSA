class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 1)
            return false;
        long l=1,r=num;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long squared_mid = mid * mid;
            if (squared_mid == num)
                return true;
            else if (squared_mid < num) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }
}