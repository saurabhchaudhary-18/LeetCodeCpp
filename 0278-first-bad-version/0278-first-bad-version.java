/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int ans = -1;
        while(left<=n){
            int mid = left + (n-left)/2;
            if(isBadVersion(mid)){
                ans = mid;
                n = mid-1;
            } else{
                left = mid+1;
            }
        }
        return ans;
    }
}