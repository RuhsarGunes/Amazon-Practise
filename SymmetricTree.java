/*Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
    1
   / \
  2   2
 / \ / \
3  4 4  3
 
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3*/
package symmetrictree;

public class SymmetricTree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    
    public static boolean isSymmetric(TreeNode root){
        return root == null || isSymmetricHelper(root.left, root.right);
    }
    
    private static boolean isSymmetricHelper(TreeNode left, TreeNode right){
        if(left == null || right == null){
            return left == right;
        }else if(left.val != right.val){
            return false;
        }else{
            return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
        }
    }
    
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        node1.left = new TreeNode(2);
        node1.right = new TreeNode(2);
        node1.left.left = new TreeNode(3);
        node1.left.right = new TreeNode(4);
        node1.right.left = new TreeNode(4);
        node1.right.right = new TreeNode(3);
        
        boolean result1 = isSymmetric(node1);
        System.out.println(result1);
        
        TreeNode node2 = new TreeNode(1);
        node2.left = new TreeNode(2);
        node2.right = new TreeNode(2);
        node2.left.right = new TreeNode(3);
        node2.right.right = new TreeNode(3);
        
        boolean result2 = isSymmetric(node2);
        System.out.println(result2);
        
    }
    
}
