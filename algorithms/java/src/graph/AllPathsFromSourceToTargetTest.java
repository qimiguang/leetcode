package src.graph;

import org.junit.jupiter.api.Test;

import java.util.List;

class AllPathsFromSourceToTargetTest {

    @Test
    void allPathsSourceTarget() {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        AllPathsFromSourceToTarget t = new AllPathsFromSourceToTarget();
        List<List<Integer>> lists = t.allPathsSourceTarget(graph);

    }

}