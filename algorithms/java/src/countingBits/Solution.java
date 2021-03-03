package countingBits;

import java.util.Arrays;

/*
338.
动态规划不是拍脑袋一下子想出来的，大多数情况下都是先分析记忆化搜索，然后优化为动态规划
鉴于现在水平有限，本次先只写直接计算
还有递归、记忆化、动态规划三种优化
先遍历数组num，遍历到谁谁调用countOnes函数计算二进制包含几个1
 */
public class Solution {
    public int[] countBits(int num) {
        int[] bits=new int[num+1];
        for (int i=0;i<=num;i++){
            bits[i]=countOnes(i);
        }
        return bits;
    }

    public int countOnes(int x){
        int ones=0;
        while(x>0){
            x&=(x-1);
            ones++;
        }
        return ones;
    }

//    主函数
    public static void main(String[] args) {
        int num=5;
        Solution ex=new Solution();
        int[] res=ex.countBits(num);
        System.out.println(Arrays.toString(res));
    }
}
