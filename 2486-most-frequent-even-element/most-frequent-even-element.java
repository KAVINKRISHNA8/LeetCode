class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> mp = new TreeMap<>();
        for (int i : nums) {
            if (i % 2 == 0) {
                mp.put(i, mp.getOrDefault(i, 0) + 1);
            }
        }
        int m = -1;
        int k = 0;
        for (Map.Entry<Integer, Integer> kk : mp.entrySet()) {
            m = Math.max(m, kk.getValue());
        }
        
        for (Map.Entry<Integer, Integer> kk : mp.entrySet()) {
            if (kk.getValue() == m) {
               k=kk.getKey();
               break;
            }

        }
        System.out.println(k);
        
    
        return m>0?k:-1;
    }
}