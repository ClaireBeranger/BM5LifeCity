package gui;

import javax.swing.JPanel;
/**
 * affichage des informations sur un quartier
 * ......
 * @author Chri-
 *
 */
public class AreaDetailsPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -521658874105155401L;
	
    public AreaDetailsPanel() {
        initComponents();
    }
    
    private void initComponents() {
    	
    	titlejlabel = new javax.swing.JLabel();
    	
    	titlejlabel.setFont(new java.awt.Font("Silom", 1, 18));
    	titlejlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    	titlejlabel.setText("Information du quartier");

      //  ValidatejButton1.setText("Valider");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(titlejlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    		).addGap(30, 30, 30)
                    .addContainerGap(16, Short.MAX_VALUE))

            );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(titlejlabel)
                .addGap(30, 30, 30)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }
    

    
    private javax.swing.JLabel titlejlabel;

}
