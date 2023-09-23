class TreeNode<T> {
    T val;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    //Preorder Traversal - Recursive
    public static void preorderTraversalR(TreeNode<Integer> root) {
        if(root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preorderTraversalR(root.left);
        preorderTraversalR(root.right);
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<Integer>(1);
        root.left = new TreeNode<Integer>(2);
        root.right = new TreeNode<Integer>(3);
        root.left.left = new TreeNode<Integer>(4);
        root.left.right = new TreeNode<Integer>(5);
        root.right.left = new TreeNode<Integer>(6);
        root.right.right = new TreeNode<Integer>(7);
        System.out.print("Pre-Order Traversal Recursive: ");
        preorderTraversalR(root);
    }
}