/*Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
Note: A leaf is a node with no children.
Example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.*/
package maxdepthofbinarytree;

public class MaxDepthOfBinaryTree {
    
    public static class TreeNode{
        int val; 
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val = val;
        }
    }
    
    public static int maxDepth(TreeNode root){
        int maxDepth = 0;
        if(root == null)
            return maxDepth;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        maxDepth = Math.max(left, right) + 1;
        
        return maxDepth;
    }
    
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        
        int result = maxDepth(node);
        System.out.println(result);
    }
    
}
