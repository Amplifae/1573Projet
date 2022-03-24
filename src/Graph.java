import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Graphics;




public class Graph {

    ArrayList<Node> nodes = new ArrayList<Node>();
    ArrayList<Edge> edges = new ArrayList<Edge>();


    public void displayMap() {
        nodes.add(new Node(10,10,"N1"));
        nodes.add(new Node(20,10,"N2"));
        nodes.add(new Node(30,10,"N3"));
        nodes.add(new Node(10,30,"N4"));
        nodes.add(new Node(20,30,"N5"));
        nodes.add(new Node(30,30,"N6"));


    }
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.displayMap();

    }
}
