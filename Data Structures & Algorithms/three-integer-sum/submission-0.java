class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 1 ; i < nums.length ; i++)
        {
            if(nums[i] >= 0 || nums[i] == nums[i-1])continue;

            int l = i+1 , r = nums.length-1;
            while(l < r)
            {
                if(nums[i] + nums[l] + nums[r] == 0)
                {
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                }
                l++;
                r--;
            }
        }
        return list;
    }
}
