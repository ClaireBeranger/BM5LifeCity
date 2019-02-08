package gui;

import javax.swing.JPanel;

/**
	 *
	 * @author Amira
	 */
	public class AddStationPanel extends JPanel {

	    /**
	     * Creates new form AddStationPanel
	     */
	    public AddStationPanel() {
	        initComponents();
	    }

	  
	    private void initComponents() {

	        AddStationjLabell = new javax.swing.JLabel();
	        AreaTypejLabel = new javax.swing.JLabel();
	        AreajComboBox2 = new javax.swing.JComboBox<>();
	        AreaPricejLabel = new javax.swing.JLabel();
	        PricejComboBox = new javax.swing.JComboBox<>();
	        ValidatejButton1 = new javax.swing.JButton();

	        AddStationjLabell.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
	        AddStationjLabell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
	        AddStationjLabell.setText("Ajout d'une station");

	        AreaTypejLabel.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
	        AreaTypejLabel.setText("Nom du quartier");

	        AreajComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quartier Q1", "Quartier Q2", "Quartier Q3", "Quartier Q4", "Quartier Q5", "Quartier Q6", "Quartier Q7", "Quartier Q8", "Quartier Q9" }));
	        AreajComboBox2.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                AreajComboBox2ActionPerformed(evt);
	            }
	        });

	        AreaPricejLabel.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
	        AreaPricejLabel.setText("Prix");

	        PricejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "200$", "500$", "700$", "100$" }));
	        PricejComboBox.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                PricejComboBoxActionPerformed(evt);
	            }
	        });

	        ValidatejButton1.setText("Valider");

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	        this.setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
	                        .addGap(40, 40, 40)
	                        .addComponent(AddStationjLabell, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
	                        .addGap(25, 25, 25)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(AreaPricejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(18, 18, 18)
	                                .addComponent(PricejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(AreaTypejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(18, 18, 18)
	                                .addComponent(AreajComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addGap(0, 0, Short.MAX_VALUE)
	                .addComponent(ValidatejButton1)
	                .addGap(123, 123, 123))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(20, 20, 20)
	                .addComponent(AddStationjLabell)
	                .addGap(26, 26, 26)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(AreajComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(AreaTypejLabel))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(PricejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(AreaPricejLabel))
	                .addGap(26, 26, 26)
	                .addComponent(ValidatejButton1)
	                .addContainerGap(35, Short.MAX_VALUE))
	        );
	    }// </editor-fold>                        

	    private void AreajComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
	        // TODO add your handling code here:
	    }                                              

	    private void PricejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                               
	        // TODO add your handling code here:
	    }                                              


	    // Variables declaration - do not modify                     
	    private javax.swing.JLabel AreaPricejLabel;
	    private javax.swing.JLabel AreaTypejLabel;
	    private javax.swing.JComboBox<String> AreajComboBox2;
	    private javax.swing.JComboBox<String> PricejComboBox;
	    private javax.swing.JButton ValidatejButton1;
	    private javax.swing.JLabel AddStationjLabell;
	    // End of variables declaration                   
	


}
