package twoSum;

import java.util.HashMap;
import java.util.Map;

//两遍哈希表
public class twoSum2 {
    public int[] twoSum2(int[] nums,int target) {
        Map <Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++) {
            int complement=target-nums[i];
            //排除自加等于target的情况
            if(map.containsKey(complement)&&map.get(complement)!=i) {
                return new int[] {i,map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
//小结：两遍哈希表比暴力法效率要高
