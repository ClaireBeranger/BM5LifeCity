
package gui;

import city.City;
import city.Districts;
import city.Line;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import javax.swing.JComponent;

/**
 *
 * @author Amira
 */
public class CityView extends JComponent {

    private City city;

    private DistrictView[][] districtViews;

    public CityView() {
    }

    public CityView(City mCity) {
        city = mCity;
        initDistrictViews();
        init();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int stroke = 2;

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(stroke));
        g2.setColor(new Color(0, 102, 102));
        g2.drawRect(stroke, stroke, getWidth() - 2*stroke, getHeight() - 2*stroke);

        for (Line line : city.getLines()) {
            Districts departure = line.getDepartureDistrict();
            Districts arrival = line.getArrivalDistrict();
            
            DistrictView departureView = districtViews[departure.getCoordX()][departure.getCoordY()];
            DistrictView arrivalView = districtViews[arrival.getCoordX()][arrival.getCoordY()];
            
            g2.drawLine(departureView.getX() + departureView.getWidth() / 2, departureView.getY() + departureView.getHeight() / 2, 
                    arrivalView.getX() + arrivalView.getWidth() / 2, arrivalView.getY() + arrivalView.getHeight() / 2);
        }
    }

    public void setCity(City pCity) {
        city = pCity;
        initDistrictViews();
        init();
    }

    private void initDistrictViews() {
        districtViews = new DistrictView[city.getDimX()][city.getDimY()];
    }

    private void init() {

        removeAll();

        GridLayout layout = new GridLayout(city.getDimX(), city.getDimY(), 5, 5);
        setLayout(layout);

        Districts[][] districts = city.getMap();

        for (int j = 0; j < city.getDimY(); j++) {
            for (int i = 0; i < city.getDimX(); i++) {
                districtViews[i][j] = new DistrictView(districts[i][j]);
                add(districtViews[i][j]);
            }
        }

        validate();
    }

    public void refresh() {
        init();
    }

}
