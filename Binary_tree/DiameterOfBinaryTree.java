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
public class DiameterOfBinaryTree {
    int ans=0;
    public int TreeD(TreeNode root){
    BinaryDiameter(root);
    return ans;
    }
    
    public int BinaryDiameter(TreeNode root){
        if(root==null)return 0;
        int ld=BinaryDiameter(root.left);
        int rd=BinaryDiameter(root.right);
        ans=Math.max(ans,1+ld+rd);
        return  1+Math.max(ld,rd);
    }
}
