package easy.searchInABinarySearchTree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void searchBST() {
        TreeNode toFind = new TreeNode(2, new TreeNode(1, null, null), new TreeNode(3, null, null));
        TreeNode root = new TreeNode(
                4,
                toFind,
                new TreeNode(7, null, null)
        );
        assertThat(solution.searchBST(root, 2)).isEqualTo(toFind);
    }
}