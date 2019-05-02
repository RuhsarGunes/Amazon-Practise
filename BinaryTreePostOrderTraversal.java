/*Given a binary tree, return the postorder traversal of its nodes' values.
Example:
Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [3,2,1]

Follow up: Recursive solution is trivial, could you do it iteratively?*/

package binarytreepostordertraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostOrderTraversal {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    
    public static List<Integer> postOrderTraversal(TreeNode root){
        //standard dfs; left, right, root
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return list;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            list.add(0, curr.val);
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
        TreeNode node =  new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);
        
        List<Integer> result = postOrderTraversal(node);
        for(int i : result){
            System.out.println(i);
        }
    }
    
}
