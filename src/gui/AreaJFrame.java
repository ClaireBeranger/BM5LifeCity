package gui;

import javax.swing.JFrame;

public class AreaJFrame extends javax.swing.JFrame {
	

 /**
	 * @author Amira
	 */
	private static final long serialVersionUID = -6258284235223024914L;
			/**
		     * Creates new form AreaJFrame
		     */
		    public AreaJFrame() {
		        initComponents();
		    }

		    private void initComponents() {

		        ControlMyCityjLabel = new javax.swing.JLabel();
		        AreaDetailsjPanel = new javax.swing.JPanel();
		        ControlMyCityjLabel1 = new javax.swing.JLabel();
		        NumberOfUnemployedjButton = new javax.swing.JButton();
		        NumberOfEmployedjButton = new javax.swing.JButton();
		        LevelButton = new javax.swing.JButton();
		        NumberOfLinejButton = new javax.swing.JButton();
		        NumberOfInhabitantsjButton1 = new javax.swing.JButton();
		        NumberOfHousesjButton2 = new javax.swing.JButton();
		        LeveljComboBox = new javax.swing.JComboBox<>();
		        AreaMapjPanel = new javax.swing.JPanel();
		        jPanel1 = new javax.swing.JPanel();
		        jPanel3 = new javax.swing.JPanel();
		        jPanel5 = new javax.swing.JPanel();
		        jPanel6 = new javax.swing.JPanel();
		        jPanel7 = new javax.swing.JPanel();
		        jPanel8 = new javax.swing.JPanel();
		        jPanel10 = new javax.swing.JPanel();
		        jPanel11 = new javax.swing.JPanel();
		        jPanel12 = new javax.swing.JPanel();
		        jPanel13 = new javax.swing.JPanel();
		        jPanel14 = new javax.swing.JPanel();
		        jPanel15 = new javax.swing.JPanel();
		        jPanel16 = new javax.swing.JPanel();
		        jPanel18 = new javax.swing.JPanel();
		        jPanel19 = new javax.swing.JPanel();
		        jPanel20 = new javax.swing.JPanel();
		        jPanel2 = new javax.swing.JPanel();
		        BackToCityjButton = new javax.swing.JButton();

		        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		        ControlMyCityjLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
		        ControlMyCityjLabel.setForeground(new java.awt.Color(0, 102, 102));
		        ControlMyCityjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		        ControlMyCityjLabel.setText("Informations sur quatier Q1");

		        AreaDetailsjPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102))));

		        ControlMyCityjLabel1.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
		        ControlMyCityjLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		        ControlMyCityjLabel1.setText("Détails ");

		        NumberOfUnemployedjButton.setText("Nombre de chomeurs");

		        NumberOfEmployedjButton.setText("Nombre de travailleurs");

		        LevelButton.setText("Niveau");
		        LevelButton.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                LevelButtonActionPerformed(evt);
		            }
		        });

		        NumberOfLinejButton.setText("Nombre de lignes de métro");

		        NumberOfInhabitantsjButton1.setText("Nombre d'habitants");

		        NumberOfHousesjButton2.setText("Nombre de maisons");

		        LeveljComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Niveau 1", "Niveau 2", "Niveau 3" }));
		        LeveljComboBox.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                LeveljComboBoxActionPerformed(evt);
		            }
		        });

		        javax.swing.GroupLayout AreaDetailsjPanelLayout = new javax.swing.GroupLayout(AreaDetailsjPanel);
		        AreaDetailsjPanel.setLayout(AreaDetailsjPanelLayout);
		        AreaDetailsjPanelLayout.setHorizontalGroup(
		            AreaDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(AreaDetailsjPanelLayout.createSequentialGroup()
		                .addContainerGap()
		                .addGroup(AreaDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addComponent(ControlMyCityjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                    .addGroup(AreaDetailsjPanelLayout.createSequentialGroup()
		                        .addGroup(AreaDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                            .addComponent(LevelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                            .addComponent(NumberOfLinejButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                            .addComponent(NumberOfEmployedjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                            .addComponent(NumberOfInhabitantsjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                            .addComponent(NumberOfHousesjButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                            .addComponent(NumberOfUnemployedjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(LeveljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(0, 0, Short.MAX_VALUE)))
		                .addContainerGap())
		        );
		        AreaDetailsjPanelLayout.setVerticalGroup(
		            AreaDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(AreaDetailsjPanelLayout.createSequentialGroup()
		                .addContainerGap()
		                .addComponent(ControlMyCityjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                .addGroup(AreaDetailsjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(LevelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(LeveljComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                .addComponent(NumberOfLinejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                .addComponent(NumberOfHousesjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addGap(13, 13, 13)
		                .addComponent(NumberOfInhabitantsjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addComponent(NumberOfEmployedjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                .addComponent(NumberOfUnemployedjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addGap(157, 157, 157))
		        );

		        AreaMapjPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102))));

		        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		        jPanel1.setLayout(jPanel1Layout);
		        jPanel1Layout.setHorizontalGroup(
		            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel1Layout.setVerticalGroup(
		            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		        jPanel3.setLayout(jPanel3Layout);
		        jPanel3Layout.setHorizontalGroup(
		            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel3Layout.setVerticalGroup(
		            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		        jPanel5.setLayout(jPanel5Layout);
		        jPanel5Layout.setHorizontalGroup(
		            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel5Layout.setVerticalGroup(
		            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		        jPanel6.setLayout(jPanel6Layout);
		        jPanel6Layout.setHorizontalGroup(
		            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel6Layout.setVerticalGroup(
		            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
		        jPanel7.setLayout(jPanel7Layout);
		        jPanel7Layout.setHorizontalGroup(
		            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel7Layout.setVerticalGroup(
		            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
		        jPanel8.setLayout(jPanel8Layout);
		        jPanel8Layout.setHorizontalGroup(
		            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel8Layout.setVerticalGroup(
		            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
		        jPanel10.setLayout(jPanel10Layout);
		        jPanel10Layout.setHorizontalGroup(
		            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel10Layout.setVerticalGroup(
		            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
		        jPanel11.setLayout(jPanel11Layout);
		        jPanel11Layout.setHorizontalGroup(
		            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel11Layout.setVerticalGroup(
		            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        jPanel12.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
		        jPanel12.setLayout(jPanel12Layout);
		        jPanel12Layout.setHorizontalGroup(
		            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel12Layout.setVerticalGroup(
		            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        jPanel13.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
		        jPanel13.setLayout(jPanel13Layout);
		        jPanel13Layout.setHorizontalGroup(
		            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel13Layout.setVerticalGroup(
		            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        jPanel14.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
		        jPanel14.setLayout(jPanel14Layout);
		        jPanel14Layout.setHorizontalGroup(
		            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel14Layout.setVerticalGroup(
		            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        jPanel15.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
		        jPanel15.setLayout(jPanel15Layout);
		        jPanel15Layout.setHorizontalGroup(
		            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel15Layout.setVerticalGroup(
		            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        jPanel16.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
		        jPanel16.setLayout(jPanel16Layout);
		        jPanel16Layout.setHorizontalGroup(
		            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel16Layout.setVerticalGroup(
		            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        jPanel18.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
		        jPanel18.setLayout(jPanel18Layout);
		        jPanel18Layout.setHorizontalGroup(
		            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel18Layout.setVerticalGroup(
		            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        jPanel19.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
		        jPanel19.setLayout(jPanel19Layout);
		        jPanel19Layout.setHorizontalGroup(
		            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel19Layout.setVerticalGroup(
		            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        jPanel20.setBackground(new java.awt.Color(204, 204, 204));

		        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
		        jPanel20.setLayout(jPanel20Layout);
		        jPanel20Layout.setHorizontalGroup(
		            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );
		        jPanel20Layout.setVerticalGroup(
		            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGap(0, 100, Short.MAX_VALUE)
		        );

		        javax.swing.GroupLayout AreaMapjPanelLayout = new javax.swing.GroupLayout(AreaMapjPanel);
		        AreaMapjPanel.setLayout(AreaMapjPanelLayout);
		        AreaMapjPanelLayout.setHorizontalGroup(
		            AreaMapjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaMapjPanelLayout.createSequentialGroup()
		                .addContainerGap(18, Short.MAX_VALUE)
		                .addGroup(AreaMapjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(AreaMapjPanelLayout.createSequentialGroup()
		                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(18, 18, 18)
		                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(18, 18, 18)
		                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(18, 18, 18)
		                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                    .addGroup(AreaMapjPanelLayout.createSequentialGroup()
		                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(18, 18, 18)
		                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(18, 18, 18)
		                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(18, 18, 18)
		                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                    .addGroup(AreaMapjPanelLayout.createSequentialGroup()
		                        .addGroup(AreaMapjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaMapjPanelLayout.createSequentialGroup()
		                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(18, 18, 18)
		                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(18, 18, 18)
		                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                            .addGroup(AreaMapjPanelLayout.createSequentialGroup()
		                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(18, 18, 18)
		                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addGap(18, 18, 18)
		                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                        .addGap(18, 18, 18)
		                        .addGroup(AreaMapjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
		                .addGap(18, 18, 18))
		        );
		        AreaMapjPanelLayout.setVerticalGroup(
		            AreaMapjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(AreaMapjPanelLayout.createSequentialGroup()
		                .addGap(18, 18, 18)
		                .addGroup(AreaMapjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addGap(18, 18, 18)
		                .addGroup(AreaMapjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addGap(18, 18, 18)
		                .addGroup(AreaMapjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addGap(18, 18, 18)
		                .addGroup(AreaMapjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addContainerGap(18, Short.MAX_VALUE))
		        );

		        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102))));

		        BackToCityjButton.setText("Revenir sur la ville");
		        BackToCityjButton.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                BackToCityjButtonActionPerformed(evt);
		            }
		        });

		        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		        jPanel2.setLayout(jPanel2Layout);
		        jPanel2Layout.setHorizontalGroup(
		            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel2Layout.createSequentialGroup()
		                .addGap(48, 48, 48)
		                .addComponent(BackToCityjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		        );
		        jPanel2Layout.setVerticalGroup(
		            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(jPanel2Layout.createSequentialGroup()
		                .addGap(23, 23, 23)
		                .addComponent(BackToCityjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addContainerGap(32, Short.MAX_VALUE))
		        );

		        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		        getContentPane().setLayout(layout);
		        layout.setHorizontalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		                .addContainerGap()
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addComponent(ControlMyCityjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                    .addGroup(layout.createSequentialGroup()
		                        .addComponent(AreaMapjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(AreaDetailsjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		                .addContainerGap())
		        );
		        layout.setVerticalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(layout.createSequentialGroup()
		                .addContainerGap()
		                .addComponent(ControlMyCityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
		                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                    .addComponent(AreaMapjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addGroup(layout.createSequentialGroup()
		                        .addComponent(AreaDetailsjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                .addContainerGap(8, Short.MAX_VALUE))
		        );

		        pack();
		    }                      

		    private void LevelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
		        // TODO add your handling code here:
		    }                                           

		    private void LeveljComboBoxActionPerformed(java.awt.event.ActionEvent evt) {                                               
		        // TODO add your handling code here:
		    }                                              

		    private void BackToCityjButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
		            CityJFrame cityFrame = new CityJFrame();
		            cityFrame.setVisible(true);
		            cityFrame.setLocationRelativeTo(null);
		            cityFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		            cityFrame.pack();
		            this.dispose();
		    }                                                 

		    /**
		     * @param args the command line arguments
		     */
		    public static void main(String args[]) {
		        
		        try {
		            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		                if ("Nimbus".equals(info.getName())) {
		                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		                    break;
		                }
		            }
		        } catch (ClassNotFoundException ex) {
		            java.util.logging.Logger.getLogger(AreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (InstantiationException ex) {
		            java.util.logging.Logger.getLogger(AreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (IllegalAccessException ex) {
		            java.util.logging.Logger.getLogger(AreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
		            java.util.logging.Logger.getLogger(AreaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		        }
		        
		        java.awt.EventQueue.invokeLater(new Runnable() {
		            public void run() {
		                new AreaJFrame().setVisible(true);
		            }
		        });
		    }

		    // Variables declaration - do not modify                     
		    private javax.swing.JPanel AreaDetailsjPanel;
		    private javax.swing.JPanel AreaMapjPanel;
		    private javax.swing.JButton BackToCityjButton;
		    private javax.swing.JLabel ControlMyCityjLabel;
		    private javax.swing.JLabel ControlMyCityjLabel1;
		    private javax.swing.JButton LevelButton;
		    private javax.swing.JComboBox<String> LeveljComboBox;
		    private javax.swing.JButton NumberOfEmployedjButton;
		    private javax.swing.JButton NumberOfHousesjButton2;
		    private javax.swing.JButton NumberOfInhabitantsjButton1;
		    private javax.swing.JButton NumberOfLinejButton;
		    private javax.swing.JButton NumberOfUnemployedjButton;
		    private javax.swing.JPanel jPanel1;
		    private javax.swing.JPanel jPanel10;
		    private javax.swing.JPanel jPanel11;
		    private javax.swing.JPanel jPanel12;
		    private javax.swing.JPanel jPanel13;
		    private javax.swing.JPanel jPanel14;
		    private javax.swing.JPanel jPanel15;
		    private javax.swing.JPanel jPanel16;
		    private javax.swing.JPanel jPanel17;
		    private javax.swing.JPanel jPanel18;
		    private javax.swing.JPanel jPanel19;
		    private javax.swing.JPanel jPanel2;
		    private javax.swing.JPanel jPanel20;
		    private javax.swing.JPanel jPanel3;
		    private javax.swing.JPanel jPanel4;
		    private javax.swing.JPanel jPanel5;
		    private javax.swing.JPanel jPanel6;
		    private javax.swing.JPanel jPanel7;
		    private javax.swing.JPanel jPanel8;
		    private javax.swing.JPanel jPanel9;
		    // End of variables declaration                   
		

}
