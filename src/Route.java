
public class Route {
	
	private Lieu nodeStr;
	private Lieu nodeEnd;
	private double weight;

	public Route(Lieu nodeStr, Lieu nodeEnd, double weight) {
		this.nodeStr = nodeStr; 
		this.nodeEnd = nodeEnd;
		this.weight = weight;
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

}
