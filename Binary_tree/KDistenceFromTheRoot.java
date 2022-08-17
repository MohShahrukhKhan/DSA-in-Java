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
public class KDistenceFromTheRoot {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> kdistance(TreeNode root,int k){
      if(root==null||k<0)return new ArrayList<>();
      
      if(k==0){
           ans.add(root.data);
         
      }
      kdistance(root.left,k-1);
      kdistance(root.right,k-1);
        return ans;
     
    }
}
