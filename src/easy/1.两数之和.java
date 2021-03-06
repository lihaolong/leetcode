import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 *
 * https://leetcode-cn.com/problems/two-sum/description/
 *
 * algorithms
 * Easy (45.55%)
 * Total Accepted:    312K
 * Total Submissions: 685K
 * Testcase Example:  '[2,7,11,15]\n9'
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 
 * 示例:
 * 
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 
 * 
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{};
        }
        int[] result = new int[2];
        // for(int i=0;i<nums.length;i++){
        //     int diff = target-nums[i];
        //     for(int j=i+1;j<nums.length;j++){
        //         if(diff==nums[j]){
        //             result[0] = i;
        //             result[1] = j;
        //         }
        //     }
        // }
        Map<Integer,Integer> temp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            temp.put(target-nums[i], i);
            if(i<nums.length-1&&temp.get(nums[i+1])!=null){
                result[0] = temp.get(nums[i+1]);
                result[1] = i+1;
            }
        }
        return result;
    }
}

