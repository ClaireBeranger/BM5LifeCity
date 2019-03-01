
package city.controller;

import city.AdministrativeArea;
import city.City;
import city.DistrictType;
import city.Districts;
import city.EmptyArea;
import city.ResidentialArea;
import city.ShoppingArea;

/**
 *
 * @author Amira
 */
public class CityController {

    private City city;

    public CityController(City mCity) {
        city = mCity;
    }

    public void addDistrict(int i, int j, String type) {
        if (DistrictType.ADMINISTRATIVE.getDesc().equals(type)) {
            city.addDistrict(new AdministrativeArea("Q(" + (i+1) + "," + (j+1) + ")", i, j));
        } else if (DistrictType.COMMERCIAL.getDesc().equals(type)) {
            city.addDistrict(new ShoppingArea("Q(" + (i+1) + "," + (j+1) + ")", i, j));
        } else if (DistrictType.RESIDENTIAL.getDesc().equals(type)) {
            city.addDistrict(new ResidentialArea("Q(" + (i+1) + "," + (j+1) + ")", i, j));
        }
    }
    
    public void addStation(int i, int j) {
       Districts district = city.getDistrict(i, j);
       
       if (district == null || district instanceof EmptyArea) {
           return;
       }
       
       district.setStation(true);
    }

    public void addLine(int departureX, int departureY, int arrivalX, int arrivalY) {
        city.addLine(departureX, departureY, arrivalX, arrivalY);
    }

}
