package medium.insertIntoABinarySearchTree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void insertIntoBST() {
        TreeNode left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode root = new TreeNode(4, left, new TreeNode(7));
        assertThat(solution.insertIntoBST(root, 5)).isEqualTo(root);
    }
}