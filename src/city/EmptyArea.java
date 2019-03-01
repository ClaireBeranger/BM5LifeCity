
package city;

/**
 *
 * @author amira
 */
public class EmptyArea implements Districts {

    private int coordX;
    
    private int coordY;
    
    private String nameDsitrict;
    
    public EmptyArea() {
        
    }
    
     public EmptyArea(String nameDistrict, int coordX, int coordY) {
        this.nameDsitrict = nameDsitrict;
        this.coordX = coordX;
        this.coordY = coordY;
    }
    
    @Override
    public void initDistrict() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNameDsitrict() {
        return nameDsitrict;
    }

    @Override
    public void setNameDsitrict(String nameDsitrict) {
        this.nameDsitrict = nameDsitrict;
    }

    @Override
    public String getTypeDistrict() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTypeDistrict(String typeDistrict) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Case[][] getMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMap(Case[][] map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrice(int price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLevel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLevel(int level) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isStation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setStation(boolean station) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAccessibility() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAccessibility(boolean accessibility) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int getCoordX() {
        return coordX;
    }

    @Override
    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    @Override
    public int getCoordY() {
        return coordY;
    }

    @Override
    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }
    
}
