package nextGreaterElementII;

import java.util.Arrays;
import java.util.Stack;

/*
503：
使用单调栈处理
对原数组进行遍历
如果栈为空，则把当前元素放入栈内；
如果栈不为空，则需要判断当前元素和栈顶元素的大小：
    如果当前元素比栈顶元素大：说明当前元素是前面一些元素的「下一个更大元素」，则逐个弹出栈顶元素，直到当前元素比栈顶元素小为止。
    如果当前元素比栈顶元素小：说明当前元素的「下一个更大元素」与栈顶元素相同，则把当前元素入栈。

注：
此处peek,pop,push操作的都是数组下标i%n，而不是元素本身nums[i%n]


小结：
T(N)=O(N)，遍历了两次数组；
S(N)=O(N)，使用了额外空间「单调栈」，最坏情况下，栈内会保存数组的所有元素。
*/
public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        Arrays.fill(res,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<2*n;i++){
            while(!stack.isEmpty()&&nums[i%n]>nums[stack.peek()]){
                res[stack.pop()]=nums[i%n];
            }
            stack.push(i%n);
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums={1,2,1};
        Solution ex=new Solution();
        System.out.println(Arrays.toString(ex.nextGreaterElements(nums)));
    }
}
