package Factory.product;

public class Pear implements Fruit {

	private String color;
	private String kind;
	private String origin;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String toString(){
		return new String("Kind:"+kind+"   Origin:"+origin+"   Color:"+color);
	}
	
}
