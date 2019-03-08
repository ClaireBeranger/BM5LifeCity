package city;

import java.util.ArrayList;

import clock.Clock;
import java.util.List;

public class City {

    private String name;
    private int prosperity;
    private int money;
    private int dimX = 12;
    private int dimY = 12;
    public Districts[][] map = new Districts[dimX][dimY];

    private Clock clock;
    private int nbMaxQuartier;
    
    private List<Line> lines;

//Constructor of Class -----------------------------------------------------------------------
    public City(String name) {
        super();
        this.name = name;
        this.prosperity = 50;
        this.money = 10000;
        initMap();
        this.nbMaxQuartier = dimX * dimY;
        lines = new ArrayList<Line>();
        
        this.clock = new Clock();
		/*boolean bool = true;
		while (bool!=false){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			clock.increment();
			//System.out.println(clock.toStringHour());
		}*/
	
    }
//Functions of class--------------------------------------------------------------------------

    public void initMap() { //initialisation de la map en une matrice de 9 districts

        for (int i = 0; i < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                if (i == 0 && j == 0) {
                    this.map[i][j] = new ResidentialArea("res" + i + j, i, j);
                } else if (i == 0 && j == 1) {
                    this.map[i][j] = new ShoppingArea("shop" + i + j, i, j);
                } else if (i == 0 && j == 2) {
                    this.map[i][j] = new AdministrativeArea("admin" + i + j, i, j);
                } else {
                    this.map[i][j] = null;
                }
            }
        }		//wouhouu
    }

    public void variationArgent(int x) {
        this.money = this.money + x;

    }

    //Verification de l'accessibilit� d'un quartier
    public boolean AccesibleDistricts(Districts d) {
        try {
            d.setAccessibility(false);

            if ((map[d.getCoordX()][d.getCoordY()]).isStation()) //Verification LOCAL
            {
                d.setAccessibility(true);
            }

            if ((map[d.getCoordX() + 1][d.getCoordY()]).isStation()) //Verification TOP
            {
                d.setAccessibility(true);
            }

            if ((map[d.getCoordX() - 1][d.getCoordY()]).isStation()) //Verifiation BOTTOM
            {
                d.setAccessibility(true);
            }

            if ((map[d.getCoordX()][d.getCoordY() + 1]).isStation()) //Verifiation RIGHT
            {
                d.setAccessibility(true);
            }

            if ((map[d.getCoordX()][d.getCoordY() - 1]).isStation()) //Verifiation LEFT 
            {
                d.setAccessibility(true);
            }

        } catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());

        }

        return d.isAccessibility();

    }

    private boolean travelCitizenToWork(ArrayList<Citizen> citizen) {

        for (Citizen c : citizen) {

            if (this.AccesibleDistricts(c.getWorkplace())) {

                c.TravelToWork();
                //touche pas juste pull le moi et je continuerai inshaAllah. oumss.
            } else {

            }

        }
        return false;
    }

//Getters and setters of attributes -----------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProsperity() {
        return prosperity;
    }

    public void setProsperity(int prosperity) {
        this.prosperity = prosperity;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Districts[][] getMap() {
        return map;
    }

    public void setMap(Districts[][] map) {
        this.map = map;
    }

    public Clock getClock() {
        return clock;
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public int getNbMaxQuartier() {
        return nbMaxQuartier;
    }

    public void setNbMaxQuartier(int nbMaxQuartier) {
        this.nbMaxQuartier = nbMaxQuartier;
    }

    public String toStringDistricts(Districts[][] map) {
        String str = "";
        for (int i = 0; i < dimX; i++) {
            for (int j = 0; j < dimY; j++) {
                if (map[i][j] != null) {
                    str = str + "\n" + map[i][j].toString() + "\n";
                }
            }
        }
        return str;
    }

    @Override
    public String toString() {
        return "BEGIN City [\n City_name = " + name + ",\n City_prosperity=" + prosperity + ", City_money=" + money + ", dimX=" + dimX + ", dimY=" + dimY
                + ",\n nbMaxQuartier=" + nbMaxQuartier + ", clock=" + clock
                + ",\n CityDistricts=\n \t" + toStringDistricts(getMap()) + "\nEND City]";
    }

    public int getDimX() {
        return dimX;
    }

    public int getDimY() {
        return dimY;
    }

    public void addDistrict(Districts district) {
        int i = district.getCoordX();
        int j = district.getCoordY();
        if (i < 0 || i > dimX || j < 0 || j > dimY) {
            return;
        }

        map[i][j] = district;
    }

    public Districts getDistrict(int i, int j) {
        if (i < 0 || i > dimX || j < 0 || j > dimY) {
            return null;
        }
        
        return map[i][j];
    }
    
    
    public void addLine(int startX, int startY, int endX, int endY) {
        if (startX < 0 || startX > dimX || startY < 0 || startY > dimY) {
            return;
        }
        
        if (endX < 0 || endX > dimX || endY < 0 || endY > dimY) {
            return ;
        }
        
        Districts departureDistrict = map[startX][startY];
        Districts arrivalDistrict = map[endX][endY];
        
        if (departureDistrict instanceof EmptyArea || arrivalDistrict instanceof EmptyArea) {
            return;
        }
        
        lines.add(new Line(departureDistrict, arrivalDistrict));
    }
    
    public List<Line> getLines() {
        return lines;
    }
}
