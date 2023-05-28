package easy.binaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        final List<Integer> list = new ArrayList<>();
        TreeNode current = root;
        TreeNode previous;
        while (current != null) {
            if (current.left == null) {
                list.add(current.val);
                current = current.right;
            } else {
                previous = current.left;
                while (previous.right != null) {
                    previous = previous.right;
                }
                previous.right = current;

                TreeNode temp = current;
                current = current.left;
                temp.left = null;
            }
        }
        return list;
    }
}