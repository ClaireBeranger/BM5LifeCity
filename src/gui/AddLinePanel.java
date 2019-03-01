
package gui;

import gui.CityMainFrame.OnCityControlActionListener;

/**
 *
 * @author amira
 */
public class AddLinePanel extends javax.swing.JPanel {

    private OnCityControlActionListener listener;
    
    
    public AddLinePanel(OnCityControlActionListener pListener) {
        initComponents();
        
        listener = pListener;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddLinejLabel = new javax.swing.JLabel();
        XpositionjLabel1 = new javax.swing.JLabel();
        DistrictArricejLabel = new javax.swing.JLabel();
        DistrictDepartjLabel = new javax.swing.JLabel();
        StationPricejLabel = new javax.swing.JLabel();
        departureXPosComboBox = new javax.swing.JComboBox<>();
        departureYPosComboBox = new javax.swing.JComboBox<>();
        priceLabel = new javax.swing.JLabel();
        validateButton = new javax.swing.JButton();
        YpositionjLabel = new javax.swing.JLabel();
        XpositionjLabel = new javax.swing.JLabel();
        XpositionArrivejLabel = new javax.swing.JLabel();
        YArrivePositionjLabel = new javax.swing.JLabel();
        arrivalXPosComboBox = new javax.swing.JComboBox<>();
        arrivalYPosComboBox = new javax.swing.JComboBox<>();

        AddLinejLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        AddLinejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddLinejLabel.setText("Ajouter une ligne de métro");

        XpositionjLabel1.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        XpositionjLabel1.setText("Veuillez choisir les coordonnées des quartiers");

        DistrictArricejLabel.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        DistrictArricejLabel.setText("Quartier du départ");

        DistrictDepartjLabel.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        DistrictDepartjLabel.setText("Quartier d'arrivée");

        StationPricejLabel.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        StationPricejLabel.setText("Prix");

        departureXPosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        departureXPosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureXPosComboBoxActionPerformed(evt);
            }
        });

        departureYPosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        departureYPosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departureYPosComboBoxActionPerformed(evt);
            }
        });

        priceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        priceLabel.setMaximumSize(new java.awt.Dimension(80, 20));
        priceLabel.setMinimumSize(new java.awt.Dimension(80, 20));
        priceLabel.setPreferredSize(new java.awt.Dimension(80, 20));
        priceLabel.setSize(new java.awt.Dimension(45, 20));
        priceLabel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                priceLabelPropertyChange(evt);
            }
        });

        validateButton.setText("Valider");
        validateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateButtonActionPerformed(evt);
            }
        });

        YpositionjLabel.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        YpositionjLabel.setText("Y");

        XpositionjLabel.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        XpositionjLabel.setText("X");

        XpositionArrivejLabel.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        XpositionArrivejLabel.setText("X");

        YArrivePositionjLabel.setFont(new java.awt.Font("Songti SC", 1, 18)); // NOI18N
        YArrivePositionjLabel.setText("Y");

        arrivalXPosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        arrivalXPosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrivalXPosComboBoxActionPerformed(evt);
            }
        });

        arrivalYPosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        arrivalYPosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrivalYPosComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(validateButton)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DistrictDepartjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DistrictArricejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(XpositionjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(XpositionArrivejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(StationPricejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(departureXPosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(YpositionjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(arrivalXPosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(YArrivePositionjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(departureYPosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(arrivalYPosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(XpositionjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(AddLinejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(AddLinejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(XpositionjLabel1)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DistrictArricejLabel)
                            .addComponent(departureXPosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departureYPosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(XpositionjLabel)
                            .addComponent(YpositionjLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DistrictDepartjLabel)
                            .addComponent(XpositionArrivejLabel)
                            .addComponent(YArrivePositionjLabel)
                            .addComponent(arrivalXPosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arrivalYPosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(StationPricejLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(validateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void departureXPosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureXPosComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departureXPosComboBoxActionPerformed

    private void departureYPosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departureYPosComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departureYPosComboBoxActionPerformed

    private void priceLabelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_priceLabelPropertyChange

    }//GEN-LAST:event_priceLabelPropertyChange

    private void validateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateButtonActionPerformed
        listener.onAddLine(departureXPosComboBox.getSelectedIndex(), departureYPosComboBox.getSelectedIndex(),
                arrivalXPosComboBox.getSelectedIndex(), arrivalYPosComboBox.getSelectedIndex());
    }//GEN-LAST:event_validateButtonActionPerformed

    private void arrivalXPosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrivalXPosComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arrivalXPosComboBoxActionPerformed

    private void arrivalYPosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrivalYPosComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arrivalYPosComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddLinejLabel;
    private javax.swing.JLabel DistrictArricejLabel;
    private javax.swing.JLabel DistrictDepartjLabel;
    private javax.swing.JLabel StationPricejLabel;
    private javax.swing.JLabel XpositionArrivejLabel;
    private javax.swing.JLabel XpositionjLabel;
    private javax.swing.JLabel XpositionjLabel1;
    private javax.swing.JLabel YArrivePositionjLabel;
    private javax.swing.JLabel YpositionjLabel;
    private javax.swing.JComboBox<String> arrivalXPosComboBox;
    private javax.swing.JComboBox<String> arrivalYPosComboBox;
    private javax.swing.JComboBox<String> departureXPosComboBox;
    private javax.swing.JComboBox<String> departureYPosComboBox;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton validateButton;
    // End of variables declaration//GEN-END:variables
}
