class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-2 ; i++)
        {
            if(i > 0 && nums[i] == nums[i-1])continue;
            if(nums[i] > 0)
            break;

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
