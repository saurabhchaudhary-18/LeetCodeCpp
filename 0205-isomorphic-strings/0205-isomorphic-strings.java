class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> charindexs = new HashMap<>();
        HashMap<Character, Integer> charindext = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(!charindexs.containsKey(s.charAt(i))){
                charindexs.put(s.charAt(i),i);
            }
            if(!charindext.containsKey(t.charAt(i))){
                charindext.put(t.charAt(i),i);
            }
            if(!charindexs.get(s.charAt(i)).equals(charindext.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}