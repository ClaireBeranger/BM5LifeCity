package city;

public class ResidentialArea implements Districts {
//Attributes ---------------------------------------------------------------------------------

    private String nameDsitrict;
    private String typeDistrict = "RESIDENTIAL";
    private int numbResidentsCurrent = 0;
    private int numbResidentsMax = 50;
    private int dimX = 5, dimY = 5;
    private Case[][] map = new Case[dimX][dimY];
    private int coordX, coordY;
    private boolean station;
    private int price = 500;
    private int level = 1;
    private boolean accessibility;

//Constructor of Class -----------------------------------------------------------------------
<<<<<<< HEAD
	
	public ResidentialArea(String nameDsitrict,int coordX, int coordY) {
		this.nameDsitrict = nameDsitrict;
		this.station=false ;
		this.coordX = coordX ;
		this.coordY = coordY ;
		initDistrict();

	}
	
=======
    public ResidentialArea(String nameDsitrict, int coordX, int coordY) {
        this.nameDsitrict = nameDsitrict;
        this.station = false;
        this.coordX = coordX;
        this.coordY = coordY;
        initDistrict();
    }
>>>>>>> branch 'master' of https://github.com/ClaireBeranger/BM5LifeCity
//Function of class ----------------------------------------------------------------------------

    //on initialise un quartier residentiel avec 3 home et le reste vide.
    public void initDistrict() {

        for (int i = 0; i < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                if (i == 0 && j < 3) { //Trois premi�res cases avec une maison
                    Case c = new Case(Case.Type.HOME, i, j);
                    map[i][j] = c;
                } else { //Les autres cases avec null
                    Case c = new Case(Case.Type.NOTHING, i, j);
                    map[i][j] = c; 	//-----
                }
            }
        }
    }
//Getters and setters of attributes -----------------------------------------------------------------

    public int getNumbResidentsCurrent() {
        return numbResidentsCurrent;
    }

    public void setNumbResidentsCurrent(int numbResidentsCurrent) {
        this.numbResidentsCurrent = numbResidentsCurrent;
    }

    public int getNumbResidentsMax() {
        return numbResidentsMax;
    }

    public void setNumbResidentsMax(int numbResidentsMax) {
        this.numbResidentsMax = numbResidentsMax;
    }

    public String getNameDsitrict() {
        return nameDsitrict;
    }

    public void setNameDsitrict(String nameDsitrict) {
        this.nameDsitrict = nameDsitrict;
    }

    public String getTypeDistrict() {
        return typeDistrict;
    }

    public void setTypeDistrict(String typeDistrict) {
        this.typeDistrict = typeDistrict;
    }

    public Case[][] getMap() {
        return map;
    }

    public void setMap(Case[][] map) {
        this.map = map;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public boolean isStation() {
        return station;
    }

    public void setStation(boolean station) {
        this.station = station;
    }

    public boolean isAccessibility() {
        return accessibility;
    }

    public void setAccessibility(boolean accessibility) {
        this.accessibility = accessibility;
    }

//---------------------------------------------------------------
    public String toStringCases(Case[][] map) {
        String str = "";
        for (int i = 0; i < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                if (map[i][j] != null) {
                    str = str + map[i][j].toString();
                }
            }
        }
        return str;
    }

    @Override
    public String toString() {
        String tmp = "BEGIN ResidentialArea [\n nameDsitrict=" + nameDsitrict + ", typeDistrict=" + typeDistrict
                + ", numbResidentsCurrent=" + numbResidentsCurrent + ", numbResidentsMax=" + numbResidentsMax
                + ", dimX=" + dimX + ", dimY=" + dimY + ", price=" + price
                + ",\n map=" + toStringCases(map) + "\nEND ResidentialArea ]";

        return tmp;
    }

}
