package twoSum;

/*
暴力法
要让i与j取不同的值
返回的是一个新数组
没有结果时抛出异常类

小结:暴力法的效率较低
 */

import java.util.Arrays;

public class Solution {
	public int[] twoSum (int[] nums,int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]==target-nums[i]) {
					return new int[] {i,j};					
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution"); 
	}

	//    主函数
	public static void main(String arg[]){
		int nums[]={2,7,11,15};
		int target=9;
		Solution ex=new Solution();
		System.out.println(Arrays.toString(ex.twoSum(nums,target)));
	}
}