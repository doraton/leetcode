package _1047;


import java.util.Stack;

/*
1047.
考点：栈
遍历原数组，若栈内无元素，则入栈
若栈内有元素，比较数组当前指向的元素和栈顶元素
若相同，则栈顶元素出栈
若不同，则数组指向元素入栈
 */
public class Solution{
    public String removeDuplicates(String S) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (!st.empty() && S.charAt(i) == st.peek()) {
                st.pop();
            } else {
                st.add(S.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        for (Character c : st) {
            res.append(c);
        }
        return res.toString();
    }
}