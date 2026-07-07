class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0, y = x;
        while (x>0){
            int digit = x%10;
            x = x/10;
            rev = rev*10 + digit;
        }
        return (y == rev);
    }
}