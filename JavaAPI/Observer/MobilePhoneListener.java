package Observer;

public class MobilePhoneListener implements Listener {

	@Override
	public void update(String temperature) {
		System.out.println("Current temperature: "+ temperature+", From MobilePhoneRegister");

	}

}
