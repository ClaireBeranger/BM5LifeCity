
package city;

/**
 *
 * @author amira
 */
public class Line {

    private Districts departureDistrict;

    private Districts arrivalDistrict;

    public Line() {

    }

    public Line(Districts pDepartureDistrict, Districts pArrivalDistrict) {
        departureDistrict = pDepartureDistrict;
        arrivalDistrict = pArrivalDistrict;
    }

    public Districts getDepartureDistrict() {
        return departureDistrict;
    }

    public void setDepartureDistrict(Districts departureDistrict) {
        this.departureDistrict = departureDistrict;
    }

    public Districts getArrivalDistrict() {
        return arrivalDistrict;
    }

    public void setArrivalDistrict(Districts arrivalDistrict) {
        this.arrivalDistrict = arrivalDistrict;
    }

}
