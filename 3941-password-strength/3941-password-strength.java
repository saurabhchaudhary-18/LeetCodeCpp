class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<password.length(); i++){
            set.add(password.charAt(i));
        }
        int sum = 0;
        String str = "qwertyuiopasdfghjklzxcvbnm";
        String upper = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String num = "12345678990";
        for(char x : set){
            if(str.contains(x+"")){
                sum = sum + 1;
            } else if(num.contains(x+"")){
                sum = sum + 3;
            } else if(upper.contains(x+"")){
                sum = sum + 2;
            } else {
                sum = sum + 5;
            }
        }
        return sum;
    }
}