/*Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, 
then sum node values up as the new value of the merged node. Otherwise, 
the NOT null node will be used as the node of new tree.
Example 1:
Input: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
Output: 
Merged tree:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7*/

package mergetwobinarytrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MergeTwoBinaryTrees {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){
            return null;
        }
        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode node = new TreeNode(val);
        
        node.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        node.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
                
        return node;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(5);
        
        TreeNode t2 =  new TreeNode(2);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        t2.left.right = new TreeNode(4);
        t2.right.right = new TreeNode(7);
        
        TreeNode node = mergeTrees(t1, t2);
       //bfs
        Queue<TreeNode>  q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if(node != null){
            q.add(node);
        }
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode temp = q.remove();
                list.add(temp.val);
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }
        
        for(int i : list){
            System.out.println(i);
        }
    }
    
}
