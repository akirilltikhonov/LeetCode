package easy.binaryTreeInorderTraversal;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void inorderTraversal() {
        TreeNode root = new TreeNode(1, null,
                new TreeNode(2,
                        new TreeNode(3, null, null)
                        , null));
        assertThat(solution.inorderTraversal(root)).isEqualTo(List.of(1, 3, 2));
    }
}