
package city;


public class Case {
	
	private Type type;
	
	public enum Type {NOTHING, HOME, STATION, RES_BUILDING, ADMIN_BUILDING, COM_BUILDING, STORE};
	
	public Case(Type type ) {
		this.type = type;
		
	}
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
}