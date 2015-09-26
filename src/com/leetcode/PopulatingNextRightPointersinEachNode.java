package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeLinkNode node1 = new TreeLinkNode(1);
		TreeLinkNode node2 = new TreeLinkNode(2);
		TreeLinkNode node3 = new TreeLinkNode(3);
		
		node1.left = node2;
		node1.right = node3;
		
		connect(node1);
	}

	public static void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
        if(root==null)
            return;
        
        queue.offer(root);
        
        int nextLineNum = 0;
        int curLineNum = 1;
        TreeLinkNode pre = null;
        while(!queue.isEmpty()){
            TreeLinkNode node = queue.poll();
            curLineNum--;
            
            if(node.left!=null){
                queue.offer(node.left);
                nextLineNum++;
            }
            
            if(node.right!=null){
                queue.offer(node.right);
                nextLineNum++;
            }
            
            if(pre!=null)
                pre.next = node;
            
            pre = node;
            
            if(curLineNum==0){
                node.next = null;
                curLineNum = nextLineNum;
                nextLineNum = 0;
                pre = null;
            }   
        }        
    }
}
