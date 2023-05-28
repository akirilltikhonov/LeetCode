package easy.sameTree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isSameTreeTrue() {
        TreeNode p = new TreeNode(1, null,
                new TreeNode(2,
                        new TreeNode(3, null, null)
                        , null));
        TreeNode q = new TreeNode(1, null,
                new TreeNode(2,
                        new TreeNode(3, null, null)
                        , null));
        assertThat(solution.isSameTree(p, q)).isTrue();
    }

    @Test
    void isSameTreeFalse() {
        TreeNode p = new TreeNode(1, null,
                new TreeNode(2,
                        new TreeNode(3, null, null)
                        , null));
        TreeNode q = new TreeNode(1, null,
                new TreeNode(3,
                        new TreeNode(2, null, null)
                        , null));
        assertThat(solution.isSameTree(p, q)).isFalse();
    }
}