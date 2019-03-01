
package gui;

import javax.swing.JDialog;
import utils.DialogUtils;


/**
 *
 * @author Amira
 */
public class CityControlPanel extends javax.swing.JPanel {
    
    public CityControlPanel() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddStationjButton = new javax.swing.JButton();
        BuyAreajButton = new javax.swing.JButton();
        AddLineButton = new javax.swing.JButton();
        DevelopmentjButton = new javax.swing.JButton();
        ControlMyCityjLabel = new javax.swing.JLabel();
        EvolutionjLabel = new javax.swing.JLabel();

        AddStationjButton.setText("Ajouter une station");

        BuyAreajButton.setText("Acheter un  quartier");

        AddLineButton.setText("Ajouter une ligne de métro");

        DevelopmentjButton.setText("Développer un quartier");

        ControlMyCityjLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        ControlMyCityjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ControlMyCityjLabel.setText("Contrôler ma ville");

        EvolutionjLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        EvolutionjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EvolutionjLabel.setText("Evolution");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EvolutionjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(DevelopmentjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AddLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddStationjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ControlMyCityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BuyAreajButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ControlMyCityjLabel)
                .addGap(31, 31, 31)
                .addComponent(BuyAreajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddStationjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DevelopmentjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EvolutionjLabel)
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddLineButton;
    private javax.swing.JButton AddStationjButton;
    private javax.swing.JButton BuyAreajButton;
    private javax.swing.JLabel ControlMyCityjLabel;
    private javax.swing.JButton DevelopmentjButton;
    private javax.swing.JLabel EvolutionjLabel;
    // End of variables declaration//GEN-END:variables
}
