package Factory.product;

public class Apple implements Fruit {

	private String color;
	private String kind;
	private String origin;
	/* (non-Javadoc)
	 * @see Factory.Fruit#getColor()
	 */
	@Override
	public String getColor() {
		return color;
	}
	/* (non-Javadoc)
	 * @see Factory.Fruit#setColor(java.lang.String)
	 */
	@Override
	public void setColor(String color) {
		this.color = color;
	}
	/* (non-Javadoc)
	 * @see Factory.Fruit#getKind()
	 */
	@Override
	public String getKind() {
		return kind;
	}
	/* (non-Javadoc)
	 * @see Factory.Fruit#setKind(java.lang.String)
	 */
	@Override
	public void setKind(String kind) {
		this.kind = kind;
	}
	/* (non-Javadoc)
	 * @see Factory.Fruit#getOrigin()
	 */
	@Override
	public String getOrigin() {
		return origin;
	}
	/* (non-Javadoc)
	 * @see Factory.Fruit#setOrigin(java.lang.String)
	 */
	@Override
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String toString(){
		return new String("Kind:"+kind+"  Origin:"+origin+"  Color:"+color);
	}
	
}
