package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class FirstPage extends javax.swing.JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -17015784214934257L;
    private JFrame frame;
    private JTextField textField;

    private void initComponents(String title) {
        JButton btnNewButton = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNewButton.setText("Ok");
        btnNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    FirstPage window = new FirstPage();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public FirstPage() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setBackground(Color.WHITE);
        frame.getContentPane().setBackground(new Color(127, 255, 0));
        frame.setForeground(Color.WHITE);
        frame.setBounds(100, 100, 478, 384);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Ok");
        btnNewButton.setFont(new Font("Wide Latin", Font.ITALIC, 10));
        btnNewButton.setBounds(169, 294, 115, 28);
        frame.getContentPane().add(btnNewButton);

    }

    private void btnNewButtonActionPerformed(java.awt.event.ActionEvent evt) {
        CityMainFrame cityFrame = new CityMainFrame();
        cityFrame.setVisible(true);
        cityFrame.setLocationRelativeTo(null);
        cityFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cityFrame.pack();
        this.dispose();

        textField = new JTextField();
        textField.setBounds(169, 266, 115, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblBmLifeCity = new JLabel("BM5 LIFE CITY");
        lblBmLifeCity.setFont(new Font("Verdana", Font.BOLD, 11));
        lblBmLifeCity.setBounds(169, 0, 131, 20);
        frame.getContentPane().add(lblBmLifeCity);

        JLabel lblEntrezLeNom = new JLabel("Entrez le nom de votre ville et appuyez sur \"Ok\" pour lancer la partie");
        lblEntrezLeNom.setFont(new Font("Stencil", Font.PLAIN, 11));
        lblEntrezLeNom.setForeground(Color.BLACK);
        lblEntrezLeNom.setBounds(25, 244, 427, 20);
        frame.getContentPane().add(lblEntrezLeNom);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("src/picture/logo_BM5_Life_City2.jpg"));
        lblNewLabel.setBounds(109, 21, 230, 222);
        frame.getContentPane().add(lblNewLabel);

    }

}
