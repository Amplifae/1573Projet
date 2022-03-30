
public class Edge {
	
	private Node nodeStr;
	private Node nodeEnd;
	private double weight;

	public Edge(Node nodeStr, Node nodeEnd, double weight) {
		this.nodeStr = nodeStr; 
		this.nodeEnd = nodeEnd;
		this.weight = weight;
	}

	public Node getNodeStr() {
		return this.nodeStr;
	}
	public void setNodeStr(Node nodeStr){
		this.nodeStr = nodeStr;
	}
	public Node getNodeEnd() {
		return this.nodeEnd;
	}
	public void setNodeEnd(Node nodeEnd){
		this.nodeEnd = nodeEnd;
	}
	public double getWeight(){
		return weight;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	/*
	public void setWorking(boolean working)
	{
		isWorking = working;
	}
	public boolean isWorking()
	{
		return isWorking;
	}
	public double getDistance() {
		return Math.sqrt(Math.pow(nodeEnd.posX - nodeStr.posX, 2) + Math.pow(nodeEnd.posY - nodeStr.posY, 2));
	}
	public Edge(Node nodeStr, Node nodeEnd, int speedLimit) {
		this.nodeStr = nodeStr;
		this.nodeEnd = nodeEnd;
		this.speedLimit = speedLimit;
	}
	public int getSpeedLimit() {
		return this.speedLimit;
	}
	private int speedLimit;
	private boolean isWorking = true;
	 */
}
