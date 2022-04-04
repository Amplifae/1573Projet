import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class Graph {

    // https://gyazo.com/539ad025df8a0a2dad5f697b122df346
	
	
    public static String CalculerTrajet(String Trajet) {
   	//String sujet = "Traduire le resultat de la fonction en segment";
   	Trajet = Trajet.replace("[", "");
   	Trajet = Trajet.replace("]", "");
   	String[] separe = Trajet.split(",");
   	String resultat = "";
   	for(int i = 0; i < separe.length-1; i++) {
   		String actuel = separe[i];
   		String suivant = separe[i+1];
   		
   		String compose = actuel+suivant;
   		compose = compose.replace(" ","");  
   		if( i > 0) {
   			resultat += "," + compose;
   		}
   		else {
   			resultat = compose;
   		}    	
   		
	}
   	System.out.println(resultat);
   	return resultat;
    }
    
	
	
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
        
        
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });*/
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
        smollPath.findPath(nC);                             // On met le noeud de départ
        //System.out.println(smollPath.SmallPath(nL));        // On met le noeud d'arrivée
        //System.out.println(Interface.AfficherTrajet(smollPath.SmallPath(nN).toString()));
       
       Interface int1 = new Interface();
       int1.setVisible(true);
       
       //int1.trajetFinal = Interface.AfficherTrajet(smollPath.SmallPath(nN).toString());
       
      String resultat = CalculerTrajet(smollPath.SmallPath(nL).toString());
      String[] allSegments = resultat.split(",");
      
      int1.setjLabel_AB(false);
      int1.setjLabel_AG(false);
      int1.setjLabel_BC(false);
      int1.setjLabel_BF(false);
      int1.setjLabel_CD(false);
      int1.setjLabel_CE(false);
      int1.setjLabel_DJ(false);
      int1.setjLabel_EH(false);
      int1.setjLabel_GI(false);
      int1.setjLabel_HI(false);
      int1.setjLabel_HJ(false);
      int1.setjLabel_HL(false);
      int1.setjLabel_IM(false);
      int1.setjLabel_JK(false);
      int1.setjLabel_KN(false);
      int1.setjLabel_LK(false);
      int1.setjLabel_ML(false);
      int1.setjLabel_MO(false);
      int1.setjLabel_ON(false);
      
      
       //System.out.println(allSegments[0]);        
        for(String segment : allSegments) {
	        switch(segment) {
	        	
	        case "AB":
	        	int1.setjLabel_AB(true);
        	break;

	        case "BA":
	        	int1.setjLabel_AB(true);
        	break;        	
	        
	        case "AG":
	        	int1.setjLabel_AG(true);
        	break;
        	
	        case "GA":
	        	int1.setjLabel_AG(true);
        	break;
        	
	        case "BF":
	        	int1.setjLabel_BC(true);
        	break;
        	
	        case "FB":
	        	int1.setjLabel_BC(true);
        	break;
        	
	        case "BC":
	        	int1.setjLabel_BC(true);
        	break;
        	
	        case "CB":
	        	int1.setjLabel_BC(true);
        	break; 
        	
	        case "CE":
	        	int1.setjLabel_CE(true);
        	break;
        	
	        case "EC":
	        	int1.setjLabel_CE(true);
        	break;
        	
	        case "CD":
	        	int1.setjLabel_CD(true);
        	break;
        	
	        case "DC":
	        	int1.setjLabel_CD(true);
        	break;
        	
	        case "DJ":
	        	int1.setjLabel_DJ(true);
        	break;
        	
	        case "JD":
	        	int1.setjLabel_DJ(true);
        	break;
        	
	        case "JK":
	        	int1.setjLabel_JK(true);
        	break;
        	
	        case "KJ":
	        	int1.setjLabel_JK(true);
        	break;
        	
	        case "JH":
	        	int1.setjLabel_HJ(true);
        	break;
        	
	        case "HJ":
	        	int1.setjLabel_HJ(true);
        	break;
        	
	        case "HE":
	        	int1.setjLabel_EH(true);
        	break;
        	
	        case "EH":
	        	int1.setjLabel_EH(true);
        	break;

	        case "EF":
	        	int1.setjLabel_EF(true);
        	break;
        	
	        case "FE":
	        	int1.setjLabel_EF(true);
        	break;
        	
	        case "FG":
	        	int1.setjLabel_FG(true);
        	break;
        	
	        case "GF":
	        	int1.setjLabel_FG(true);
        	break;
        	
	        case "GI":
	        	int1.setjLabel_GI(true);
        	break;
        	
	        case "IG":
	        	int1.setjLabel_GI(true);
        	break;
        	
	        case "IM":
	        	int1.setjLabel_IM(true);
        	break;
        	
	        case "MI":
	        	int1.setjLabel_IM(true);
        	break;
        	
	        case "IH":
	        	int1.setjLabel_HI(true);
        	break;
        	
	        case "HI":
	        	int1.setjLabel_HI(true);
        	break;        	
        	        	
	        case "HL":
	        	int1.setjLabel_HL(true);
        	break;
        	
	        case "LH":
	        	int1.setjLabel_HL(true);
        	break;        	
        	
	        case "LK":
	        	int1.setjLabel_LK(true);
        	break;
        	
	        case "KL":
	        	int1.setjLabel_LK(true);
        	break;        	
        	        	
	        case "LM":
	        	int1.setjLabel_ML(true);
        	break;
        	
	        case "ML":
	        	int1.setjLabel_ML(true);
        	break;        	
        	        	        	        	
	        case "MO":
	        	int1.setjLabel_MO(true);
        	break;
        	
	        case "OM":
	        	int1.setjLabel_MO(true);
        	break;        	
        	        	        	
	        case "ON":
	        	int1.setjLabel_ON(true);
        	break;
        	
	        case "NO":
	        	int1.setjLabel_ON(true);
        	break;        	
        	        	        	
	        case "NK":
	        	int1.setjLabel_KN(true);
        	break;
        	
	        case "KN":
	        	int1.setjLabel_KN(true);
        	break;        	
        	        	        	
	        }
        }

    }
}
