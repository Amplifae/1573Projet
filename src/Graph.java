import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class Graph {

    // https://gyazo.com/539ad025df8a0a2dad5f697b122df346

    public static void main(String[] args) {
    	
        Node nA = new Node("A");            // Noeuds qui vont composer le graphique
        Node nB = new Node("B");
        Node nC = new Node("C");
        Node nD = new Node("D");
        Node nE = new Node("E");
        Node nF = new Node("F");
        Node nG = new Node("G");            // Noeuds qui vont composer le graphique
        Node nH = new Node("H");
        Node nI = new Node("I");
        Node nJ = new Node("J");
        Node nK = new Node("K");
        Node nL = new Node("L");
        Node nM = new Node("M");            // Noeuds qui vont composer le graphique
        Node nN = new Node("N");
        Node nO = new Node("O");
        Node nP = new Node("P");

        nA.addParent(new Edge(nA, nB, 5)); // On ajoute les chemins entre les noeuds
        nA.addParent(new Edge(nA, nG, 10));
        nB.addParent(new Edge(nB, nC, 5));
        nB.addParent(new Edge(nB, nF, 10));
        nB.addParent(new Edge(nB, nA, 5));
        nC.addParent(new Edge(nC, nE, 10));
        nC.addParent(new Edge(nC, nB, 5));
        nC.addParent(new Edge(nC, nD, 5));
        nD.addParent(new Edge(nD, nC, 5));
        nD.addParent(new Edge(nD, nJ, 10));
        nE.addParent(new Edge(nE, nC, 10));
        nE.addParent(new Edge(nE, nH, 5));
        nE.addParent(new Edge(nE, nF, 5));
        nF.addParent(new Edge(nF, nE, 5));
        nF.addParent(new Edge(nF, nB, 10));
        nF.addParent(new Edge(nF, nG, 5));
        nG.addParent(new Edge(nG, nF, 5));
        nG.addParent(new Edge(nG, nA, 10));
        nG.addParent(new Edge(nG, nI, 5));
        nH.addParent(new Edge(nH, nE, 5));
        nH.addParent(new Edge(nH, nJ, 5));
        nH.addParent(new Edge(nH, nI, 10));
        nH.addParent(new Edge(nH, nL, 5));
        nI.addParent(new Edge(nI, nG, 5));
        nI.addParent(new Edge(nI, nM, 5));
        nI.addParent(new Edge(nI, nH, 10));
        nJ.addParent(new Edge(nJ, nD, 10));
        nJ.addParent(new Edge(nJ, nK, 5));
        nJ.addParent(new Edge(nJ, nH, 5));
        nK.addParent(new Edge(nK, nJ, 5));
        nK.addParent(new Edge(nK, nL, 5));
        nK.addParent(new Edge(nK, nN, 5));
        nL.addParent(new Edge(nL, nK, 5));
        nL.addParent(new Edge(nL, nM, 10));
        nL.addParent(new Edge(nL, nH, 5));
        nM.addParent(new Edge(nM, nL, 10));
        nM.addParent(new Edge(nM, nI, 5));
        nM.addParent(new Edge(nM, nO, 5));
        nN.addParent(new Edge(nN, nK, 5));
        nN.addParent(new Edge(nN, nO, 20));
        nO.addParent(new Edge(nO, nM, 5));
        nO.addParent(new Edge(nO, nN, 20));
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface_V2 frame = new Interface_V2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
        
        

        Pathing smollPath = new Pathing();
        smollPath.findPath(nA);                             // On met le noeud de départ
        System.out.println(smollPath.SmallPath(nN));        // On met le noeud d'arrivée
        Interface.AfficherTrajet(smollPath.SmallPath(nN).toString());
        

    }
}
