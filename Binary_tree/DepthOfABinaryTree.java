package com.masai.demo.Binary_tree;
/*
class TreeNode{
  int data;
  TreeNode left;
  TreeNode right;
  
  TreeNode(int data){
    this.data = data;
    this.left = this.right = null;
  }
}
*/
public class DepthOfABinaryTree {
    public int maxDepth(TreeNode root){
        if(root==null)return 0;
        
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
      }
}
