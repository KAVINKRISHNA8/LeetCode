class Solution {
    public String[] sortPeople(String[] n, int[] h) {
        Map<Integer,String>mp= new TreeMap<>();
        for(int i =0;i<n.length;i++){
            mp.put(h[i],n[i]);
        }
        int l=h.length-1;

        for(Map.Entry<Integer,String> k:mp.entrySet()){
            n[l--]=k.getValue();

        }
        return n;
        
    }
}