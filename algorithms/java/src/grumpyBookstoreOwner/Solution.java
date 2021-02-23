package grumpyBookstoreOwner;
/*
1052.
有三个关键数据：1.每分钟进来的顾客数量2.老板在每分钟生气否3.老板可以平复自己心情的时间
解决问题的关键：尽可能使不生气时间覆盖每次生气时间，且这些时间内进入店铺的客户数最多
解题的思路为滑动窗口，先计算所有不生气的时间里光临的顾客总数，计入total
再计算在长度为x的时间滑块里，生气气走的顾客总数，最大值为increase
两值相加
 */
public class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        //先计算不生气的顾客总数
        int total = 0;
        int n = customers.length;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                total += customers[i];
            }
        }
        //再计算时间滑块
        int increase = 0;
        for (int i = 0; i < X; i++) {
            increase += customers[i] * grumpy[i];
        }
        int maxIncrease = increase;
        for (int i = X; i < n; i++) {
            increase = increase - customers[i - X] * grumpy[i - X] + customers[i] * grumpy[i];
            maxIncrease = Math.max(maxIncrease, increase);
        }
        return total + maxIncrease;
    }
//主函数
    public static void main(String[] args) {
        int[] customers={1,0,1,2,1,1,7,5},gurmpy={0,1,0,1,0,1,0,1};
        int x=3;
        Solution ex=new Solution();
        System.out.println(ex.maxSatisfied(customers,gurmpy,x));
    }
}
