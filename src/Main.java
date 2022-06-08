public class Main {

    public static void main(String args[]){

        //drzewo 1
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        DFS graph0 = new DFS();
        System.out.println("Depth-First-Search : ");
        graph0.DFS(root);

        BFS graph1 = new BFS(6);

        //drzewo 2
        graph1.insertEdge(0, 1);
        graph1.insertEdge(0, 3);
        graph1.insertEdge(0, 4);
        graph1.insertEdge(4, 5);
        graph1.insertEdge(3, 5);
        graph1.insertEdge(1, 2);
        graph1.insertEdge(1, 0);
        graph1.insertEdge(2, 1);
        graph1.insertEdge(4, 1);
        graph1.insertEdge(3, 1);
        graph1.insertEdge(5, 4);
        graph1.insertEdge(5, 3);
        System.out.println("\nBreadth First Traversal for the graph is:");
        graph1.BFS(0);
    }

}
