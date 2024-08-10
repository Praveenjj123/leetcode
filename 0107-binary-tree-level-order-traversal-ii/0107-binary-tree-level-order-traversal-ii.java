/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> qe=new LinkedList<>();
        if(root==null)
        {
            return ans;
        }
        qe.add(root);
        while(!qe.isEmpty())
        {
        int size=qe.size();
        List<Integer> curlis=new  ArrayList<Integer>();
        for(int i=0;i<size;i++)
        {
            TreeNode node=qe.poll();
            curlis.add(node.val);
            if(node.left!=null)
            {
                qe.add(node.left);
                
            }
            if(node.right!=null)
            {
                qe.add(node.right);
            }
           }
         ans.add(curlis);
      }
Collections.reverse(ans);
return ans;



    }
}