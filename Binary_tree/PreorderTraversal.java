package com.masai.demo.Binary_tree;

import antlr.collections.List;



/*
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

Time Complexity:- Each Node is visited exactly once, so it takes O(N)

Space Complexity:-O(1)
*/
public class PreorderTraversal {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> preorder(TreeNode root){
        if(root==null)return new ArrayList<>();
        
        ans.add(root.data);
        preorder(root.left);
        preorder(root.right);
        
        return ans;
      
    }
}
