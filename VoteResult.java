
public class VoteResult {
    private Congressman congressman;
    private Bill bill;
    private String voteDate;
    private int voteResult;
    
    public VoteResult(Congressman congressman, Bill bill, String voteDate, int voteResult) {
        this.congressman = congressman;
        this.bill = bill;
        this.voteDate = voteDate;
        this.voteResult = voteResult;
    }
    
}