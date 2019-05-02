/*Given a binary tree, return the level order traversal of its nodes' values. 
(ie, from left to right, level by level).
For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]*/

package binarytreelevelordertraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public static List<List<Integer>> levelOrderTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return result;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode curr = q.remove();
                list.add(curr.val);
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            result.add(list);
        }
        return result; 
    }
    public static void main(String[] args) {
       TreeNode node = new TreeNode(3);
       node.left = new TreeNode(9);
       node.right = new TreeNode(20);
       node.right.left = new TreeNode(15);
       node.right.right = new TreeNode(7);
       
       List<List<Integer>> result = levelOrderTraversal(node);
       for(int i = 0; i < result.size(); i++){
           System.out.println(result.get(i));
       }
       
    }
    
}
