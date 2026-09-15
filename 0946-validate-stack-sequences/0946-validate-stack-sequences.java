class Solution {
    /*while(!stk.isEmpty() && stk.peek()==popped[idx]){
                stk.pop();
                idx++;
            }
        }*/
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int popp = 0;
        for(int x : pushed){
            st.push(x);
            while(!st.isEmpty() && st.peek()==popped[popp]){
                st.pop();
                popp++;
            }
        }
        System.out.println(st);
        return st.isEmpty();
    }
}