package haloapping.github.io.level.easy;

import org.junit.*;

import static org.junit.Assert.*;

@Ignore
public class AdjacentNodesTest {
    private AdjacentNodes adjacentNodes = new AdjacentNodes();
    private static int[][] graph1;
    private static int[][] graph2;
    private static int[][] singleNode;
    private static int[][] completeGraph;
    private static int[][] noEdgeGraph;
    private static int[][] largeGraph;

    @BeforeClass
    public static void setup() {
        graph1 = new int[][]{
                {0, 1, 0, 0},
                {1, 0, 1, 1},
                {0, 1, 0, 1},
                {0, 1, 1, 0}
        };
        graph2 = new int[][]{
                {0, 1, 0, 1, 1},
                {1, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {1, 0, 1, 0, 1},
                {1, 0, 0, 1, 0}
        };
        singleNode = new int[1][1];
        completeGraph = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i != j) {
                    completeGraph[i][j] = 1;
                }
            }
        }
        noEdgeGraph = new int[5][5];
        largeGraph = new int[25000][25000];
        largeGraph[5000][20000] = 1;
        largeGraph[20000][5000] = 1;

    }

    @Test
    public void test1() {
        assertTrue(adjacentNodes.adjacent(graph1, 0, 1));
    }

    @Test(timeout = 100)
    public void test2() {
        assertFalse(adjacentNodes.adjacent(graph2, 0, 2));
    }

    @Test(timeout = 100)
    public void test3() {
        assertTrue(adjacentNodes.adjacent(graph2, 3, 0));
    }

    @Test(timeout = 100)
    public void test4() {
        assertFalse(adjacentNodes.adjacent(graph2, 4, 1));
    }

    @Test(timeout = 100)
    public void test5() {
        assertFalse(adjacentNodes.adjacent(graph2, 0, 0));
    }

    @Test(timeout = 100)
    public void test6() {
        assertFalse(adjacentNodes.adjacent(singleNode, 0, 0));
    }

    @Test(timeout = 100)
    public void test7() {
        assertTrue(adjacentNodes.adjacent(completeGraph, 0, 4));
    }

    @Test(timeout = 100)
    public void test8() {
        assertFalse(adjacentNodes.adjacent(completeGraph, 2, 2));
    }

    @Test(timeout = 100)
    public void test9() {
        assertFalse(adjacentNodes.adjacent(noEdgeGraph, 4, 0));
    }

    @Test(timeout = 100)
    public void test10() {
        assertTrue(adjacentNodes.adjacent(largeGraph, 5000, 20000));
    }

    @Test(timeout = 100)
    public void test11() {
        assertFalse(adjacentNodes.adjacent(largeGraph, 21413, 8079));
    }
}
