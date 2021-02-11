package reverseInteger;

/*1.解决反转的问题，先取余再除以10，直到x==0为止
*2.考虑原本数字不溢出，反转后数字溢出的情况。last表示result的旧值，将result更新后，将last与result/10比较，若是不等则溢出。
* 思路2用数学如何证明？
* */
public class reverseInteger {
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
}
