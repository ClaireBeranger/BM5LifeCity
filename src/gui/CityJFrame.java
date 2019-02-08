
package gui;

/**
 * @author Amira
 *
 */


import javax.swing.JFrame;
import utils.DialogUtils;

/**
 *
 * @author Amira
 */
public class CityJFrame extends JFrame {
       
        
  
    public CityJFrame() {
        initComponents();
    }

   
                            
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ControlMyCityjLabel = new javax.swing.JLabel();
        BuyAreajButton = new javax.swing.JButton();
        AddStationjButton = new javax.swing.JButton();
        AddLineButton = new javax.swing.JButton();
        DevelopmentjButton = new javax.swing.JButton();
        EvolutionjLabel = new javax.swing.JLabel();
        CityJPanel = new javax.swing.JPanel();
        UserJPanel = new javax.swing.JPanel();
        UserNamejLabel = new javax.swing.JLabel();
        BM5LifeCityjLabel = new javax.swing.JLabel();
        LogOutjButton = new javax.swing.JButton();
        CityInformationJPanel1 = new javax.swing.JPanel();
        CityInformationsjLabel = new javax.swing.JLabel();
        BudgetjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102))));

        ControlMyCityjLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        ControlMyCityjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ControlMyCityjLabel.setText("Contrôler ma ville");

        BuyAreajButton.setText("Acheter un quartier");
        BuyAreajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyAreajButtonActionPerformed(evt);
            }
        });

        AddStationjButton.setText("Ajouter une station");
        AddStationjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStationjButtonActionPerformed(evt);
            }
        });

        AddLineButton.setText("Ajouter une ligne de métro");
        AddLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLineButtonActionPerformed(evt);
            }
        });

        DevelopmentjButton.setText("Développer un quartier");
        DevelopmentjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevelopmentjButtonActionPerformed(evt);
            }
        });

        EvolutionjLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        EvolutionjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EvolutionjLabel.setText("Evolution");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ControlMyCityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EvolutionjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BuyAreajButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddStationjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddLineButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(DevelopmentjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ControlMyCityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BuyAreajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddStationjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DevelopmentjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(EvolutionjLabel)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        CityJPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102))));

        javax.swing.GroupLayout CityJPanelLayout = new javax.swing.GroupLayout(CityJPanel);
        CityJPanel.setLayout(CityJPanelLayout);
        CityJPanelLayout.setHorizontalGroup(
            CityJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );
        CityJPanelLayout.setVerticalGroup(
            CityJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        UserJPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102))));

        UserNamejLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        UserNamejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserNamejLabel.setText("User Name");

        BM5LifeCityjLabel.setFont(new java.awt.Font("Snell Roundhand", 1, 18)); // NOI18N
        BM5LifeCityjLabel.setForeground(new java.awt.Color(0, 102, 102));
        BM5LifeCityjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BM5LifeCityjLabel.setText("BM5lifeCity");

        LogOutjButton.setText("Déconnexion");
        LogOutjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UserJPanelLayout = new javax.swing.GroupLayout(UserJPanel);
        UserJPanel.setLayout(UserJPanelLayout);
        UserJPanelLayout.setHorizontalGroup(
            UserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserJPanelLayout.createSequentialGroup()
                .addGroup(UserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UserJPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(UserNamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UserJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(UserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BM5LifeCityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogOutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        UserJPanelLayout.setVerticalGroup(
            UserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserJPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(UserNamejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogOutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BM5LifeCityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CityInformationJPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102))));

        CityInformationsjLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        CityInformationsjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CityInformationsjLabel.setText("Informations sur ma ville");

        BudgetjButton.setText("Budget");
        BudgetjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BudgetjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CityInformationJPanel1Layout = new javax.swing.GroupLayout(CityInformationJPanel1);
        CityInformationJPanel1.setLayout(CityInformationJPanel1Layout);
        CityInformationJPanel1Layout.setHorizontalGroup(
            CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CityInformationsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BudgetjButton)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        CityInformationJPanel1Layout.setVerticalGroup(
            CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                .addGroup(CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CityInformationsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(BudgetjButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CityInformationJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CityJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CityJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CityInformationJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void BuyAreajButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        DialogUtils.showDialog(new BuyAreaPanel());
    }                                              

    private void AddStationjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
    		DialogUtils.showDialog(new AddStationPanel());
    }                                                 

    private void AddLineButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
    		DialogUtils.showDialog(new AddLinePanel());
    }                                             

    private void DevelopmentjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        DialogUtils.showDialog(new DevelopmentControlPanel());
    }                                                  

    private void LogOutjButtonActionPerformed(java.awt.event.ActionEvent evt) {
    		//"Vous voulez vraiment quitter votre ville?");
    }                                             

    private void BudgetjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
    		DialogUtils.showDialog(new AreaDetailsPanel());
    }                                             

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CityJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton AddLineButton;
    private javax.swing.JButton AddStationjButton;
    private javax.swing.JLabel BM5LifeCityjLabel;
    private javax.swing.JButton BudgetjButton;
    private javax.swing.JButton BuyAreajButton;
    private javax.swing.JPanel CityInformationJPanel1;
    private javax.swing.JLabel CityInformationsjLabel;
    private javax.swing.JPanel CityJPanel;
    private javax.swing.JLabel ControlMyCityjLabel;
    private javax.swing.JButton DevelopmentjButton;
    private javax.swing.JLabel EvolutionjLabel;
    private javax.swing.JButton LogOutjButton;
    private javax.swing.JPanel UserJPanel;
    private javax.swing.JLabel UserNamejLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
