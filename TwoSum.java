// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example:
// Given nums = [2, 7, 11, 15], target = 9,

// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].


class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                }
            }
        }
        return indexes;
    }
}


/*
    My optimal solution
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> compliment = new HashMap<>();
        int comp;
        for(int i = 0; i < nums.length; i++) {
            comp = target - nums[i];
            if(compliment.containsKey(comp))
                return new int[]{compliment.get(comp), i};
            compliment.put(nums[i], i);
        }
        return new int[]{};
}*/
