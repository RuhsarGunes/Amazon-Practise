/*Given a binary tree, return the inorder traversal of its nodes' values.
Example:
Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
Follow up: Recursive solution is trivial, could you do it iteratively?*/

package binarytreeinordertraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInOrderTraversal {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    
    public static List<Integer> inOrderTraversal(TreeNode root){
        //left, root, right
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return list;
        }
        TreeNode curr = root;
        while(!stack.isEmpty() || curr != null){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
    }
    
    public static void main(String[] args) {
      TreeNode node = new TreeNode(1);
      node.left = null;
      node.right = new TreeNode(2);
      node.right.left = new TreeNode(3);
      
      List<Integer> result = inOrderTraversal(node);
      for(int i : result){
          System.out.println(i);
      }
    }
    
}
