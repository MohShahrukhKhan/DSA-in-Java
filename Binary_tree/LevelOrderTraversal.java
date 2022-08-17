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
}Time Complexity:
O(n) where n is the number of nodes in the binary tree.

Space Complexity:
O(h) where h is the maximum depth of binary tree.
*/
public class LevelOrderTraversal {
    public List<List<Integer>> levelorderTraversal(TreeNode root){
        if(root==null){
           return new ArrayList<>();
       }
       List<List<Integer>> ans=new ArrayList<>();
       Queue<TreeNode> queue=new LinkedList<>();
       queue.add(root);
       while(queue.isEmpty()!=true){
       int size =queue.size();
       List<Integer> list=new ArrayList<>();
       for(int i=0;i<size;i++){
           TreeNode temp=queue.remove();
           list.add(temp.data);
           if(temp.left!=null)queue.add(temp.left);
            if(temp.right!=null)queue.add(temp.right);
       }
          ans.add(list);
           
       }
       return ans;
   }
}
