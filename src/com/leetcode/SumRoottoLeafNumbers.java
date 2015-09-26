package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SumRoottoLeafNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node5 = new TreeNode(5);
		TreeNode node3 = new TreeNode(3);
		TreeNode node2 = new TreeNode(2);
		TreeNode node7 = new TreeNode(7);
		TreeNode node0 = new TreeNode(0);
		TreeNode node6 = new TreeNode(6);
		TreeNode node01 = new TreeNode(0);
		node5.left = node3;
		node5.right = node2;
		node3.left = node7;
		node3.right = node0;
		node2.left = node6;
		node0.right = node01;
		SumRoottoLeafNumbers sl = new SumRoottoLeafNumbers();
		System.out.println(sl.sumNumbers(node5));
	}

	public String addHigh(String n, String add) {
		String s = add + "" + n + "";
		return s;
	}

	public List<String> getAllNumbers(TreeNode root) {
		List<String> list = new ArrayList<String>();
		if (root == null)
			return list;
		if (root.left == null && root.right == null) {
			list.add(root.val+"");
			return list;
		}
		if (root.left != null) {
			List<String> fromLeft = getAllNumbers(root.left);
			for (String i : fromLeft)
				list.add(addHigh(i, root.val+""));
		}
		if (root.right != null) {
			List<String> fromRight = getAllNumbers(root.right);
			for (String i : fromRight)
				list.add(addHigh(i, root.val+""));
		}
		return list;
	}

	public int sumNumbers(TreeNode root) {
		if (root == null)
			return 0;
		List<String> all = getAllNumbers(root);
		int sum = 0;
		for (String i : all)
			sum += Integer.parseInt(i);
		return sum;
	}

}
