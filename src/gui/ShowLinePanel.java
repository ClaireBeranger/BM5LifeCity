
package gui;

/**
 *
 * @author Amira
 */
public class ShowLinePanel extends javax.swing.JPanel {

    
    public ShowLinePanel() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        showSelectLinejLabel = new javax.swing.JLabel();
        ShowLinejLabel = new javax.swing.JLabel();
        AreaShowLinejComboBox = new javax.swing.JComboBox<>();
        OkShowLinejButton = new javax.swing.JButton();

        showSelectLinejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showSelectLinejLabel.setText("Veuillez selectionnez un choix");
        showSelectLinejLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        showSelectLinejLabel.setMaximumSize(new java.awt.Dimension(200, 16));
        showSelectLinejLabel.setMinimumSize(new java.awt.Dimension(200, 16));
        showSelectLinejLabel.setPreferredSize(new java.awt.Dimension(200, 16));

        ShowLinejLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        ShowLinejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ShowLinejLabel.setText("Afficher les lignes de métro");

        AreaShowLinejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tous les quartiers", "du quartier Q1", "du quartier Q2", "du quartier Q3", "du quartier Q4", "du quartier Q5", "du quartier Q6", "du quartier Q7", "du quartier Q8", "du quartier Q9", "du quartier Q10", "du quartier Q11", "du quartier Q13", "du quartier Q14", "du quartier Q15", "du quartier Q16", "du quartier Q17", "du quartier Q18", "du quartier Q19", "du quartier Q20", "du quartier Q21", "du quartier Q22" }));
        AreaShowLinejComboBox.setMaximumSize(new java.awt.Dimension(170, 30));
        AreaShowLinejComboBox.setMinimumSize(new java.awt.Dimension(170, 30));
        AreaShowLinejComboBox.setPreferredSize(new java.awt.Dimension(170, 30));
        AreaShowLinejComboBox.setSize(new java.awt.Dimension(170, 30));
        AreaShowLinejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaShowLinejComboBoxActionPerformed(evt);
            }
        });

        OkShowLinejButton.setText("Valider");
        OkShowLinejButton.setMaximumSize(new java.awt.Dimension(80, 25));
        OkShowLinejButton.setMinimumSize(new java.awt.Dimension(80, 25));
        OkShowLinejButton.setPreferredSize(new java.awt.Dimension(80, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(showSelectLinejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AreaShowLinejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(ShowLinejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(OkShowLinejButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(ShowLinejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showSelectLinejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AreaShowLinejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(OkShowLinejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AreaShowLinejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaShowLinejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AreaShowLinejComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AreaShowLinejComboBox;
    private javax.swing.JButton OkShowLinejButton;
    private javax.swing.JLabel ShowLinejLabel;
    private javax.swing.JLabel showSelectLinejLabel;
    // End of variables declaration//GEN-END:variables
}
