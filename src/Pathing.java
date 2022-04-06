import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Pathing {                                                  // Algorithme de Djikstra
    public void findPath(Lieu nodeStr){
        nodeStr.setDist(0);
        PriorityQueue<Lieu> prioQ = new PriorityQueue<>();
        prioQ.add(nodeStr);
        nodeStr.setExplored(true);

        while (!prioQ.isEmpty()){
            Lieu currentNode = prioQ.poll();
            for (Route edge : currentNode.getEdgeList()){
                Lieu n = edge.getNodeEnd();
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

    public List<Lieu> SmallPath (Lieu nodeEnd){
        List<Lieu> path = new ArrayList<>();
        for(Lieu n = nodeEnd; n != null; n = n.getPq()){
            path.add(n);
        }
        Collections.reverse(path);
        return path;
    }
}
