
package city;

/*Case dans chaque districts qui va delimiter chaque batiments/terrains */

public class Case {

	public enum Type {NOTHING, HOME, STATION, RES_BUILDING, ADMIN_BUILDING, COM_BUILDING, STORE};
	
	private Type type;
	private int x;
	private int y;
	
	
	public Case(Type type,int x, int y ) {
		this.type = type;
		this.x=x;
		this.y=y;
		
	}
	public Type getType() {
		return type;
	}
	
	public String toStringtype() {
		return type.toString();
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "--[xCase=" + x + ", yCase=" + y + ", typeCase=" + type +"]";
	}
	
	
	
}