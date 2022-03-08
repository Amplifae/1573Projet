
public class Node {
	
	public String ID;
	public int posX;
	public int posY;
	
	
	public Node(int posX, int posY, String ID) {
		this.posX = posX;
		this.posY = posY;
		this.ID = ID;
	}
	
	public String getID() {
		return this.ID;
	}
	public int getPositionX() {
		return this.posX;
	}
	public int getPositionY() {
		return this.posY;
	}
}
