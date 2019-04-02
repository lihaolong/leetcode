package stack;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description:
 * 给定一个二叉树，返回它的 前序 遍历。
 *
 *  示例:
 *
 * 输入: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * 输出: [1,2,3]
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 * @author: lihaolong
 * @create: 2019-01-06 21:26
 * Definition for a binary tree node.
 *  * public class TreeNode {
 *  *     int val;
 *  *     TreeNode left;
 *  *     TreeNode right;
 *  *     TreeNode(int x) { val = x; }
 *  * }
 **/
public class BinaryTreePreEach {
    static List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root!=null) {
            result.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return result;
    }
    public static List<Integer> preorderTraversal2(TreeNode root) {
        if(root==null)
            return result;
        TreeNode right = root.right;
        result.add(root.val);
        while(root!=null){
            if(root.left!=null)
                result.add(root.left.val);
            if(root.right!=null)
                result.add(root.right.val);
            root = root.left;
        }
        while(right!=null){
            if(right.left!=null)
                result.add(right.left.val);
            if(right.right!=null)
                result.add(right.right.val);
            right = right.left;
        }
        return result;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        System.out.println(preorderTraversal2(root));
    }
}
