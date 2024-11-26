/**
 * this class and the different functions within it hold the information for what different values the cards can have.
 * if you wanted to add jokers this would have to be reworked as jokers are their own suit with no face value.
 */
public class Card implements Comparable {
    private String MSuit;
    private String MFace;
    private String [] suit={"hearts","diamonds","clubs","spades"};
    private String [] face={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    public Card(int f , int s)
    {
        MFace=face[f];
        MSuit=suit[s];
    }
    public String getSuit()
    {
        return MSuit;
    }
    public String getFace()
    {
        return MFace;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
