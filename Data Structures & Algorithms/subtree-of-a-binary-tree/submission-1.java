/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root==null){
            return false;
        }

        if(isSameTree(root,subRoot)){
            return true;
        }

       if( isSubtree(root.left ,subRoot) || isSubtree(root.right,subRoot)){
            return true;
        }

        return false;

    }

    public boolean isSameTree(TreeNode a ,TreeNode b){
        if(a==null && b== null){
            return true;
        }
        if((a==null && b!=null) || (b==null && a!=null) || (a.val != b.val)){
            return false;
        }

        boolean leftTree = isSameTree(a.left,b.left);
        boolean rightTree = isSameTree(a.right,b.right);

        return leftTree && rightTree;


    }
}
