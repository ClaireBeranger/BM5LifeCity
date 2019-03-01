
package city;

/**
 *
 * @author amira
 */
public enum DistrictType {
    COMMERCIAL("Quartier Commercial"), RESIDENTIAL("Quartier Résidentiel"), ADMINISTRATIVE("Quartier Administratif");

    private String desc;

    DistrictType(String pDesc) {
        desc = pDesc;
    }
    
    public String getDesc() {
        return desc;
    }
}
