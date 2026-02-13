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
/*
Problem: Check if a Binary Tree is Height Balanced

A tree is balanced if for every node:
|height(left) - height(right)| <= 1

Brute Force:
For every node, compute height separately and check balance.
Time: O(N^2)

Optimal:
Compute height while checking balance.
Return -1 if subtree is unbalanced to stop early.
Time: O(N)
Space: O(H) recursion stack
*/

 class Solution {
    public boolean isBalanced(TreeNode root) {
        return Height(root)!=-1;
    }
    public int Height(TreeNode root){
        if(root == null) return 0;

        int left =Height(root.left);
        if(left==-1) return -1;
        int right =Height(root.right);
        if(right==-1) return -1;


        if(Math.abs(left-right)>1) return -1;


        return 1+Math.max(left,right);

    }
}
// -------- BRUTE FORCE APPROACH --------
// Time: O(N^2)
// Recomputes height for each node

// class Solution {
//     public boolean isBalanced(TreeNode root) {

//          if(root == null) return true;

//          int left =Height(root.left);
//          int right=Height(root.right);

//         if(Math.abs(left-right)>1) return false;

//         return isBalanced(root.left) && isBalanced(root.right);
//     }
//     public int Height(TreeNode root){
//         if(root == null) return 0;
//         return 1+Math.max(Height(root.left),Height(root.right));
//     }
// }