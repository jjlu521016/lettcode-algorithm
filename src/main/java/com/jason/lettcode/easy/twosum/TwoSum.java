package com.jason.lettcode.easy.twosum;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;

/**
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 *
 * https://leetcode-cn.com/problems/two-sum/description/
 *
 * algorithms
 * Easy (45.53%)
 * Total Accepted:    307.9K
 * Total Submissions: 676.2K
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
 * @author jason
 */
public class TwoSum {

    /**
     * 解题思路：
     * 可以创建一个Map，奖数组元素装入进去，之后比较前后两个数的和
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> track = new HashMap<Integer, Integer>();
        //数组元素的个数
        int length  = nums.length;
        for (int i = 0; i < length; i++){
            if(track.containsKey(nums[i])){
                int left = track.get(nums[i]);
                return new int[] {left,i};
            }else{
                //Map，key为目标减去当前遍历到的值，value为当前下标
                track.put(target - nums[i],i);
            }
        }
        //找不到抛异常
        throw new IllegalArgumentException("没有找到结果");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        TwoSum twoSum = new TwoSum();

        Instant start = Instant.now();

        int[] result = twoSum.twoSum(nums,target);

        Instant end = Instant.now();

        System.out.println("方法执行耗时(ms):"+ Duration.between(start,end).toMillis());

        System.out.println("目标数据为:"+ target+".在当前数组中找到满足条件的数据.数组下标为:{"+result[0]+","+result[1]+"}");


    }
}
