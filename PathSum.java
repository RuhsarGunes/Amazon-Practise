/*Given a binary tree and a sum, determine if the tree has a root-to-leaf path 
such that adding up all the values along the path equals the given sum.
Note: A leaf is a node with no children.

Example:
Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22*/

package pathsum;

public class PathSum {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    
    public static boolean hasPathSum(TreeNode root, int sum){
        if(root == null)
            return false;
        else if(root.left == null && root.right == null && sum - root.val == 0)
            return true;
        else
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);  
    }
    
    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(11);
        node.left.left.left = new TreeNode(7);
        node.left.left.right = new TreeNode(2);
        node.right.left = new TreeNode(13);
        node.right.right = new TreeNode(4);
        node.right.right.right = new TreeNode(1);
        
        boolean result = hasPathSum(node, 22);
        System.out.println(result);
    }
    
}
