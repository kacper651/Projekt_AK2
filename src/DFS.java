import java.util.Iterator;
import java.util.LinkedList;

//klasa reprezentujaca DFS na drzewie uzywajac reprezentacji listowej


    class DFSGraph {
        private int V; // ilosc wierzcholkow

        // tablica list w celu
        // reprezentacji listy sasiedztwa
        private LinkedList<Integer> adj[];

        // konstruktor
        DFSGraph(int v)
        {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        // dodawanie krawedzi do grafu
        void addEdge(int v, int w)
        {
            adj[v].add(w); // Add w to v's list.
        }

        // przechodzenie drzewa od wybranego zrodla metoda DFS
        void DFSUtil(int v, boolean visited[])
        {
            // zaznacz zwiedzone wierzcholki
            visited[v] = true;
            //System.out.print(v + " ");

            // powtorz funkcje dla wszystkich dzieci wierzcholka
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n])
                    DFSUtil(n, visited);
            }
        }

        // funkcja docelowa
        void DFS(int v)
        {
            // zaznacz wszystkie węzły jako nieodwiedzone
            boolean visited[] = new boolean[V];

            // uruchom algorytm
            DFSUtil(v, visited);
        }

    }