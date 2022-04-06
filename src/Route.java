
public class Route {
	
	private Lieu nodeStr;
	private Lieu nodeEnd;
	private double weight;
	private boolean trafic;

	public Route(Lieu nodeStr, Lieu nodeEnd, double weight, boolean trafic) {
		this.nodeStr = nodeStr; 
		this.nodeEnd = nodeEnd;
		this.weight = weight;
		this.trafic = trafic;
	}

	public Lieu getNodeStr() {
		return this.nodeStr;
	}
	public void setNodeStr(Lieu nodeStr){
		this.nodeStr = nodeStr;
	}
	public Lieu getNodeEnd() {
		return this.nodeEnd;
	}
	public void setNodeEnd(Lieu nodeEnd){
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

	public boolean isTrafic() {
		return trafic;
	}

	public void setTrafic(boolean trafic) {
		this.trafic = trafic;
	}
}
