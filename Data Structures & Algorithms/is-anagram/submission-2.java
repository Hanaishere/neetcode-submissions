class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character , Integer> map1 = new HashMap<>();
    HashMap<Character , Integer> map2 = new HashMap<>();
     for(char ele1 : s.toCharArray())
     {
        map1.put(ele1,map1.getOrDefault(ele1,0)+1);

     }
     for(char ele2 : t.toCharArray())
     {
        map2.put(ele2,map2.getOrDefault(ele2,0)+1);
     }
     return map1.equals(map2);
    }
}
