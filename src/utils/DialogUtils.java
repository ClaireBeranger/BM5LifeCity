package utils;



import javax.swing.JDialog;
import javax.swing.JPanel;


/**
 *
 * @author Amira
 */
public class DialogUtils {
    private DialogUtils() {

    }

    public static void showDialog(JPanel content) {
        JDialog dialog = new JDialog();
        dialog.setContentPane(content);
        dialog.setModal(true);
        dialog.setResizable(false);
        dialog.pack();

        dialog.setVisible(true);
    }
}

    

