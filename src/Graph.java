import java.awt.Color;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class Graph {
	
	
	/**
	 * 
	 * @param Interface n1
	 * @param String segment
	 * @author Équipe 8
	 * @note Fonction qui change la couleur d'une route (jLabel_**) afin d'afficher le trafic
	 */
	public static void AfficherTrafic(Interface n1, String segment) {
		
		//Change la couleur du segment d'entrée à la fonction
		switch(segment) {
    	
        case "AB":
        	n1.setColorjLabel_AB(Color.RED);
    	break;

        case "BA":
        	n1.setColorjLabel_AB(Color.RED);
    	break;        	
        
        case "AG":
        	n1.setColorjLabel_AG(Color.RED);
    	break;
    	
        case "GA":
        	n1.setColorjLabel_AG(Color.RED);
    	break;
    	
        case "BF":
        	n1.setColorjLabel_BF(Color.RED);
    	break;
    	
        case "FB":
        	n1.setColorjLabel_BF(Color.RED);
    	break;
    	
        case "BC":
        	n1.setColorjLabel_BC(Color.RED);
    	break;
    	
        case "CB":
        	n1.setColorjLabel_BC(Color.RED);
    	break; 
    	
        case "CE":
        	n1.setColorjLabel_CE(Color.RED);
    	break;
    	
        case "EC":
        	n1.setColorjLabel_CE(Color.RED);
    	break;
    	
        case "CD":
        	n1.setColorjLabel_CD(Color.RED);
    	break;
    	
        case "DC":
        	n1.setColorjLabel_CD(Color.RED);
    	break;
    	
        case "DJ":
        	n1.setColorjLabel_DJ(Color.RED);
    	break;
    	
        case "JD":
        	n1.setColorjLabel_DJ(Color.RED);
    	break;
    	
        case "JK":
        	n1.setColorjLabel_JK(Color.RED);
    	break;
    	
        case "KJ":
        	n1.setColorjLabel_JK(Color.RED);
    	break;
    	
        case "JH":
        	n1.setColorjLabel_HJ(Color.RED);
    	break;
    	
        case "HJ":
        	n1.setColorjLabel_HJ(Color.RED);
    	break;
    	
        case "HE":
        	n1.setColorjLabel_EH(Color.RED);
    	break;
    	
        case "EH":
        	n1.setColorjLabel_EH(Color.RED);
    	break;

        case "EF":
        	n1.setColorjLabel_EF(Color.RED);
    	break;
    	
        case "FE":
        	n1.setColorjLabel_EF(Color.RED);
    	break;
    	
        case "FG":
        	n1.setColorjLabel_FG(Color.RED);
    	break;
    	
        case "GF":
        	n1.setColorjLabel_FG(Color.RED);
    	break;
    	
        case "GI":
        	n1.setColorjLabel_GI(Color.RED);
    	break;
    	
        case "IG":
        	n1.setColorjLabel_GI(Color.RED);
    	break;
    	
        case "IM":
        	n1.setColorjLabel_IM(Color.RED);
    	break;
    	
        case "MI":
        	n1.setColorjLabel_IM(Color.RED);
    	break;
    	
        case "IH":
        	n1.setColorjLabel_HI(Color.RED);
    	break;
    	
        case "HI":
        	n1.setColorjLabel_HI(Color.RED);
    	break;        	
    	        	
        case "HL":
        	n1.setColorjLabel_HL(Color.RED);
    	break;
    	
        case "LH":
        	n1.setColorjLabel_HL(Color.RED);
    	break;        	
    	
        case "LK":
        	n1.setColorjLabel_LK(Color.RED);
    	break;
    	
        case "KL":
        	n1.setColorjLabel_LK(Color.RED);
    	break;        	
    	        	
        case "LM":
        	n1.setColorjLabel_ML(Color.RED);
    	break;
    	
        case "ML":
        	n1.setColorjLabel_ML(Color.RED);
    	break;        	
    	        	        	        	
        case "MO":
        	n1.setColorjLabel_MO(Color.RED);
    	break;
    	
        case "OM":
        	n1.setColorjLabel_MO(Color.RED);
    	break;        	
    	        	        	
        case "ON":
        	n1.setColorjLabel_ON(Color.RED);
    	break;
    	
        case "NO":
        	n1.setColorjLabel_ON(Color.RED);
    	break;        	
    	        	        	
        case "NK":
        	n1.setColorjLabel_KN(Color.RED);
    	break;
    	
        case "KN":
        	n1.setColorjLabel_KN(Color.RED);
    	break;        	
    	        	        	
        }
		
	}
	/**
	 * 
	 * @param Interface n1
	 * @param String[] allSegments
	 * @author Équipe 8
	 * @Note Affiche le trajet choisi selon les segments en paramètres
	 */
	public static void AfficherTrajet(Interface n1, String[] allSegments) {
		
		 //Cacher tous les jLabels des routes
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
	      
	      //Afficher chaque segment en paramètre d'entré
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
	
	/**
	 * 
	 * @param String Trajet
	 * @return String resultat
	 * @note Transforme le resultat de l'algorithme de Djikstra en segment 
	 */
    public static String TransformerTrajet(String Trajet) {
   	Trajet = Trajet.replace("[", ""); //Enlever les caractères non nécessaires
   	Trajet = Trajet.replace("]", "");
   	
   	String[] separe = Trajet.split(","); //Segmenter le trajet par lieu
   	String resultat = "";
   	
   	for(int i = 0; i < separe.length-1; i++) { //Fusionner le lieu actuel avec le suivant
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
   	return resultat;
    }
    
    /**
     * 
     * @param double km
     * @param double vitesse
     * @param boolean trafic
     * @note Calcul le temps nécessaire au trajet 
     * @return String retour
     */
    public static String CalculerTemps(double km, double vitesse, boolean trafic) {
    	
    	String retour = "";
    	
    	double temps = km/vitesse;  //Calcul du temps de base
    	
    	if(trafic == true) {		//S'il y a du trafic on ajouter 20% à la durée du trajet
    		temps = temps*1.20;
    	}
    	
    	double secondes = temps*3600;  //Transforme le temps en hh;mm;ss
    	
    	double ConvSec = secondes % 60;
        double ConvMin = (secondes % 3600) / 60; 
        double ConvHour = (secondes % (3600 * 24)) / 3600;
        
        // Gestion de l'affichage du temps
         
        //Cas des heures
        if(ConvHour < 10) {
        	retour = "0" + String.valueOf((int)ConvHour) + ":" ;
        }
        else {
        	retour = String.valueOf((int)ConvHour) + ":" ;
        }
        
        //Cas des minutes
        if(ConvMin < 10) {
        	retour += "0" + String.valueOf((int)ConvMin) + ":" ;
        }
        else {
        	retour += String.valueOf((int)ConvMin) + ":" ;
        }        
 
        //Cas des secondes
        if(ConvSec < 10) {
        	retour += "0" + String.valueOf((int)ConvSec);
        }
        else {
        	retour += String.valueOf((int)ConvSec);
        } 
            	
        
    	return retour;
    }
    
    /**
     * 
     * @param String[] trajet
     * @return String trajet
     * @note Choisir une route au hasard afin de simuler du trafic
     */
    public static String GestionTrafic(String[] trajet) {
    	
    	
    	String segment_trafic = "";
    	   	
		int upperbound = trajet.length; 
		
		
		if(upperbound > 0) {                          //Choisi un nombre aléatoie entre 0 et la longueur du tableau de String en paramètre 
			Random rand = new Random();				  
			int int_random = rand.nextInt(upperbound); 
		
			segment_trafic = trajet[int_random];
		}
		else {
			segment_trafic = trajet[0];
		}
    	return segment_trafic; 
    }
    
    /**
     * 
     * @param n1
     * @Note Création du trajet 
     */
	public static void CreerTrajet(Interface n1) {
		
		String trajet = "";
		
		double distance = 0.0;
		
		String combo1 = n1.getCombo1Value(); //Valeur des entrées par l'utilisateur
		String combo2 = n1.getCombo2Value();
		
        Lieu nA = new Lieu("A");            // Noeuds qui vont composer le graphique
        Lieu nB = new Lieu("B");
        Lieu nC = new Lieu("C");
        Lieu nD = new Lieu("D");
        Lieu nE = new Lieu("E");
        Lieu nF = new Lieu("F");
        Lieu nG = new Lieu("G");            // Noeuds qui vont composer le graphique
        Lieu nH = new Lieu("H");
        Lieu nI = new Lieu("I");
        Lieu nJ = new Lieu("J");
        Lieu nK = new Lieu("K");
        Lieu nL = new Lieu("L");
        Lieu nM = new Lieu("M");            // Noeuds qui vont composer le graphique
        Lieu nN = new Lieu("N");
        Lieu nO = new Lieu("O");
        Lieu nP = new Lieu("P");

        nA.addParent(new Route(nA, nB, 5)); // On ajoute les chemins entre les noeuds
        nA.addParent(new Route(nA, nG, 10 ));
        nB.addParent(new Route(nB, nC, 5));
        nB.addParent(new Route(nB, nF, 10 ));
        nB.addParent(new Route(nB, nA, 5 ));
        nC.addParent(new Route(nC, nE, 10 ));
        nC.addParent(new Route(nC, nB, 5 ));
        nC.addParent(new Route(nC, nD, 5 ));
        nD.addParent(new Route(nD, nC, 5 ));
        nD.addParent(new Route(nD, nJ, 15 ));
        nE.addParent(new Route(nE, nC, 10 ));
        nE.addParent(new Route(nE, nH, 5 ));
        nE.addParent(new Route(nE, nF, 5 ));
        nF.addParent(new Route(nF, nE, 5 ));
        nF.addParent(new Route(nF, nB, 10 ));
        nF.addParent(new Route(nF, nG, 5 ));
        nG.addParent(new Route(nG, nF, 5 ));
        nG.addParent(new Route(nG, nA, 10 ));
        nG.addParent(new Route(nG, nI, 5 ));
        nH.addParent(new Route(nH, nE, 5 ));
        nH.addParent(new Route(nH, nJ, 5 ));
        nH.addParent(new Route(nH, nI, 10 ));
        nH.addParent(new Route(nH, nL, 5 ));
        nI.addParent(new Route(nI, nG, 5 ));
        nI.addParent(new Route(nI, nM, 5 ));
        nI.addParent(new Route(nI, nH, 10 ));
        nJ.addParent(new Route(nJ, nD, 10 ));
        nJ.addParent(new Route(nJ, nK, 5));
        nJ.addParent(new Route(nJ, nH, 5 ));
        nK.addParent(new Route(nK, nJ, 5 ));
        nK.addParent(new Route(nK, nL, 5 ));
        nK.addParent(new Route(nK, nN, 5 ));
        nL.addParent(new Route(nL, nK, 5 ));
        nL.addParent(new Route(nL, nM, 10 ));
        nL.addParent(new Route(nL, nH, 5 ));
        nM.addParent(new Route(nM, nL, 10 ));
        nM.addParent(new Route(nM, nI, 5 ));
        nM.addParent(new Route(nM, nO, 5 ));
        nN.addParent(new Route(nN, nK, 5 ));
        nN.addParent(new Route(nN, nO, 20 ));
        nO.addParent(new Route(nO, nM, 5 ));
        nO.addParent(new Route(nO, nN, 20 ));
    
        
        Pathing smollPath = new Pathing();
		
		switch(combo1) {     //Point de départ choisi selon la valeur de combo1
			
			case "nA" : 
				smollPath.findPath(nA); 
				break;
			case "nB":
				smollPath.findPath(nB);
				break;
			case "nC":
				smollPath.findPath(nC);
				break;
			case "nD":
				smollPath.findPath(nD);
				break;
			case "nE":
				smollPath.findPath(nE);
				break;
			case "nF":
				smollPath.findPath(nF);
				break;
			case "nG":
				smollPath.findPath(nG);
				break;
			case "nH":
				smollPath.findPath(nH);
				break;
			case "nI":
				smollPath.findPath(nI);
				break;
			case "nJ":
				smollPath.findPath(nJ);
				break;
			case "nK":
				smollPath.findPath(nK);
				break;
			case "nL":
				smollPath.findPath(nL);
				break;
			case "nM":
				smollPath.findPath(nM);
				break;
			case "nN":
				smollPath.findPath(nN);
				break;
			case "nO":	
				smollPath.findPath(nO);
				break;
		}
		switch(combo2) {     //Point d'arrivé choisi selon la valeur de combo2
		
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
			
		
		  //Reset de l'interfac actuel
		  n1.resetTraficInterface();
			
	      String resultat = TransformerTrajet(trajet);
	      
	      String[] allSegments = resultat.split(",");
	      
	      //Affiche le trajet sur l'interface graphique
	      AfficherTrajet(n1, allSegments);
	      
	      //Affiche la distance sur l'interface graphique
	      n1.setjTextField1(distance);
	      n1.setjTextField2(distance);
	      
	      boolean trafic = false;
	      String segment_Trafic = GestionTrafic(allSegments);
	      //Vérification si l'option trafic est activé
	      if(n1.getjCheckBox1()){
	    	  //Afficher le segment avec du trafic sur le trajet
	    	  
	    	  AfficherTrafic(n1,segment_Trafic);
	    	  n1.setVisiblejLabel8(true);
	    	  n1.setVisiblejLabel7(false);
	    	  trafic = true;
	    	  
	    	  //Afficher l'emplacement du trafic sur le texte
	    	  n1.setjTextField5(segment_Trafic);
	      }
	      
	      //Affiche et calcul le temps nécessaire pour l'utilisation d'une voiture personnel
	      n1.setjTextField3(CalculerTemps(distance, 35.0, trafic)); //Trafic pris en compte 
	      
	      
	      //Affiche et calcul le temps nécessaire pour le système MAAS
	      n1.setjTextField4(CalculerTemps(distance, 45.0, false));  //Trafic non pris en compte voie reservée
		
}
	
	
	
	
	
    public static void main(String[] args) {

       
       Interface int1 = new Interface();
       int1.setVisible(true);
       

    }
}
