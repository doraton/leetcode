package romanToInteger;

import java.util.*;

/*Q:给定一个罗马数字，将其转换成整数。
* 1.小值在大值的右边为＋，小值在大值的左边为-，有6个特例
* 2.输入确保在 1 到 3999 的范围内。
* */

public class Solution {
    public int romanToInt(String s){
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1;i < s.length(); i ++) {
            int num = getValue(s.charAt(i));
            if(preNum < num) {
                sum -= preNum;
            } else {
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }

    private int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String arg[]){
        String s="XVII";
        Solution ex=new Solution();
        int num=ex.romanToInt(s);
        if (num==0)
            System.out.println("请输入正确的值");
        else
            System.out.printf("该罗马数字对应的值为：%d",num);
    }
}
