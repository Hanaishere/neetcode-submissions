class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0 , maxCount = 0;
        for(int ele : nums)
        {
            set.add(ele);
        }
        for(int ele : nums)
        {
            if(!set.contains(ele - 1))
            {
              int currentNum = ele;
              count = 1;
              while(set.contains(currentNum+1))
              count++;
              currentNum++;

            }
            maxCount = Math.max(maxCount , count);
        }
        return maxCount;
    }
}
