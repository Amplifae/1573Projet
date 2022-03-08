
public class Edge {
	
	private Node nodeSrc;
	private Node nodeDist;
	
	public int speedLimit;
	
	public Edge(Node nodeSrc, Node nodeDist, int speedLimit) {
		this.nodeSrc = nodeSrc; 
		this.nodeDist = nodeDist; 
		this.speedLimit = speedLimit;
	}
	
	public Node getSource() {
		return this.nodeSrc;
	}
	public Node getDestination() {
		return this.nodeDist;
	}
	public int getSpeedLimit() {
		return this.speedLimit;
	}
	public double getDistance() {
		return Math.sqrt(Math.pow(nodeDist.posX - nodeSrc.posX, 2) + Math.pow(nodeDist.posY - nodeSrc.posY, 2));
	}
}
