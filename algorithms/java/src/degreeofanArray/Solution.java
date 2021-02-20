package degreeofanArray;

import java.util.HashMap;
import java.util.Map;

/* #697
原数组的最短连续子数组，保证新数组的度不变、连续，输出新数组的长度
用哈希表统计每个数出现的次数，以及第一次出现和最后一次出现的位置
最后遍历哈希表，找到出现次数最多的数，并让他的最后出现位置-最初出现位置，返回数值小的数
 */
public class Solution {
    public int findShortestSubArray(int[] nums)  {
//        遍历原数组，不存在该键则put键值对；存在该键则get修改次数和最后出现位置
        Map<Integer, int[]> map = new HashMap<Integer, int[]>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            } else {
                map.put(nums[i], new int[]{1, i, i});
            }
        }
//        遍历哈希表，最大数组长度小于Value中出现次数则更新最大数组长度和最小长度；最大数组长度等于Value中出现次数，则比较两值
        int maxNum = 0, minLen = 0;
        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
            int[] arr = entry.getValue();
            if (maxNum < arr[0]) {
                maxNum = arr[0];
                minLen = arr[2] - arr[1] + 1;
            } else if (maxNum == arr[0]) {
                if (minLen > arr[2] - arr[1] + 1) {
                    minLen = arr[2] - arr[1] + 1;
                }
            }
        }
        return minLen;
    }

//    主函数
    public static void main(String arg[]){
        int[] nums={1,2,2,3,1,4,2};
        Solution ex=new degreeofanArray.Solution();
        System.out.println(ex.findShortestSubArray(nums));
    }
}

