
public class CreatingHash {
    public static final String PrintblockHash = null;
    private String Transaction;
    private String Transaction_TimeStamp;
    private String blockhash;
    private String previousHash;


    public CreatingHash(String Transaction,String Transaction_TimeStamp ){ // constractor 
        this.Transaction= Transaction;
        this.Transaction_TimeStamp= Transaction_TimeStamp;
    }

    public void blockhashCode(){
        this.blockhash =this. Transaction + this.Transaction_TimeStamp;
        this.previousHash=this.blockhash;
        System.out.println(previousHash.hashCode());
    }



}