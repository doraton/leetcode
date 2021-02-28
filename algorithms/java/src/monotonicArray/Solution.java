package monotonicArray;
/*
单调数列
既可能递增，也有可能递减
若遍历的过程中即遇到前一项<后一项，又遇到前一项>后一项，则不是单调数列
或运算符：有一个为true则为true，全部为false才为false
 */
public class Solution {
    public boolean isMonotonic(int[] A)  {
        boolean inc = true, dec = true;
        int n = A.length;
        for (int i = 0; i < n - 1; ++i) {
            if (A[i] > A[i + 1]) {
                inc = false;
            }
            if (A[i] < A[i + 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }
//    主函数
    public static void main(String[] args) {
        int[] A={1,2,3,4,5};
        Solution ex=new Solution();
        System.out.println(ex.isMonotonic(A));
    }
}
