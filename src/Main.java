public class Main {

    public static void main(String args[]){

        BFSGraph g1 = new BFSGraph(4);

        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);
        g1.addEdge(2, 0);
        g1.addEdge(2, 3);
        g1.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g1.BFS(2);

        DFSGraph g2 = new DFSGraph(4);

        g2.addEdge(0, 1);
        g2.addEdge(0, 2);
        g2.addEdge(1, 2);
        g2.addEdge(2, 0);
        g2.addEdge(2, 3);
        g2.addEdge(3, 3);

        System.out.println(
                "\nFollowing is Depth First Traversal "
                        + "(starting from vertex 2)");

        g2.DFS(2);
    }

}
