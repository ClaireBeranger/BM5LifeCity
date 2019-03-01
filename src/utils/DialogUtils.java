package utils;

import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 * @author Amira
 */
public class DialogUtils {

    private DialogUtils() {

    }

    public static JDialog createDialog() {
        JDialog dialog = new JDialog();
        dialog.setModal(true);
        dialog.setResizable(false);
        return dialog;
    }
    
    public static void showDialog(JDialog dialog, JPanel content) {
        dialog.setContentPane(content);
        dialog.pack();
        dialog.setVisible(true);
    }
    
    public static void closeDialog(JDialog dialog) {
        dialog.setVisible(false);
    }
}
