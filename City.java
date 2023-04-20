import java.util.*;

public class City {
    private String name;
    private State state;
    private List<Election> elections;
    
    public City(String name, State state) {
        this.name = name;
        this.state = state;
        this.elections = new ArrayList<>();
    }
    
    public void addElection(Election election) {
        this.elections.add(election);
    }
    
}
