// Last updated: 8/13/2025, 11:40:41 AM
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
    int cam = 0;
    public int minCameraCover(TreeNode root) {
        int need = minCam(root);
        if(need == -1) cam++;
        return cam;
    }

    public int minCam(TreeNode root) {
        if(root == null) return 0;
        int left = minCam(root.left);
        int right = minCam(root.right);
        if(left == -1 || right == -1) {
            cam++;
            return 1;
        }
        if(left == 1 || right == 1) {
            return 0;
        }
        else {
            return -1;
        }
    }
}