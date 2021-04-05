class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int n:nums) {
            map.put(n,map.getOrDefault(n,0)+1);
            if (map.get(n)>1) return true;
        }
        return false;
    }
}
************************

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int n:nums) {
            if (set.contains(n)) return true;
            set.add(n);
        }
        return false;
    }
}
