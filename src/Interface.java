/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hein6
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	trajetFinal = "";
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jComboBox1 = new javax.swing.JComboBox<>();
        label2 = new java.awt.Label();
        jComboBox2 = new javax.swing.JComboBox<>();
        label3 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel_FG = new javax.swing.JLabel();
        jLabel_EF = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label4 = new java.awt.Label();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel_ON = new javax.swing.JLabel();
        jLabel_ML = new javax.swing.JLabel();
        jLabel_AB = new javax.swing.JLabel();
        jLabel_BC = new javax.swing.JLabel();
        jLabel_AG = new javax.swing.JLabel();
        jLabel_LK = new javax.swing.JLabel();
        jLabel_CD = new javax.swing.JLabel();
        jLabel_DJ = new javax.swing.JLabel();
        jLabel_BF = new javax.swing.JLabel();
        jLabel_IM = new javax.swing.JLabel();
        jLabel_JK = new javax.swing.JLabel();
        jLabel_GI = new javax.swing.JLabel();
        jLabel_MO = new javax.swing.JLabel();
        jLabel_KN = new javax.swing.JLabel();
        jLabel_HL = new javax.swing.JLabel();
        jLabel_EH = new javax.swing.JLabel();
        jLabel_CE = new javax.swing.JLabel();
        jLabel_HI = new javax.swing.JLabel();
        jLabel_HJ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Application MAAS");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(1280, 910));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 153, 153), null, new java.awt.Color(102, 102, 102)));
        jPanel1.setLayout(null);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("D�part");
        jPanel1.add(label1);
        label1.setBounds(36, 12, 118, 28);
        label1.getAccessibleContext().setAccessibleName("Destination");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(78, 50, 37, 22);

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Arriv�e");
        jPanel1.add(label2);
        label2.setBounds(164, 12, 118, 28);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(199, 50, 37, 22);

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Temps estim� :");
        jPanel1.add(label3);
        label3.setBounds(672, 25, 118, 28);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setText("0.0 KM");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(544, 63, 70, 26);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setText("0.0 KM");
        jPanel1.add(jTextField2);
        jTextField2.setBounds(544, 99, 70, 26);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-fiat-500-48.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(450, 63, 65, 31);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-autobus-48.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(450, 99, 48, 48);

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Distance :");
        jPanel1.add(label4);
        label4.setBounds(512, 25, 118, 28);
        
        jLabel_FG.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_FG.setOpaque(true);
        jPanel1.add(jLabel_FG);
        jLabel_FG.setBounds(560, 660, 20, 200);

        jLabel_EF.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_EF.setOpaque(true);
        jPanel1.add(jLabel_EF);
        jLabel_EF.setBounds(560, 420, 20, 260);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setText("00:00:00");
        jPanel1.add(jTextField3);
        jTextField3.setBounds(696, 63, 69, 26);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField4.setText("00:00:00");
        jPanel1.add(jTextField4);
        jTextField4.setBounds(696, 99, 69, 26);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Voiture personnel");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(313, 66, 119, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Syst�me MAAS");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(313, 102, 101, 20);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("�tat du trafic :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(850, 29, 111, 24);

        jTextField5.setText("Aucun trafic");
        jPanel1.add(jTextField5);
        jTextField5.setBounds(850, 66, 379, 22);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vert.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(895, 112, 48, 48);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Rouge.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1106, 112, 48, 48);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jaune.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1005, 112, 48, 48);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-proche-de-moi-30.png"))); // NOI18N
        jButton1.setText("D�marrer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(94, 102, 140, 45);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1276, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 781, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(2, 903, 1276, 781);


        jLabel_ON.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_ON.setOpaque(true);
        jPanel1.add(jLabel_ON);
        jLabel_ON.setBounds(1210, 200, 20, 670);

        jLabel_ML.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_ML.setOpaque(true);
        jPanel1.add(jLabel_ML);
        jLabel_ML.setBounds(1040, 430, 20, 440);

        jLabel_AB.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_AB.setOpaque(true);
        jPanel1.add(jLabel_AB);
        jLabel_AB.setBounds(80, 660, 20, 210);

        jLabel_BC.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_BC.setOpaque(true);
        jPanel1.add(jLabel_BC);
        jLabel_BC.setBounds(80, 420, 20, 260);

        jLabel_AG.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_AG.setOpaque(true);
        jPanel1.add(jLabel_AG);
        jLabel_AG.setBounds(80, 850, 500, 20);

        jLabel_LK.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_LK.setOpaque(true);
        jPanel1.add(jLabel_LK);
        jLabel_LK.setBounds(1040, 210, 20, 220);

        jLabel_CD.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_CD.setOpaque(true);
        jPanel1.add(jLabel_CD);
        jLabel_CD.setBounds(80, 200, 20, 220);

        jLabel_DJ.setBackground(new java.awt.Color(0, 51, 204));
        
        // Red = (new java.awt.Color(255, 0, 51));
        jLabel_DJ.setOpaque(true);
        jPanel1.add(jLabel_DJ);
        jLabel_DJ.setBounds(80, 200, 730, 20);

        jLabel_BF.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_BF.setOpaque(true);
        jPanel1.add(jLabel_BF);
        jLabel_BF.setBounds(100, 660, 470, 20);

        jLabel_IM.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_IM.setOpaque(true);
        jPanel1.add(jLabel_IM);
        jLabel_IM.setBounds(810, 850, 250, 20);

        jLabel_JK.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_JK.setOpaque(true);
        jPanel1.add(jLabel_JK);
        jLabel_JK.setBounds(810, 200, 250, 20);

        jLabel_GI.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_GI.setOpaque(true);
        jPanel1.add(jLabel_GI);
        jLabel_GI.setBounds(570, 850, 250, 20);

        jLabel_MO.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_MO.setOpaque(true);
        jPanel1.add(jLabel_MO);
        jLabel_MO.setBounds(1050, 850, 180, 20);

        jLabel_KN.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_KN.setOpaque(true);
        jPanel1.add(jLabel_KN);
        jLabel_KN.setBounds(1050, 200, 180, 20);

        jLabel_HL.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_HL.setOpaque(true);
        jPanel1.add(jLabel_HL);
        jLabel_HL.setBounds(810, 420, 250, 20);

        jLabel_EH.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_EH.setOpaque(true);
        jPanel1.add(jLabel_EH);
        jLabel_EH.setBounds(570, 420, 250, 20);

        jLabel_CE.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_CE.setOpaque(true);
        jPanel1.add(jLabel_CE);
        jLabel_CE.setBounds(90, 420, 480, 20);

        jLabel_HI.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_HI.setOpaque(true);
        jPanel1.add(jLabel_HI);
        jLabel_HI.setBounds(800, 430, 20, 430);

        jLabel_HJ.setBackground(new java.awt.Color(0, 51, 204));
        jLabel_HJ.setOpaque(true);
        jPanel1.add(jLabel_HJ);
        jLabel_HJ.setBounds(800, 200, 20, 230);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CityMap.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 180, 1170, 729);
        
        jLabel_AB.setVisible(false);
        jLabel_EF.setVisible(false);
        jLabel_FG.setVisible(false);
        jLabel_AG.setVisible(false);
        jLabel_BC.setVisible(false);
        jLabel_BF.setVisible(false);
        jLabel_CD.setVisible(false);
        jLabel_CE.setVisible(false);
        jLabel_DJ.setVisible(false);
        jLabel_EH.setVisible(false);
        jLabel_GI.setVisible(false);
        jLabel_HI.setVisible(false);
        jLabel_HJ.setVisible(false);
        jLabel_HL.setVisible(false);
        jLabel_IM.setVisible(false);
        jLabel_JK.setVisible(false);
        jLabel_KN.setVisible(false);
        jLabel_LK.setVisible(false);
        jLabel_ML.setVisible(false);
        jLabel_MO.setVisible(false);
        jLabel_ON.setVisible(false);
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	public void setjTextField1(double valeur) {
		jTextField1.setText(String.valueOf(valeur) + " KM");
	}
	public void setjTextField2(double valeur) {
		jTextField2.setText(String.valueOf(valeur) + " KM");
	}
	public void setjTextField3(String valeur) {
		jTextField3.setText(valeur);
	}
	public void setjTextField4(String valeur) {
		jTextField4.setText(valeur);
	}
	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    
    		
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    		Graph.CreerTrajet(this);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }*/
    

    
    
     


    public void setjComboBox2(javax.swing.JComboBox<String> jComboBox2) {
		this.jComboBox2 = jComboBox2;
	}



	public void setjLabel_AB(boolean Visible) {
		this.jLabel_AB.setVisible(Visible);
	}

	public void setjLabel_AG(boolean Visible) {
		this.jLabel_AG.setVisible(Visible);
	}

	public void setjLabel_BC(boolean Visible) {
		this.jLabel_BC.setVisible(Visible);
	}

	public void setjLabel_BF(boolean Visible) {
		this.jLabel_BF.setVisible(Visible);
	}
	
	public void setjLabel_EF(boolean Visible) {
		this.jLabel_EF.setVisible(Visible);
	}
	
	public void setjLabel_FG(boolean Visible) {
		this.jLabel_FG.setVisible(Visible);
	}	

	public void setjLabel_CD(boolean Visible) {
		this.jLabel_CD.setVisible(Visible);
	}

	public void setjLabel_CE(boolean Visible) {
		this.jLabel_CE.setVisible(Visible);
	}

	public void setjLabel_DJ(boolean Visible) {
		this.jLabel_DJ.setVisible(Visible);
	}

	public void setjLabel_EH(boolean Visible) {
		this.jLabel_EH.setVisible(Visible);
	}

	public void setjLabel_GI(boolean Visible) {
		this.jLabel_GI.setVisible(Visible);
	}

	public void setjLabel_HI(boolean Visible) {
		this.jLabel_HI.setVisible(Visible);
	}

	public void setjLabel_HJ(boolean Visible) {
		this.jLabel_HJ.setVisible(Visible);
	}

	public void setjLabel_HL(boolean Visible) {
		this.jLabel_HL.setVisible(Visible);
	}

	public void setjLabel_IM(boolean Visible) {
		this.jLabel_IM.setVisible(Visible);
	}

	public void setjLabel_JK(boolean Visible) {
		this.jLabel_JK.setVisible(Visible);
	}

	public void setjLabel_KN(boolean Visible) {
		this.jLabel_KN.setVisible(Visible);
	}

	public void setjLabel_LK(boolean Visible) {
		this.jLabel_LK.setVisible(Visible);
	}

	public void setjLabel_ML(boolean Visible) {
		this.jLabel_ML.setVisible(Visible);
	}

	public void setjLabel_MO(boolean Visible) {
		this.jLabel_MO.setVisible(Visible);
	}

	public void setjLabel_ON(boolean Visible) {
		this.jLabel_ON.setVisible(Visible);
	}
	
	public String getCombo1Value() {
		String valeur = "n" + jComboBox1.getSelectedItem().toString(); 
		return valeur;
	}
	public String getCombo2Value() {
		String valeur = "n" + jComboBox2.getSelectedItem().toString(); 
		return valeur;
	}


	// Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_AB;
    private javax.swing.JLabel jLabel_AG;
    private javax.swing.JLabel jLabel_BC;
    private javax.swing.JLabel jLabel_BF;
    private javax.swing.JLabel jLabel_CD;
    private javax.swing.JLabel jLabel_CE;
    private javax.swing.JLabel jLabel_DJ;
    private javax.swing.JLabel jLabel_EF;
    private javax.swing.JLabel jLabel_EH;
    private javax.swing.JLabel jLabel_FG;
    private javax.swing.JLabel jLabel_GI;
    private javax.swing.JLabel jLabel_HI;
    private javax.swing.JLabel jLabel_HJ;
    private javax.swing.JLabel jLabel_HL;
    private javax.swing.JLabel jLabel_IM;
    private javax.swing.JLabel jLabel_JK;
    private javax.swing.JLabel jLabel_KN;
    private javax.swing.JLabel jLabel_LK;
    private javax.swing.JLabel jLabel_ML;
    private javax.swing.JLabel jLabel_MO;
    private javax.swing.JLabel jLabel_ON;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private String trajetFinal;
    // End of variables declaration//GEN-END:variables
}
