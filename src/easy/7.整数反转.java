/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public static int reverse(int x) {
        long temp = Long.valueOf(x);
        long l = temp<0 ? -temp : temp;
        String xStr = String.valueOf(l);
        char[] xArr = xStr.toCharArray();
        int length = xArr.length;
        for(int i = 0;i<length/2;i++){
            char temp2 = xArr[i];
            xArr[i] = xArr[length-1-i];
            xArr[length-1-i] = temp2;
        }
        xStr = new String(xArr);
        int res = 0;
        long l2 = Long.valueOf(xStr);
        if(l2<=Math.pow(2, 31)-1){
            res = Integer.parseInt(xStr);
        }
        return x > 0 ? res : -res;
    }
    
    public static void main(String[] args){
        reverse(10);
    }
}
// @lc code=end

