// Problem: Maximum Depth of Binary Tree
// Platform: LeetCode
// Approach: DFS recursion
// Time: O(n)
// Space: O(h)
class Solution {
      public int maxDepth(TreeNode root) {
          if(root == null) return  0;

          int left =maxDepth(root.left);
          int right=maxDepth(root.right);

           return 1+Math.max(left,right);
             }
     }