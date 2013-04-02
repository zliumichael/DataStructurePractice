package Observer;

public class WebSiteListener implements Listener {

	@Override
	public void update(String temperature) {
		System.out.println("Current temperature: "+ temperature+", From WebSiteRegister");

	}

}
