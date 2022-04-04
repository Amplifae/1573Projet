import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class Graph {

    // https://gyazo.com/539ad025df8a0a2dad5f697b122df346
	
	public static void AfficherTrajet(Interface n1, String[] allSegments) {
		
		 n1.setjLabel_AB(false);
	      n1.setjLabel_AG(false);
	      n1.setjLabel_BC(false);
	      n1.setjLabel_BF(false);
	      n1.setjLabel_CD(false);
	      n1.setjLabel_CE(false);
	      n1.setjLabel_DJ(false);
	      n1.setjLabel_EH(false);
	      n1.setjLabel_EF(false);
	      n1.setjLabel_FG(false);
	      n1.setjLabel_GI(false);
	      n1.setjLabel_HI(false);
	      n1.setjLabel_HJ(false);
	      n1.setjLabel_HL(false);
	      n1.setjLabel_IM(false);
	      n1.setjLabel_JK(false);
	      n1.setjLabel_KN(false);
	      n1.setjLabel_LK(false);
	      n1.setjLabel_ML(false);
	      n1.setjLabel_MO(false);
	      n1.setjLabel_ON(false);
	      
	      
	       //System.out.println(allSegments[0]);        
	        for(String segment : allSegments) {
		        switch(segment) {
		        	
		        case "AB":
		        	n1.setjLabel_AB(true);
	        	break;

		        case "BA":
		        	n1.setjLabel_AB(true);
	        	break;        	
		        
		        case "AG":
		        	n1.setjLabel_AG(true);
	        	break;
	        	
		        case "GA":
		        	n1.setjLabel_AG(true);
	        	break;
	        	
		        case "BF":
		        	n1.setjLabel_BF(true);
	        	break;
	        	
		        case "FB":
		        	n1.setjLabel_BF(true);
	        	break;
	        	
		        case "BC":
		        	n1.setjLabel_BC(true);
	        	break;
	        	
		        case "CB":
		        	n1.setjLabel_BC(true);
	        	break; 
	        	
		        case "CE":
		        	n1.setjLabel_CE(true);
	        	break;
	        	
		        case "EC":
		        	n1.setjLabel_CE(true);
	        	break;
	        	
		        case "CD":
		        	n1.setjLabel_CD(true);
	        	break;
	        	
		        case "DC":
		        	n1.setjLabel_CD(true);
	        	break;
	        	
		        case "DJ":
		        	n1.setjLabel_DJ(true);
	        	break;
	        	
		        case "JD":
		        	n1.setjLabel_DJ(true);
	        	break;
	        	
		        case "JK":
		        	n1.setjLabel_JK(true);
	        	break;
	        	
		        case "KJ":
		        	n1.setjLabel_JK(true);
	        	break;
	        	
		        case "JH":
		        	n1.setjLabel_HJ(true);
	        	break;
	        	
		        case "HJ":
		        	n1.setjLabel_HJ(true);
	        	break;
	        	
		        case "HE":
		        	n1.setjLabel_EH(true);
	        	break;
	        	
		        case "EH":
		        	n1.setjLabel_EH(true);
	        	break;

		        case "EF":
		        	n1.setjLabel_EF(true);
	        	break;
	        	
		        case "FE":
		        	n1.setjLabel_EF(true);
	        	break;
	        	
		        case "FG":
		        	n1.setjLabel_FG(true);
	        	break;
	        	
		        case "GF":
		        	n1.setjLabel_FG(true);
	        	break;
	        	
		        case "GI":
		        	n1.setjLabel_GI(true);
	        	break;
	        	
		        case "IG":
		        	n1.setjLabel_GI(true);
	        	break;
	        	
		        case "IM":
		        	n1.setjLabel_IM(true);
	        	break;
	        	
		        case "MI":
		        	n1.setjLabel_IM(true);
	        	break;
	        	
		        case "IH":
		        	n1.setjLabel_HI(true);
	        	break;
	        	
		        case "HI":
		        	n1.setjLabel_HI(true);
	        	break;        	
	        	        	
		        case "HL":
		        	n1.setjLabel_HL(true);
	        	break;
	        	
		        case "LH":
		        	n1.setjLabel_HL(true);
	        	break;        	
	        	
		        case "LK":
		        	n1.setjLabel_LK(true);
	        	break;
	        	
		        case "KL":
		        	n1.setjLabel_LK(true);
	        	break;        	
	        	        	
		        case "LM":
		        	n1.setjLabel_ML(true);
	        	break;
	        	
		        case "ML":
		        	n1.setjLabel_ML(true);
	        	break;        	
	        	        	        	        	
		        case "MO":
		        	n1.setjLabel_MO(true);
	        	break;
	        	
		        case "OM":
		        	n1.setjLabel_MO(true);
	        	break;        	
	        	        	        	
		        case "ON":
		        	n1.setjLabel_ON(true);
	        	break;
	        	
		        case "NO":
		        	n1.setjLabel_ON(true);
	        	break;        	
	        	        	        	
		        case "NK":
		        	n1.setjLabel_KN(true);
	        	break;
	        	
		        case "KN":
		        	n1.setjLabel_KN(true);
	        	break;        	
	        	        	        	
		        }
	        }
		
	}
	
	
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
    
    public static double CalculerTemps(double km, double vitesse) {
    	
    	double temps; 
    	
    	
    	return 2.0;
    }
    
	public static void CreerTrajet(Interface n1) {
		
		String trajet = "";
		
		double distance = 0.0;
		
		String combo1 = n1.getCombo1Value(); //Valeur des entr�es par l'utilisateur
		String combo2 = n1.getCombo2Value();
		
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
        
        Pathing smollPath = new Pathing();
		
		switch(combo1) {
			
			case "nA" : 
				smollPath.findPath(nA); 
			case "nB":
				smollPath.findPath(nB); 
			case "nC":
				smollPath.findPath(nC); 
			case "nD":
				smollPath.findPath(nD); 
			case "nE":
				smollPath.findPath(nE); 
			case "nF":
				smollPath.findPath(nF); 
			case "nG":
				smollPath.findPath(nG); 
			case "nH":
				smollPath.findPath(nH); 
			case "nI":
				smollPath.findPath(nI); 
			case "nJ":
				smollPath.findPath(nJ); 
			case "nK":
				smollPath.findPath(nK); 
			case "nL":
				smollPath.findPath(nL); 
			case "nM":
				smollPath.findPath(nM); 
			case "nN":
				smollPath.findPath(nN); 
			case "nO":	
				smollPath.findPath(nO); 
		}
		switch(combo2) {
		
		case "nA" : 
			 trajet = smollPath.SmallPath(nA).toString();
			 distance = nA.getDist();
		break;
		case "nB":
			 trajet = smollPath.SmallPath(nB).toString();
			 distance = nB.getDist();
		break;	 
		case "nC":
			 trajet = smollPath.SmallPath(nC).toString();
			 distance = nC.getDist();
		break;
		case "nD":
			 trajet = smollPath.SmallPath(nD).toString();
			 distance = nD.getDist();
		break;
		case "nE":
			 trajet = smollPath.SmallPath(nE).toString();
			 distance = nE.getDist();
		break;
		case "nF":
			 trajet = smollPath.SmallPath(nF).toString();
			 distance = nF.getDist();
		break;
		case "nG":
			 trajet = smollPath.SmallPath(nG).toString();
			 distance = nG.getDist();
		break;	 
		case "nH":
			 trajet = smollPath.SmallPath(nH).toString();
			 distance = nH.getDist();
		break;
		case "nI":
			 trajet = smollPath.SmallPath(nI).toString();
			 distance = nI.getDist();
		break;			 
		case "nJ":
			 trajet = smollPath.SmallPath(nJ).toString();
			 distance = nJ.getDist();
		break;			 
		case "nK":
			 trajet = smollPath.SmallPath(nK).toString();
			 distance = nK.getDist();
			 
		break;
		case "nL":
			 trajet = smollPath.SmallPath(nL).toString();
			 distance = nL.getDist();
		break;			 
		case "nM":
			 trajet = smollPath.SmallPath(nM).toString();
			 distance = nM.getDist();
		break;			 
		case "nN":
			 trajet = smollPath.SmallPath(nN).toString();
			 distance = nN.getDist();
		break;
		case "nO":	
			 trajet = smollPath.SmallPath(nO).toString();
			 distance = nO.getDist();
		break;
	}
		
	      String resultat = CalculerTrajet(trajet);
	      
	      String[] allSegments = resultat.split(",");
	      
	      AfficherTrajet(n1, allSegments);
	      n1.setjTextField1(distance);
		
}
	
    public static void main(String[] args) {
    	                            // On met le noeud de départ
        //System.out.println(smollPath.SmallPath(nL));        // On met le noeud d'arrivée
        //System.out.println(Interface.AfficherTrajet(smollPath.SmallPath(nN).toString()));
       
       Interface int1 = new Interface();
       int1.setVisible(true);
       
       
       //int1.trajetFinal = Interface.AfficherTrajet(smollPath.SmallPath(nN).toString());
       

      
      
      
    }
}
