
package gui;

import javax.swing.JPanel;

/**
 * @author Amira
 *
 */
public class DevelopmentControlPanel extends JPanel {

    private static final long serialVersionUID = 4113043323408879319L;

    public DevelopmentControlPanel() {
        initComponents();
    }

    private void initComponents() {

        PricejComboBox = new javax.swing.JComboBox<>();
        AreajComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ValidatejButton1 = new javax.swing.JButton();

        PricejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"200$", "500$", "700$", "100$"}));
        PricejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PricejComboBoxActionPerformed(evt);
            }
        });

        AreajComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Quartier Q1", "Quartier Q2", "Quartier Q3", "Quartier Q4", "Quartier Q5", "Quartier Q6", "Quartier Q7", "Quartier Q8", "Quartier Q9"}));
        AreajComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreajComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Développement d'un quartier");

        ValidatejButton1.setText("Valider");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(86, 86, 86)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(PricejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(AreajComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(16, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ValidatejButton1)
                                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(AreajComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PricejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ValidatejButton1)
                                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void PricejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void AreajComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> AreajComboBox1;
    private javax.swing.JComboBox<String> PricejComboBox;
    private javax.swing.JButton ValidatejButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration                   
}
