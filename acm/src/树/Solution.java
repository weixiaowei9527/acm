package 树;
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    public int TreeDepth(TreeNode root) {
    	/*求树的高度*/
        if(root!=null){
        	int left = TreeDepth(root.left);
          
            int right = TreeDepth(root.right);
            return left > right?left+1:right+1;
        }else{
            return 0;
        }
    }
}
