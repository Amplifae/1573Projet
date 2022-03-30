import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node>{
	
	private String ID;

	private List<Edge> edgeList;
	private Node pq;
	private double dist =Double.MAX_VALUE ;
	private boolean explored;
	
	public Node(String ID) {
		this.ID = ID;
		this.edgeList = new ArrayList();
	}

	public String getID() {
		return this.ID;
	}
	public boolean Explored(){
		return explored;
	};
	public void setExplored(boolean explored){
		this.explored = explored;
	}

	public List<Edge> getEdgeList(){
		return edgeList;
	}
	public void setEdgeList(List<Edge> List){
		this.edgeList = List;
	}
	public double getDist(){
		return dist;
	}
	public void setDist(double dist){
		this.dist = dist;
	}
	public Node getPq(){
		return pq;
	}
	public void setPq(Node pq){
		this.pq = pq;
	}
	public void addParent(Edge edge){
		this.edgeList.add(edge);
	}

	@Override
	public int compareTo(Node o) {
		return Double.compare(this.dist, o.getDist());
	}
	@Override
	public String toString() {
		return this.ID;
	}
	/*
	public void djikstraInit()
	{
		pq = null;
		dist = 21474836;
		explored = false;
	}

	public int posX;
	public int posY;

	public Node(String ID, int posX, int posY) {
		this.ID = ID;
		this.posX = posX;
		this.posY = posY;

	}
	public int getPositionX() {
		return this.posX;
	}
	public int getPositionY() {
		return this.posY;
	}

	 */
}
