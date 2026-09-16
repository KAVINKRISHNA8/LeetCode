class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>mp=new TreeMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        List<Integer>l=new ArrayList<>(mp.keySet());
        // for(Map.Entry <Integer,Integer>kk:mp.entrySet()){
        //     if(kk.getValue()>=k){
        //         l.add(kk.getKey());
        //     }
        l.sort((a,b)->mp.get(b)-mp.get(a));
        int []res=new int[k];
   
        for(int i =0;i<k;i++){
            res[i]=l.get(i);
        }
        return res;

        
    }
}