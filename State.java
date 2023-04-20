import java.util.*;

public class State {
	private String name;
	private Region region;
	private List<City> cities;
  
    public State(String name, Region region) {
        this.name = name;
        this.region = region;
        this.cities = new ArrayList<>();
    }
    
    public void addCity(City city) {
        this.cities.add(city);
    }
    
}
