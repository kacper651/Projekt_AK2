public class Main {

    public static void main(String args[]) {

        BFSGraph g1 = new BFSGraph(4);
        DFSGraph g2 = new DFSGraph(4);
        BFSGraph g3 = new BFSGraph(7);
        DFSGraph g4 = new DFSGraph(7);
        BFSGraph g5 = new BFSGraph(14);
        DFSGraph g6 = new DFSGraph(14);

        generateGraphAndMeasureTime1(g1, g2);
        generateGraphAndMeasureTime2(g3, g4);
        generateGraphAndMeasureTime3(g5, g6);

    }

    public static void generateGraphAndMeasureTime1(BFSGraph g1, DFSGraph g2) {
        //graf 1
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);
        g1.addEdge(2, 0);
        g1.addEdge(2, 3);
        g1.addEdge(3, 3);

        g2.addEdge(0, 1);
        g2.addEdge(0, 2);
        g2.addEdge(1, 2);
        g2.addEdge(2, 0);
        g2.addEdge(2, 3);
        g2.addEdge(3, 3);

        long start1 = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            g1.BFS(0);
        }
        long finish1 = System.nanoTime();
        long timePassedBFS = (finish1 - start1) / 100; //sredni czas na podstawie 100 pomiarow
        System.out.println("Sredni czas pomiaru dla metody BFS1: " + timePassedBFS);


        long start2 = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            g2.DFS(0);
        }
        long finish2 = System.nanoTime();
        long timePassedDFS = (finish2 - start2) / 100; //sredni czas na podstawie 100 pomiarow
        System.out.println("Sredni czas pomiaru dla metody DFS1: " + timePassedDFS);
    }

    public static void generateGraphAndMeasureTime2(BFSGraph g3, DFSGraph g4) {
        //graf 2
        g3.addEdge(0, 1);
        g3.addEdge(0, 2);
        g3.addEdge(1, 3);
        g3.addEdge(1, 4);
        g3.addEdge(2, 5);
        g3.addEdge(2, 6);
        g3.addEdge(1, 0);
        g3.addEdge(2, 0);
        g3.addEdge(3, 1);
        g3.addEdge(4, 1);
        g3.addEdge(5, 2);
        g3.addEdge(6, 2);

        g4.addEdge(0, 1);
        g4.addEdge(0, 2);
        g4.addEdge(1, 3);
        g4.addEdge(1, 4);
        g4.addEdge(2, 5);
        g4.addEdge(2, 6);
        g4.addEdge(1, 0);
        g4.addEdge(2, 0);
        g4.addEdge(3, 1);
        g4.addEdge(4, 1);
        g4.addEdge(5, 2);
        g4.addEdge(6, 2);

        long start1 = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            g3.BFS(0);
        }
        long finish1 = System.nanoTime();
        long timePassedBFS = (finish1 - start1) / 100; //sredni czas na podstawie 100 pomiarow
        System.out.println("Sredni czas pomiaru dla metody BFS2: " + timePassedBFS);


        long start2 = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            g4.DFS(0);
        }
        long finish2 = System.nanoTime();
        long timePassedDFS = (finish2 - start2) / 100; //sredni czas na podstawie 100 pomiarow
        System.out.println("Sredni czas pomiaru dla metody DFS2: " + timePassedDFS);
    }

    public static void generateGraphAndMeasureTime3(BFSGraph g5, DFSGraph g6) {
        //graf 3
        g5.addEdge(0, 1);
        g5.addEdge(0, 2);
        g5.addEdge(1, 3);
        g5.addEdge(1, 4);
        g5.addEdge(3, 7);
        g5.addEdge(3, 8);
        g5.addEdge(4, 9);
        g5.addEdge(4, 10);
        g5.addEdge(5, 11);
        g5.addEdge(5, 12);
        g5.addEdge(6, 13);
        g5.addEdge(2, 5);
        g5.addEdge(2, 6);
        g5.addEdge(1, 0);
        g5.addEdge(2, 0);
        g5.addEdge(3, 1);
        g5.addEdge(4, 1);
        g5.addEdge(7, 3);
        g5.addEdge(8, 3);
        g5.addEdge(9, 4);
        g5.addEdge(10, 4);
        g5.addEdge(11, 5);
        g5.addEdge(12, 5);
        g5.addEdge(13, 6);
        g5.addEdge(5, 2);
        g5.addEdge(6, 2);

        g6.addEdge(0, 1);
        g6.addEdge(0, 2);
        g6.addEdge(1, 3);
        g6.addEdge(1, 4);
        g6.addEdge(3, 7);
        g6.addEdge(3, 8);
        g6.addEdge(4, 9);
        g6.addEdge(4, 10);
        g6.addEdge(5, 11);
        g6.addEdge(5, 12);
        g6.addEdge(6, 13);
        g6.addEdge(2, 5);
        g6.addEdge(2, 6);
        g6.addEdge(1, 0);
        g6.addEdge(2, 0);
        g6.addEdge(3, 1);
        g6.addEdge(4, 1);
        g6.addEdge(7, 3);
        g6.addEdge(8, 3);
        g6.addEdge(9, 4);
        g6.addEdge(10, 4);
        g6.addEdge(11, 5);
        g6.addEdge(12, 5);
        g6.addEdge(13, 6);
        g6.addEdge(5, 2);
        g6.addEdge(6, 2);

        long start1 = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            g5.BFS(0);
        }
        long finish1 = System.nanoTime();
        long timePassedBFS = (finish1 - start1) / 100; //sredni czas na podstawie 100 pomiarow
        System.out.println("Sredni czas pomiaru dla metody BFS3: " + timePassedBFS);


        long start2 = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            g6.DFS(0);
        }
        long finish2 = System.nanoTime();
        long timePassedDFS = (finish2 - start2) / 100; //sredni czas na podstawie 100 pomiarow
        System.out.println("Sredni czas pomiaru dla metody DFS3: " + timePassedDFS);
    }
}
