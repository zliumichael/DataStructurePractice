package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {
	
	private String temperature;

	public static List<Listener> list= new ArrayList<Listener>();
	
	public void addListener(Listener lis){
		list.add(lis);
	}
	
	public void removeListener(Listener lis){
		list.remove(lis);
	}
	
	public void notifAlly(){
		for(Listener lis:list){
			lis.update(temperature);
		}
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	
}
