import java.util.LinkedList;
import java.util.Queue;

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

    static void levelOrderTraversal(TreeNode<Integer> root) {
        Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();

        if (root == null)
            return;

        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {

                if(q.peek().left != null) {
                    q.add(q.peek().left);
                }
                if(q.peek().right != null) {
                    q.add(q.peek().right);
                }
                System.out.print(q.poll().val + " ");
            }
        }

    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<Integer>(1);
        root.left = new TreeNode<Integer>(2);
        root.right = new TreeNode<Integer>(3);
        root.left.left = new TreeNode<Integer>(4);
        root.left.right = new TreeNode<Integer>(5);
        root.right.left = new TreeNode<Integer>(6);
        root.right.right = new TreeNode<Integer>(7);

        System.out.print("Levelorder Traversal: ");
        levelOrderTraversal(root);
    }
}