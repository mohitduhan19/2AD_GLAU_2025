package AD.Lec7_Lab;

import java.util.ArrayList;
import java.util.List;

public class Traversals {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public void preorder(TreeNode root , List<Integer> ans){
        if(root == null)return;
        ans.add(root.val);
        preorder(root.left , ans);
        preorder(root.right , ans);
    }

    public List<Integer> preorder(TreeNode root) {
        if(root == null)return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        preorder(root , ans);
        return ans;
    }
}
