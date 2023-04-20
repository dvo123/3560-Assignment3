import java.util.*;

public class Congressman {
    private String name;
    private String website;
    private PoliticalParty party;
    private List<Bill> bills;
    private VoteResult vote;
    
    public Congressman(String name, String website, PoliticalParty party) {
        this.name = name;
        this.website = website;
        this.party = party;
        this.bills = new ArrayList<>();
    }
    
    public void addBill(Bill bill) {
        this.bills.add(bill);
    }
    
}