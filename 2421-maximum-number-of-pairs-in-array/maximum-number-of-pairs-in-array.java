class Solution {
    public int[] numberOfPairs(int[] nums) {
        // Map<Integer,Integer>mp=new HashMap<>();
        // for(int i :nums){
        //     mp.put(i ,mp.getOrDefault(i,0)+1);
        // }
        // int []k=new int[2];
        // for(Map.Entry<Integer,Integer>k:mp.entrySet()){
        //     if(k.getValue()%2==2){
        //         k[0]++;
        //         mp.remove(k.getKey());
        //     }

        // }
        
        //     k[1]=nums.length -(k[0]*2);
        int []k=new int[2];
        Set<Integer>s=new HashSet<>();
         for(int i :nums){
            if(s.contains(i)){
                s.remove(i);
                k[0]++;
            }
            else{
                s.add(i);
            }
         }
         k[1]=s.size();
    

        return k ;
    }
}