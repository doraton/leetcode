package palindromeNumber;

/*通过反转后半部分的数字与前半部分进行比较
首先排除两种情况：1.负数一定不是回文数    2.大于0但是个位是0的数一定不是回文数（0是回文数）
* */
public class palindromeNumber {
    public boolean palindromeNumber(int x) {
        if (x < 0 || x != 0 && x % 10 == 0){
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x==revertedNumber||x==revertedNumber/10;
    }
    //主方法
    public static void main(String[] arg){
        int x=12345;
        palindromeNumber a=new palindromeNumber();
        boolean result=a.palindromeNumber(x);
        if (result==false)
            System.out.println("非回文数");
        else
            System.out.println("是回文数");
    }
}

