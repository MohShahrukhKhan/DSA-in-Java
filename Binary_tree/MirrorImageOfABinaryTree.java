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
public class MirrorImageOfABinaryTree {
    public TreeNode mirrorTree(TreeNode root){
        //write your code here. 
        if(root==null)return root;
        TreeNode left=mirrorTree(root.right);
        TreeNode right=mirrorTree(root.left);
        root.right=right;
        root.left=left;
        
         return root;
        
          }
}
