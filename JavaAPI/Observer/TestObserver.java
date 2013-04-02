package Observer;


public class TestObserver {
	public static void main(String[] args) {
		WeatherData weather = new WeatherData();
		Listener lis1 = new WebSiteListener();
		weather.addListener(lis1);
		Listener lis2 = new MobilePhoneListener();
		weather.addListener(lis2);
		
		weather.setTemperature("32¡æ");
		weather.notifAlly();
	}

}
