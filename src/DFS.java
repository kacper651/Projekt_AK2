import java.util.Stack;


//klasa reprezentujaca DFS na drzewie
public class DFS {

        public void DFS(Node root) {
            Stack<Node> s = new Stack<Node>();
            s.add(root);

            while (!s.isEmpty()) {
                Node x = s.pop();
                if(x.right!=null) s.add(x.right);
                if(x.left!=null) s.add(x.left);
                System.out.print(" " + x.data);
            }
        }


    }
