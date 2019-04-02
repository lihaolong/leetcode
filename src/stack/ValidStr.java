package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @program: leetcode
 * @description:
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 * @author: lihaolong
 * @create: 2019-01-06 21:09
 **/
public class ValidStr {
    public static boolean isValid(String s) {
        if("".equals(s)||s==null)
            return true;
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c:chars){
            if(stack.empty()){
                stack.push(c);
            }else{
                if(map.get(stack.peek()).equals(c))
                    stack.pop();
                else{
                    stack.push(c);
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args){
        String s = "([)]";
        System.out.println(isValid(s));
    }
}
