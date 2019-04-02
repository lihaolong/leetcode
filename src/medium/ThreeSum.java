package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description: 三数之和
 * @author: lihaolong
 * @create: 2018-12-05 22:24
 **/
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSum = new ArrayList<>();
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        List<Integer> sum = new ArrayList<>();
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            sum.add(nums[i]);
                            sum.add(nums[j]);
                            sum.add(nums[k]);
                            threeSum.add(sum);
                        }
                    }
                }
            }
        }
        return threeSum;
    }
}