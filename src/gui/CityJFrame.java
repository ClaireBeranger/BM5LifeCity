
package gui;

/**
 * 
 * @author Amira - Claire
 *
 */
import javax.swing.JFrame;
import utils.DialogUtils;

public class CityJFrame extends JFrame {
             
  
    public CityJFrame() {
        initComponents();
    }

   
                            
    private void initComponents() {

        ControlCityjPanel = new javax.swing.JPanel();
        ControlMyCityjLabel = new javax.swing.JLabel();
        BuyAreajButton = new javax.swing.JButton();
        AddStationjButton = new javax.swing.JButton();
        AddLineButton = new javax.swing.JButton();
        DevelopmentjButton = new javax.swing.JButton();
        EvolutionjLabel = new javax.swing.JLabel();
        EvolutionjPanel = new javax.swing.JPanel();
        Evolutioncanvas = new java.awt.Canvas();
        CityJPanel = new javax.swing.JPanel();
        Q1Panel = new javax.swing.JPanel();
        Q3Panel = new javax.swing.JPanel();
        Q2Panel = new javax.swing.JPanel();
        Q4Panel = new javax.swing.JPanel();
        Q6Panel = new javax.swing.JPanel();
        Q7Panel = new javax.swing.JPanel();
        Q8Panel = new javax.swing.JPanel();
        Q9Panel = new javax.swing.JPanel();
        Q5Panel = new javax.swing.JPanel();
        UserJPanel = new javax.swing.JPanel();
        UserNamejLabel = new javax.swing.JLabel();
        BM5LifeCityjLabel = new javax.swing.JLabel();
        LogOutjButton = new javax.swing.JButton();
        CityInformationJPanel = new javax.swing.JPanel();
        CityInformationsjLabel = new javax.swing.JLabel();
        BudgetjButton = new javax.swing.JButton();
        nbHabitant = new javax.swing.JLabel();
        nbQuartier = new javax.swing.JLabel();
        argentGain = new javax.swing.JLabel();
        prosperite = new javax.swing.JLabel();
        Budget = new javax.swing.JLabel();
        typeQuartier = new javax.swing.JLabel();
        argentPerdu = new javax.swing.JLabel();
        nbStation = new javax.swing.JLabel();
        nbLigne = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlCityjPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102))));

        ControlMyCityjLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        ControlMyCityjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ControlMyCityjLabel.setText("Contrôler ma ville");

        BuyAreajButton.setText("Acheter un  quartier");
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

        EvolutionjPanel.setBackground(new java.awt.Color(204, 204, 204));
        EvolutionjPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        javax.swing.GroupLayout EvolutionjPanelLayout = new javax.swing.GroupLayout(EvolutionjPanel);
        EvolutionjPanel.setLayout(EvolutionjPanelLayout);
        EvolutionjPanelLayout.setHorizontalGroup(
            EvolutionjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvolutionjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Evolutioncanvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        EvolutionjPanelLayout.setVerticalGroup(
            EvolutionjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EvolutionjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Evolutioncanvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ControlCityjPanelLayout = new javax.swing.GroupLayout(ControlCityjPanel);
        ControlCityjPanel.setLayout(ControlCityjPanelLayout);
        ControlCityjPanelLayout.setHorizontalGroup(
            ControlCityjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlCityjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlCityjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EvolutionjPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ControlCityjPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(ControlCityjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ControlCityjPanelLayout.createSequentialGroup()
                                .addComponent(ControlMyCityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(ControlCityjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EvolutionjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(ControlCityjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BuyAreajButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AddStationjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AddLineButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(DevelopmentjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(30, 30, 30))
        );
        ControlCityjPanelLayout.setVerticalGroup(
            ControlCityjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlCityjPanelLayout.createSequentialGroup()
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EvolutionjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        CityJPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102))));
        CityJPanel.setPreferredSize(new java.awt.Dimension(520, 520));

        Q1Panel.setBackground(new java.awt.Color(0, 130, 0));
        Q1Panel.setSize(new java.awt.Dimension(18, 18));
        Q1Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Q1PanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Q1PanelLayout = new javax.swing.GroupLayout(Q1Panel);
        Q1Panel.setLayout(Q1PanelLayout);
        Q1PanelLayout.setHorizontalGroup(
            Q1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        Q1PanelLayout.setVerticalGroup(
            Q1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        Q3Panel.setBackground(new java.awt.Color(0, 130, 0));
        Q3Panel.setSize(new java.awt.Dimension(18, 18));
        Q3Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Q3PanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Q3PanelLayout = new javax.swing.GroupLayout(Q3Panel);
        Q3Panel.setLayout(Q3PanelLayout);
        Q3PanelLayout.setHorizontalGroup(
            Q3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        Q3PanelLayout.setVerticalGroup(
            Q3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        Q2Panel.setBackground(new java.awt.Color(0, 102, 51));
        Q2Panel.setSize(new java.awt.Dimension(18, 18));
        Q2Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Q2PanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Q2PanelLayout = new javax.swing.GroupLayout(Q2Panel);
        Q2Panel.setLayout(Q2PanelLayout);
        Q2PanelLayout.setHorizontalGroup(
            Q2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        Q2PanelLayout.setVerticalGroup(
            Q2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        Q4Panel.setBackground(new java.awt.Color(0, 102, 51));
        Q4Panel.setSize(new java.awt.Dimension(18, 18));
        Q4Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Q4PanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Q4PanelLayout = new javax.swing.GroupLayout(Q4Panel);
        Q4Panel.setLayout(Q4PanelLayout);
        Q4PanelLayout.setHorizontalGroup(
            Q4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        Q4PanelLayout.setVerticalGroup(
            Q4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        Q6Panel.setBackground(new java.awt.Color(0, 102, 51));
        Q6Panel.setSize(new java.awt.Dimension(18, 18));
        Q6Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Q6PanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Q6PanelLayout = new javax.swing.GroupLayout(Q6Panel);
        Q6Panel.setLayout(Q6PanelLayout);
        Q6PanelLayout.setHorizontalGroup(
            Q6PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        Q6PanelLayout.setVerticalGroup(
            Q6PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        Q7Panel.setBackground(new java.awt.Color(0, 130, 0));
        Q7Panel.setSize(new java.awt.Dimension(18, 18));
        Q7Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Q7PanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Q7PanelLayout = new javax.swing.GroupLayout(Q7Panel);
        Q7Panel.setLayout(Q7PanelLayout);
        Q7PanelLayout.setHorizontalGroup(
            Q7PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        Q7PanelLayout.setVerticalGroup(
            Q7PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        Q8Panel.setBackground(new java.awt.Color(0, 102, 51));
        Q8Panel.setSize(new java.awt.Dimension(18, 18));
        Q8Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Q8PanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Q8PanelLayout = new javax.swing.GroupLayout(Q8Panel);
        Q8Panel.setLayout(Q8PanelLayout);
        Q8PanelLayout.setHorizontalGroup(
            Q8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        Q8PanelLayout.setVerticalGroup(
            Q8PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        Q9Panel.setBackground(new java.awt.Color(0, 130, 0));
        Q9Panel.setSize(new java.awt.Dimension(18, 18));
        Q9Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Q9PanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Q9PanelLayout = new javax.swing.GroupLayout(Q9Panel);
        Q9Panel.setLayout(Q9PanelLayout);
        Q9PanelLayout.setHorizontalGroup(
            Q9PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        Q9PanelLayout.setVerticalGroup(
            Q9PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        Q5Panel.setBackground(new java.awt.Color(0, 130, 0));
        Q5Panel.setSize(new java.awt.Dimension(18, 18));
        Q5Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Q5PanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Q5PanelLayout = new javax.swing.GroupLayout(Q5Panel);
        Q5Panel.setLayout(Q5PanelLayout);
        Q5PanelLayout.setHorizontalGroup(
            Q5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        Q5PanelLayout.setVerticalGroup(
            Q5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CityJPanelLayout = new javax.swing.GroupLayout(CityJPanel);
        CityJPanel.setLayout(CityJPanelLayout);
        CityJPanelLayout.setHorizontalGroup(
            CityJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CityJPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(CityJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CityJPanelLayout.createSequentialGroup()
                        .addGroup(CityJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CityJPanelLayout.createSequentialGroup()
                                .addComponent(Q1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Q2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CityJPanelLayout.createSequentialGroup()
                                .addComponent(Q4Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Q5Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(CityJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Q6Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Q3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CityJPanelLayout.createSequentialGroup()
                        .addComponent(Q7Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Q8Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Q9Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        CityJPanelLayout.setVerticalGroup(
            CityJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CityJPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(CityJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Q3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Q1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Q2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CityJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(CityJPanelLayout.createSequentialGroup()
                        .addGroup(CityJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Q4Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Q6Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(CityJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Q7Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Q9Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CityJPanelLayout.createSequentialGroup()
                        .addComponent(Q5Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Q8Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
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
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addContainerGap(19, Short.MAX_VALUE))
        );

        CityInformationJPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102))));

        CityInformationsjLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        CityInformationsjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CityInformationsjLabel.setText("Informations sur ma ville");

        BudgetjButton.setText("2000$");
        BudgetjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BudgetjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CityInformationJPanel1Layout = new javax.swing.GroupLayout(CityInformationJPanel);
        CityInformationJPanel.setLayout(CityInformationJPanel1Layout);
        CityInformationJPanel1Layout.setHorizontalGroup(
            CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CityInformationsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BudgetjButton)
                .addGap(16, 16, 16))
        );
        CityInformationJPanel1Layout.setVerticalGroup(
            CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CityInformationsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BudgetjButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CityJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                    .addComponent(CityInformationJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ControlCityjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ControlCityjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CityJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CityInformationJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }                       

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
    		
    }                                             
    private void Q1PanelMousePressed(java.awt.event.MouseEvent evt) {                                     
        AreaJFrame areaFrame = new AreaJFrame("Q1");
        areaFrame.setVisible(true);
        areaFrame.setLocationRelativeTo(null);
        areaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        areaFrame.pack();
        this.dispose();
    }    
    
    private void Q2PanelMousePressed(java.awt.event.MouseEvent evt) {                                     
        AreaJFrame areaFrame = new AreaJFrame("Q2");
        areaFrame.setVisible(true);
        areaFrame.setLocationRelativeTo(null);
        areaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        areaFrame.pack();
        this.dispose();
    }  
    
    private void Q3PanelMousePressed(java.awt.event.MouseEvent evt) {                                     
        AreaJFrame areaFrame = new AreaJFrame("Q3");
        areaFrame.setVisible(true);
        areaFrame.setLocationRelativeTo(null);
        areaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        areaFrame.pack();
        this.dispose();
    } 
    
    private void Q4PanelMousePressed(java.awt.event.MouseEvent evt) {                                     
        AreaJFrame areaFrame = new AreaJFrame("Q4");
        areaFrame.setVisible(true);
        areaFrame.setLocationRelativeTo(null);
        areaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        areaFrame.pack();
        this.dispose();
    } 
    
    private void Q5PanelMousePressed(java.awt.event.MouseEvent evt) {                                     
        AreaJFrame areaFrame = new AreaJFrame("Q5");
        areaFrame.setVisible(true);
        areaFrame.setLocationRelativeTo(null);
        areaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        areaFrame.pack();
        this.dispose();
    } 
    
    private void Q6PanelMousePressed(java.awt.event.MouseEvent evt) {                                     
        AreaJFrame areaFrame = new AreaJFrame("Q6");
        areaFrame.setVisible(true);
        areaFrame.setLocationRelativeTo(null);
        areaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        areaFrame.pack();
        this.dispose();
    } 
    
    private void Q7PanelMousePressed(java.awt.event.MouseEvent evt) {                                     
        AreaJFrame areaFrame = new AreaJFrame("Q7");
        areaFrame.setVisible(true);
        areaFrame.setLocationRelativeTo(null);
        areaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        areaFrame.pack();
        this.dispose();
    } 
    private void Q8PanelMousePressed(java.awt.event.MouseEvent evt) {                                     
        AreaJFrame areaFrame = new AreaJFrame("Q8");
        areaFrame.setVisible(true);
        areaFrame.setLocationRelativeTo(null);
        areaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        areaFrame.pack();
        this.dispose();
    } 
    private void Q9PanelMousePressed(java.awt.event.MouseEvent evt) {                                     
        AreaJFrame areaFrame = new AreaJFrame("Q9");
        areaFrame.setVisible(true);
        areaFrame.setLocationRelativeTo(null);
        areaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        areaFrame.pack();
        this.dispose();
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
    private javax.swing.JLabel nbHabitant;
    private javax.swing.JLabel nbQuartier;
    private javax.swing.JLabel argentGain;
    private javax.swing.JLabel prosperite;
    private javax.swing.JLabel Budget;
    private javax.swing.JLabel typeQuartier;
    private javax.swing.JLabel argentPerdu;
    private javax.swing.JLabel nbStation;
    private javax.swing.JLabel nbLigne;
    private javax.swing.JButton BuyAreajButton;
    private javax.swing.JPanel CityInformationJPanel;
    private javax.swing.JLabel CityInformationsjLabel;
    private javax.swing.JPanel CityJPanel;
    private javax.swing.JPanel ControlCityjPanel;
    private javax.swing.JLabel ControlMyCityjLabel;
    private javax.swing.JButton DevelopmentjButton;
    private java.awt.Canvas Evolutioncanvas;
    private javax.swing.JLabel EvolutionjLabel;
    private javax.swing.JPanel EvolutionjPanel;
    private javax.swing.JButton LogOutjButton;
    private javax.swing.JPanel Q1Panel;
    private javax.swing.JPanel Q2Panel;
    private javax.swing.JPanel Q3Panel;
    private javax.swing.JPanel Q4Panel;
    private javax.swing.JPanel Q5Panel;
    private javax.swing.JPanel Q6Panel;
    private javax.swing.JPanel Q7Panel;
    private javax.swing.JPanel Q8Panel;
    private javax.swing.JPanel Q9Panel;
    private javax.swing.JPanel UserJPanel;
    private javax.swing.JLabel UserNamejLabel;
    // End of variables declaration                   
}
