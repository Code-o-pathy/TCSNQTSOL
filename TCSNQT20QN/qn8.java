//check if a binary tree is a binary search tree
//binary search tree is a tree which has all the elements in its left subtree smaller than root node and all the elements in right subtreee greater than root node;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        this.data = x;
        this.left = this.right = null;
    }
}

public class qn8 {
    public static void main(String args[]) {
        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(5);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);

        root.right = new TreeNode(15);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(17);

        int lessThan = Integer.MIN_VALUE;   
        int moreThan = Integer.MAX_VALUE;
        boolean ans = isBST(root, lessThan, moreThan);
        System.out.println(ans);
    }

    public static boolean isBST(TreeNode root, int less, int more) {
        if (root == null)
            return true;
        if (root.data >= more || root.data <= less)
            return false;
        boolean ansLeft = isBST(root.left, less, root.data);
        boolean ansRight = isBST(root.right, root.data, more);
        return ansLeft && ansRight;
    }
}


//qn 9 and qn 10 already done in previous sections
