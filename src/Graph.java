import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class Graph {

    // https://gyazo.com/539ad025df8a0a2dad5f697b122df346

    public static void main(String[] args) {
        Node n0 = new Node("0");            // Noeuds qui vont composer le graphique
        Node n1 = new Node("1");
        Node n2 = new Node("2");
        Node n3 = new Node("3");
        Node n4 = new Node("4");
        Node n5 = new Node("5");

        n0.addParent(new Edge(n0, n1, 2)); // On ajoute les chemins entre les noeuds
        n0.addParent(new Edge(n0, n3, 3));
        n0.addParent(new Edge(n0, n5, 8));
        n1.addParent(new Edge(n1, n0, 2));
        n1.addParent(new Edge(n1, n2, 1));
        n1.addParent(new Edge(n1, n3, 6));
        n1.addParent(new Edge(n1, n4, 5));
        n2.addParent(new Edge(n2, n1, 1));
        n2.addParent(new Edge(n2, n5, 2));
        n3.addParent(new Edge(n3, n0, 3));
        n3.addParent(new Edge(n3, n1, 6));
        n4.addParent(new Edge(n4, n1, 5));
        n4.addParent(new Edge(n4, n5, 3));
        n5.addParent(new Edge(n5, n0, 8));
        n5.addParent(new Edge(n5, n2, 2));
        n5.addParent(new Edge(n5, n4, 3));


        Pathing smollPath = new Pathing();
        smollPath.findPath(n1);                             // On met le noeud de départ
        System.out.println(smollPath.SmallPath(n5));        // On met le noeud d'arrivée

    }
}
