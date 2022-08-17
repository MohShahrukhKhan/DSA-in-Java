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
}Time Complexity: Each Node is visited exactly once, so it takes O(N)
Space Complexity :-O(1)
*/
public class PostorderTraversal {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> postorder(TreeNode root){
     if(root==null)return new ArrayList<>();
        
      
        postorder(root.left);
         
        postorder(root.right);
         ans.add(root.data);
        
        return ans;
    }
}
