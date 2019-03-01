
package gui;

import city.AdministrativeArea;
import city.Districts;
import city.EmptyArea;
import city.ResidentialArea;
import city.ShoppingArea;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author Amira
 */
public class DistrictView extends JComponent {

    private Districts district;

    private int districtWidth;

    private int districtHeight;

    private int verticalSpace;

    private int horizontalSpace;

    private Color color;

    public DistrictView() {
        color = new Color(0, 160, 0);

        initListener();
    }

    public DistrictView(Districts pDistrict) {
        color = new Color(0, 160, 0);
        district = pDistrict;
        initListener();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
        if (district != null) {

            if (district instanceof ResidentialArea) {
                g2.setColor(Color.blue);
            } else if (district instanceof ShoppingArea) {
                g2.setColor(Color.red);
            } else if (district instanceof AdministrativeArea) {
                g2.setColor(Color.ORANGE);
            }

            if (district instanceof EmptyArea) {
                g2.setColor(Color.gray);
                g2.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
            } else {

                g2.fillRect(0, 0, getWidth() - 1, getHeight() - 1);
                g2.setColor(Color.white);
                g2.drawString(district.getNameDsitrict(), 5 + getWidth() / 4, 5 + getHeight() / 2);

                if (district.isStation()) {
                    g2.setColor(Color.white);
                    g2.fillOval(5, 5, 10, 10);
                }
            }

        }
    }

    public int getDistrictWidth() {
        return districtWidth;
    }

    public void setDistrictWidth(int width) {
        this.districtWidth = width;
    }

    public int getDistrictHeight() {
        return districtHeight;
    }

    public void setDistrictHeight(int height) {
        this.districtHeight = height;
    }

    public int getVerticalSpace() {
        return verticalSpace;
    }

    public void setVerticalSpace(int verticalSpace) {
        this.verticalSpace = verticalSpace;
    }

    public int getHorizontalSpace() {
        return horizontalSpace;
    }

    public void setHorizontalSpace(int horizontalSpace) {
        this.horizontalSpace = horizontalSpace;
    }

    private void initListener() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if (district instanceof EmptyArea) {
                    return;
                }
                AreaJFrame areaFrame = new AreaJFrame(district.getNameDsitrict());
                areaFrame.setVisible(true);
            }
        });
    }
}
