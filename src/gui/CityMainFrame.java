
package gui;

import city.City;
import city.controller.CityController;
import city.factory.CityFactory;
import javax.swing.JDialog;
import utils.DialogUtils;

/**
 *
 * @author Amira - Claire
 */
public class CityMainFrame extends javax.swing.JFrame {

    private CityNameJFrame nametextField = new CityNameJFrame();

    private CityController cityController;

    private City city;

    int nbmQuart = 0;

    public interface OnCityControlActionListener {

        void onBuyDistrict(int i, int j, String type);

        void onAddStation(int i, int j);

        public void onAddLine(int departureX, int departureY, int arrivalX, int arrivalY);
    }

    public CityMainFrame(String title) {
        initComponents(title);

        city = CityFactory.getCergy(title);

        cityController = new CityController(city);

        cityView.setCity(city);
        
        cityNameLabel.setText(city.getName());
        
        datejLabel.setText(city.getClock().toStringHour());
    }

    /* public setVisible(boolean visible) {
        Q11Panel.setVisible(visible);
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(String title) {

        ControlCityjPanel = new javax.swing.JPanel();
        ControlMyCityjLabel = new javax.swing.JLabel();
        BuyAreajButton = new javax.swing.JButton();
        AddStationjButton = new javax.swing.JButton();
        AddLineButton = new javax.swing.JButton();
        DevelopmentjButton = new javax.swing.JButton();
        EvolutionjLabel = new javax.swing.JLabel();
        EvolutionjPanel = new javax.swing.JPanel();
        Evolutioncanvas = new java.awt.Canvas();
        UserJPanel = new javax.swing.JPanel();
        UserNamejLabel = new javax.swing.JLabel();
        BM5LifeCityjLabel = new javax.swing.JLabel();
        LogOutjButton = new javax.swing.JButton();
        CityNamejPanel = new javax.swing.JPanel();
        cityNameLabel = new javax.swing.JLabel();
        CityInformationJPanel1 = new javax.swing.JPanel();
        CityInformationsjLabel = new javax.swing.JLabel();
        nbrequartiersjLabel = new javax.swing.JTextField();
        nbreHabitjLabel = new javax.swing.JLabel();
        cagnottejTextField = new javax.swing.JTextField();
        prosperitejTextField = new javax.swing.JTextField();
        prosperitejProgressBar = new javax.swing.JProgressBar();
        nbreQuartiersjLabel = new javax.swing.JLabel();
        cagnottejLabel = new javax.swing.JLabel();
        nbreHabitantjLabel = new javax.swing.JLabel();
        datejLabel = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        ShowLineButton = new javax.swing.JButton();
        cityView = new gui.CityView();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 800));
        setResizable(false);

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
        AddStationjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        DevelopmentjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
            .addGroup(EvolutionjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Evolutioncanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EvolutionjPanelLayout.setVerticalGroup(
            EvolutionjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EvolutionjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Evolutioncanvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ControlCityjPanelLayout = new javax.swing.GroupLayout(ControlCityjPanel);
        ControlCityjPanel.setLayout(ControlCityjPanelLayout);
        ControlCityjPanelLayout.setHorizontalGroup(
            ControlCityjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlCityjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlCityjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlCityjPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EvolutionjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(ControlCityjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DevelopmentjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .addComponent(AddLineButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(AddStationjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BuyAreajButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ControlMyCityjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlCityjPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EvolutionjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ControlCityjPanelLayout.setVerticalGroup(
            ControlCityjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlCityjPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ControlMyCityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BuyAreajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddStationjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DevelopmentjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EvolutionjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EvolutionjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addContainerGap()
                .addComponent(UserNamejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(UserJPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(UserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UserJPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(BM5LifeCityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LogOutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        UserJPanelLayout.setVerticalGroup(
            UserJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserJPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(UserNamejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogOutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BM5LifeCityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CityNamejPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102))));

        cityNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cityNameLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));

        javax.swing.GroupLayout CityNamejPanelLayout = new javax.swing.GroupLayout(CityNamejPanel);
        CityNamejPanel.setLayout(CityNamejPanelLayout);
        CityNamejPanelLayout.setHorizontalGroup(
            CityNamejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CityNamejPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cityNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342))
        );
        CityNamejPanelLayout.setVerticalGroup(
            CityNamejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CityNamejPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cityNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        CityInformationJPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102))));

        CityInformationsjLabel.setFont(new java.awt.Font("BoomBox 2", 1, 18)); // NOI18N
        CityInformationsjLabel.setForeground(new java.awt.Color(0, 102, 102));
        CityInformationsjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CityInformationsjLabel.setText("Informations sur ma ville");

        nbrequartiersjLabel.setForeground(new java.awt.Color(0, 102, 51));
        nbrequartiersjLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nbrequartiersjLabel.setText("Nombre de quartiers");
        nbrequartiersjLabel.setMaximumSize(new java.awt.Dimension(150, 16));
        nbrequartiersjLabel.setMinimumSize(new java.awt.Dimension(150, 16));
        nbrequartiersjLabel.setPreferredSize(new java.awt.Dimension(150, 16));

        nbreHabitjLabel.setForeground(new java.awt.Color(0, 102, 51));
        nbreHabitjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nbreHabitjLabel.setText("Nombre d'habitant");
        nbreHabitjLabel.setMaximumSize(new java.awt.Dimension(130, 16));
        nbreHabitjLabel.setMinimumSize(new java.awt.Dimension(130, 16));
        nbreHabitjLabel.setPreferredSize(new java.awt.Dimension(130, 16));

        cagnottejTextField.setForeground(new java.awt.Color(0, 102, 51));
        cagnottejTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cagnottejTextField.setText("Cagnotte");
        cagnottejTextField.setMaximumSize(new java.awt.Dimension(70, 16));
        cagnottejTextField.setMinimumSize(new java.awt.Dimension(70, 16));
        cagnottejTextField.setPreferredSize(new java.awt.Dimension(70, 16));

        prosperitejTextField.setForeground(new java.awt.Color(0, 102, 51));
        prosperitejTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prosperitejTextField.setText("Prosperité");
        prosperitejTextField.setMaximumSize(new java.awt.Dimension(80, 16));
        prosperitejTextField.setMinimumSize(new java.awt.Dimension(80, 16));
        prosperitejTextField.setPreferredSize(new java.awt.Dimension(80, 16));

        prosperitejProgressBar.setBackground(new java.awt.Color(0, 102, 51));
        prosperitejProgressBar.setForeground(new java.awt.Color(0, 102, 102));
        prosperitejProgressBar.setToolTipText("");
        prosperitejProgressBar.setAutoscrolls(true);
        prosperitejProgressBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        prosperitejProgressBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        prosperitejProgressBar.setMaximumSize(new java.awt.Dimension(80, 30));
        prosperitejProgressBar.setMinimumSize(new java.awt.Dimension(80, 30));
        prosperitejProgressBar.setPreferredSize(new java.awt.Dimension(80, 30));
        prosperitejProgressBar.setStringPainted(true);
        prosperitejProgressBar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                prosperitejProgressBarPropertyChange(evt);
            }
        });

        nbreQuartiersjLabel.setForeground(new java.awt.Color(51, 102, 0));
        nbreQuartiersjLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        nbreQuartiersjLabel.setMaximumSize(new java.awt.Dimension(80, 30));
        nbreQuartiersjLabel.setMinimumSize(new java.awt.Dimension(80, 30));
        nbreQuartiersjLabel.setPreferredSize(new java.awt.Dimension(80, 30));
        nbreQuartiersjLabel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                nbreQuartiersjLabelPropertyChange(evt);
            }
        });

        cagnottejLabel.setForeground(new java.awt.Color(0, 102, 51));
        cagnottejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cagnottejLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        cagnottejLabel.setMaximumSize(new java.awt.Dimension(80, 30));
        cagnottejLabel.setMinimumSize(new java.awt.Dimension(80, 30));
        cagnottejLabel.setPreferredSize(new java.awt.Dimension(80, 30));
        cagnottejLabel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cagnottejLabelPropertyChange(evt);
            }
        });

        nbreHabitantjLabel.setForeground(new java.awt.Color(0, 102, 102));
        nbreHabitantjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nbreHabitantjLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 0), 2, true));
        nbreHabitantjLabel.setMaximumSize(new java.awt.Dimension(80, 30));
        nbreHabitantjLabel.setMinimumSize(new java.awt.Dimension(80, 30));
        nbreHabitantjLabel.setPreferredSize(new java.awt.Dimension(80, 30));
        nbreHabitantjLabel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                nbreHabitantjLabelPropertyChange(evt);
            }
        });

        datejLabel.setForeground(new java.awt.Color(0, 102, 51));
        datejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datejLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 2, true));
        datejLabel.setMaximumSize(new java.awt.Dimension(80, 30));
        datejLabel.setMinimumSize(new java.awt.Dimension(80, 30));
        datejLabel.setPreferredSize(new java.awt.Dimension(80, 30));
        datejLabel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datejLabelPropertyChange(evt);
            }
        });

        dateTextField.setForeground(new java.awt.Color(0, 102, 51));
        dateTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateTextField.setText("Heure");
        dateTextField.setMaximumSize(new java.awt.Dimension(40, 16));
        dateTextField.setMinimumSize(new java.awt.Dimension(40, 16));
        dateTextField.setPreferredSize(new java.awt.Dimension(40, 16));

        ShowLineButton.setText("Afficher une ligne de métro");
        ShowLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowLineButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CityInformationJPanel1Layout = new javax.swing.GroupLayout(CityInformationJPanel1);
        CityInformationJPanel1.setLayout(CityInformationJPanel1Layout);
        CityInformationJPanel1Layout.setHorizontalGroup(
            CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CityInformationJPanel1Layout.createSequentialGroup()
                .addGroup(CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(nbreHabitjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nbreHabitantjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nbrequartiersjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CityInformationsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                        .addComponent(nbreQuartiersjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cagnottejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cagnottejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(prosperitejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prosperitejProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CityInformationJPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ShowLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        CityInformationJPanel1Layout.setVerticalGroup(
            CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                        .addComponent(ShowLineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                        .addGroup(CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CityInformationsjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dateTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(datejLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                                .addComponent(nbrequartiersjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(CityInformationJPanel1Layout.createSequentialGroup()
                                .addGroup(CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nbreHabitjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nbreQuartiersjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nbreHabitantjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(CityInformationJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cagnottejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cagnottejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(prosperitejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(prosperitejProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CityInformationJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CityNamejPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cityView, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ControlCityjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ControlCityjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CityNamejPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cityView, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CityInformationJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(1739, 1739, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddStationjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStationjButtonActionPerformed
        JDialog dialog = DialogUtils.createDialog();

        AddStationPanel panel = new AddStationPanel(new OnCityControlActionListener() {
            @Override
            public void onBuyDistrict(int i, int j, String type) {

            }

            @Override
            public void onAddStation(int i, int j) {
                cityController.addStation(i, j);
                cityView.invalidate();
                cityView.repaint();
                DialogUtils.closeDialog(dialog);
            }

            @Override
            public void onAddLine(int departureX, int departureY, int arrivalX, int arrivalY) {
            }
        });

        DialogUtils.showDialog(dialog, panel);
    }//GEN-LAST:event_AddStationjButtonActionPerformed

    private void AddLineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLineButtonActionPerformed
        JDialog dialog = DialogUtils.createDialog();

        AddLinePanel panel = new AddLinePanel(new OnCityControlActionListener() {
            @Override
            public void onBuyDistrict(int i, int j, String type) {
            }

            @Override
            public void onAddStation(int i, int j) {
            }

            @Override
            public void onAddLine(int departureX, int departureY, int arrivalX, int arrivalY) {
                System.out.println("Ajout ligne: (" + departureX + "," + departureY + ") --> (" + arrivalX + "," + arrivalY + ")");
                cityController.addLine(departureX, departureY, arrivalX, arrivalY);
                cityView.repaint();
                DialogUtils.closeDialog(dialog);
            }
        });

        DialogUtils.showDialog(dialog, panel);
    }//GEN-LAST:event_AddLineButtonActionPerformed

    private void DevelopmentjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevelopmentjButtonActionPerformed
        JDialog dialog = DialogUtils.createDialog();

        DevelopmentControlPanel panel = new DevelopmentControlPanel();

        DialogUtils.showDialog(dialog, panel);
    }//GEN-LAST:event_DevelopmentjButtonActionPerformed

    private void LogOutjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutjButtonActionPerformed

    private void nbreQuartiersjLabelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_nbreQuartiersjLabelPropertyChange
        nbreQuartiersjLabel.setText(String.valueOf(city.getNbMaxQuartier()));
    }//GEN-LAST:event_nbreQuartiersjLabelPropertyChange

    private void prosperitejProgressBarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_prosperitejProgressBarPropertyChange
        prosperitejProgressBar.setValue(city.getProsperity());
    }//GEN-LAST:event_prosperitejProgressBarPropertyChange

    private void cagnottejLabelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cagnottejLabelPropertyChange
        cagnottejLabel.setText(String.valueOf(city.getMoney()));
    }//GEN-LAST:event_cagnottejLabelPropertyChange

    private void nbreHabitantjLabelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_nbreHabitantjLabelPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_nbreHabitantjLabelPropertyChange

    private void datejLabelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datejLabelPropertyChange
        //datejLabel.setText(String.valueOf(city.setClock("clock clock")));
    }//GEN-LAST:event_datejLabelPropertyChange

    private void ShowLineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowLineButtonActionPerformed
        JDialog dialog = DialogUtils.createDialog();

        ShowLinePanel panel = new ShowLinePanel();

        DialogUtils.showDialog(dialog, panel);
    }//GEN-LAST:event_ShowLineButtonActionPerformed

    private void BuyAreajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyAreajButtonActionPerformed

        JDialog dialog = DialogUtils.createDialog();

        AddDistrictPanel panel = new AddDistrictPanel(new OnCityControlActionListener() {
            @Override
            public void onBuyDistrict(int i, int j, String type) {
                cityController.addDistrict(i, j, type);
                cityView.refresh();

                cityView.repaint();
                DialogUtils.closeDialog(dialog);
            }

            @Override
            public void onAddStation(int i, int j) {
            }

            @Override
            public void onAddLine(int departureX, int departureY, int arrivalX, int arrivalY) {
            }
        });

        DialogUtils.showDialog(dialog, panel);

    }//GEN-LAST:event_BuyAreajButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CityMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CityMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CityMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CityMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CityMainFrame("mon titre").setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddLineButton;
    private javax.swing.JButton AddStationjButton;
    private javax.swing.JLabel BM5LifeCityjLabel;
    private javax.swing.JButton BuyAreajButton;
    private javax.swing.JPanel CityInformationJPanel1;
    private javax.swing.JLabel CityInformationsjLabel;
    private javax.swing.JPanel CityNamejPanel;
    private javax.swing.JPanel ControlCityjPanel;
    private javax.swing.JLabel ControlMyCityjLabel;
    private javax.swing.JButton DevelopmentjButton;
    private java.awt.Canvas Evolutioncanvas;
    private javax.swing.JLabel EvolutionjLabel;
    private javax.swing.JPanel EvolutionjPanel;
    private javax.swing.JButton LogOutjButton;
    private javax.swing.JButton ShowLineButton;
    private javax.swing.JPanel UserJPanel;
    private javax.swing.JLabel UserNamejLabel;
    private javax.swing.JLabel cagnottejLabel;
    private javax.swing.JTextField cagnottejTextField;
    private javax.swing.JLabel cityNameLabel;
    private gui.CityView cityView;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel datejLabel;
    private javax.swing.JLabel nbreHabitantjLabel;
    private javax.swing.JLabel nbreHabitjLabel;
    private javax.swing.JLabel nbreQuartiersjLabel;
    private javax.swing.JTextField nbrequartiersjLabel;
    private javax.swing.JProgressBar prosperitejProgressBar;
    private javax.swing.JTextField prosperitejTextField;
    // End of variables declaration//GEN-END:variables
}
