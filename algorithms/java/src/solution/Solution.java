package solution;

import java.util.Stack;

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
