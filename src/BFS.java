import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

//klasa reprezentujaca BFS na drzewie uzywajac reprezentacji listowej
class BFSGraph {
    private int V;   // liczba wierczholkow
    private LinkedList<Integer> adj[]; //tablica list w celu reprezentacji listy sasiedztwa

    // konstruktor
    BFSGraph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // dodawanie krawedzi do drzewa
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // przechodzi drzewo od wybranego zrodla metoda BFS
    void BFS(int source) {
        // zaznacz wszystkie wierzcholki jako niezwiedzone
        boolean visited[] = new boolean[V];

        // zbuduj kolejke dla BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // oznacz obecny wierzchołek jako zwiedzony
        visited[source] = true;
        queue.add(source);

        while (queue.size() != 0) {
            // zabieraj po kolei wierzcholki z kolejki
            source = queue.poll();
            //System.out.print(s + " ");

            // znajdz wszystkie wierzcholki sasiadujace z wierzcholkiem zabranym
            // jesli sasiad nie był zwiedzony, zaznacz go i ustaw w kolejce
            Iterator<Integer> i = adj[source].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}

