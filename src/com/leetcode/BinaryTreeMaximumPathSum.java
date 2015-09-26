package com.leetcode;

public class BinaryTreeMaximumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeMaximumPathSum btmp = new BinaryTreeMaximumPathSum();
		TreeNode root = new TreeNode(1);
		System.out.println(btmp.maxPathSum(root));
	}
	
	public int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null)
            return 0;
        max = Integer.MIN_VALUE;
        maxPathSumCore(root);
        return max;
    }
    
    public int maxPathSumCore(TreeNode root){
        if(root==null)
            return 0;
        int left = maxPathSumCore(root.left);
        int right = maxPathSumCore(root.right);
        int cur = root.val + left>0?left:0 + right>0?right:0;
        if(cur>max)
            max = cur;
        return cur;
    }
}
