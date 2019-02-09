package gui;
 
/**
 *
 * @author Amira
 */
public class AddLinePanel extends javax.swing.JPanel {

	private static final long serialVersionUID = 2237420507727250425L;
	
	/**
     * Creates new form AddLinePanel
     */
    public AddLinePanel() {
        initComponents();
    }
                              
    private void initComponents() {

        AddLinejLabel = new javax.swing.JLabel();
        AreaTypejLabel = new javax.swing.JLabel();
        AreajComboBox2 = new javax.swing.JComboBox<>();
        AreaTypejLabel1 = new javax.swing.JLabel();
        AreajComboBox3 = new javax.swing.JComboBox<>();
        AreaPricejLabel = new javax.swing.JLabel();
        PricejComboBox = new javax.swing.JComboBox<>();
        ValidatejButton1 = new javax.swing.JButton();

        AddLinejLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        AddLinejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddLinejLabel.setText("Ajout d'une ligne");

        AreaTypejLabel.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        AreaTypejLabel.setText("Station du départ");

        AreajComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quartier Q1", "Quartier Q2", "Quartier Q3", "Quartier Q4", "Quartier Q5", "Quartier Q6", "Quartier Q7", "Quartier Q8", "Quartier Q9" }));
        AreajComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreajComboBox2ActionPerformed(evt);
            }
        });

        AreaTypejLabel1.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        AreaTypejLabel1.setText("Station d'arrivée");

        AreajComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quartier Q1", "Quartier Q2", "Quartier Q3", "Quartier Q4", "Quartier Q5", "Quartier Q6", "Quartier Q7", "Quartier Q8", "Quartier Q9" }));
        AreajComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreajComboBox3ActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ValidatejButton1)
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddLinejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(AreaPricejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PricejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(AreaTypejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                            .addComponent(AreajComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(AreaTypejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AreajComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(AddLinejLabel)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AreaTypejLabel)
                    .addComponent(AreajComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AreaTypejLabel1)
                    .addComponent(AreajComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AreaPricejLabel)
                    .addComponent(PricejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ValidatejButton1)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>                        

    private void AreajComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void AreajComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void PricejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              


    // Variables declaration - do not modify                     
    private javax.swing.JLabel AreaPricejLabel;
    private javax.swing.JLabel AreaTypejLabel;
    private javax.swing.JLabel AreaTypejLabel1;
    private javax.swing.JComboBox<String> AreajComboBox2;
    private javax.swing.JComboBox<String> AreajComboBox3;
    private javax.swing.JComboBox<String> PricejComboBox;
    private javax.swing.JButton ValidatejButton1;
    private javax.swing.JLabel AddLinejLabel;
    // End of variables declaration                   
}

