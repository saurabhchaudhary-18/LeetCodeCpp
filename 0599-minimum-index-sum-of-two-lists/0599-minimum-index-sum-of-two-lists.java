class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min = Integer.MAX_VALUE;
        HashMap<String, Integer> map = new HashMap<>();
        //int size = 0;
        for(int i=0; i<list1.length; i++){
            int j = search(list1[i],list2);
            if(j>=0 && i+j<=min){
                min = i+j;
                System.out.print(min+" ");
                map.put(list1[i],i+j);
            }
        }
        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i<list1.length; i++){
            if(map.get(list1[i]) != null && map.get(list1[i])==min){
                result.add(list1[i]);
            }
        }
        String[] arr = new String[result.size()];
        for(int i=0; i<result.size(); i++){
            arr[i] = result.get(i);
        }
        return arr;
        
    }
    public static int search(String s, String[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(s)){
                return i;
            }
        }
        return -1;
    }
}