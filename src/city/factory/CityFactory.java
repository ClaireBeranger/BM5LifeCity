
package city.factory;

import city.AdministrativeArea;
import city.City;
import city.Districts;
import city.EmptyArea;
import city.ResidentialArea;
import city.ShoppingArea;

/**
 *
 * @author amira - Claire
 */
public class CityFactory {

    private CityFactory() {

    }

    public static City getRandomCity(String title) {
        City city = new City(title);

        return city;
    }

    public static City getCergy(String title) {
        City city = new City(title);

        for (int i = 0; i < city.getDimX(); i++) {
            for (int j = 0; j < city.getDimY(); j++) {
                if (i == 0 && j == 0) {
                    city.addDistrict(new ResidentialArea("Q(" + (i+1) + "," + (j+1) + ")", i, j));
                } else if (i == 0 && j == 1) {
                    Districts district = new ShoppingArea("Q(" + (i+1) + "," + (j+1) + ")", i, j);
                    district.setStation(true);
                    city.addDistrict(district);
                } else if (i == 0 && j == 2) {
                    city.addDistrict(new AdministrativeArea("Q(" + (i+1) + "," + (j+1) + ")", i, j));
                } else {
                    city.addDistrict(new EmptyArea("Q(" + (i+1) + "," + (j+1) + ")", i, j));
                }
            }
        }

        return city;
    }

}
