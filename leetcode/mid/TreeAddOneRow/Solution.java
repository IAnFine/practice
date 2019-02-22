package TreeAddOneRow;


class Solution {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        addRow(root,v,d);
        return root;
    }

    public void addRow(TreeNode root, int v, int d) {


        if (d > 2) {
            if (root.left != null)  addRow(root.left, v, d - 1);
            if (root.right != null) addRow(root.right, v, d - 1);
        }
        else {

            TreeNode nodea = new TreeNode(v);

            nodea.left = root.left;
            root.left = nodea;

            TreeNode nodeb = new TreeNode(v);
            nodeb.right = root.right;
            root.right = nodeb;
        }



    }
}


/**
 * Definition for a binary tree node.*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
