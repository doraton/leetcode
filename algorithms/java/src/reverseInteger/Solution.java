package reverseInteger;
/*
#7.
x是旧值，tem是每次取出的末尾数字，last是更新前的值，res是更新后的值
解决反转的问题，先取余再除以10，直到x==0为止
考虑原本数字不溢出，反转后数字溢出的情况。将result更新后，将last与result/10比较，若是不等则溢出。用数学如何证明？
*/
public class Solution {
    public int reverse(int x) {
        int res = 0;
        int last = 0;
        while(x!=0) {
            //每次取末尾数字
            int tmp = x%10;
            last = res;
            res = res*10 + tmp;
            //判断整数溢出
            if(last != res/10)
            {
                return 0;
            }
            x /= 10;
        }
        return res;
    }

    //    主函数
    public static void main(String arg[]){
        int x=123456;
        Solution ex=new Solution();
        System.out.println(ex.reverse(x));
    }
}
