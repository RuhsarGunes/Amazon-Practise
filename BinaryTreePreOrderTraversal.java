/*Given a binary tree, return the preorder traversal of its nodes' values.

Example:
Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]
Follow up: Recursive solution is trivial, could you do it iteratively?*/

package binarytreepreordertraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreOrderTraversal {
    
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public static List<Integer> preOrderTraversal(TreeNode root){
        //root, left, right
        List<Integer> list =  new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return list;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            list.add(curr.val);
            if(curr.right != null){
                stack.push(curr.right);
            }
            if(curr.left != null){
                stack.push(curr.left);
            }
        }
       
        return list;
    }
    
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = null;
        node.right =  new TreeNode(2);
        node.right.left = new TreeNode(3);
        node.right.right = null;
        
        List<Integer> result = preOrderTraversal(node);
        for(int i : result){
            System.out.println(i);
        }
    }
    
}
