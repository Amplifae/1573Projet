import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Pathing {                                                  // Algorithme de Djikstra
    public void findPath(Node nodeStr){
        nodeStr.setDist(0);
        PriorityQueue<Node> prioQ = new PriorityQueue<>();
        prioQ.add(nodeStr);
        nodeStr.setExplored(true);

        while (!prioQ.isEmpty()){
            Node currentNode = prioQ.poll();
            for (Edge edge : currentNode.getEdgeList()){
                Node n = edge.getNodeEnd();
                if (!n.Explored()){
                    double dist0 = currentNode.getDist() + edge.getWeight();
                    if (dist0 < n.getDist()){
                        prioQ.remove(n);
                        n.setDist(dist0);
                        n.setPq(currentNode);
                        prioQ.add(n);
                        }
                    }
            }
            currentNode.setExplored(true);
        }
    }

    public List<Node> SmallPath (Node nodeEnd){
        List<Node> path = new ArrayList<>();
        for(Node n = nodeEnd; n != null; n = n.getPq()){
            path.add(n);
        }
        Collections.reverse(path);
        return path;
    }
}
