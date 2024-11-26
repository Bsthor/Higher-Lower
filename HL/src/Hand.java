import java.util.*;

/**
 * the hand class sets how much of the deck the game actually uses ive set it to 52 ( shown in main)( the loop uses 51 as to not
 * extend out of the deck) so the whole deck is used. Shrinking this would make the game easier as you wouldn't need as many correct
 * guesses to win
 */
public class Hand {
    private int Msize;
    private ArrayList cardlist=new ArrayList();
    public Hand(int size)
    {
        Msize=size;
    }
    public int getsize()
    {
        return Msize;
    }
    public void addCard(Card c)
    {
        if (cardlist.size()<Msize)
            cardlist.add(c);
    }
    public Card getCard(int i)
    {
        return (Card)cardlist.get(i);
    }
    private int FindlowI(int startI)
    {
        int low=startI;
        Card LCard=getCard(low);
        for (int i = startI+1; i < getsize(); i++)
            if (getCard(i).compareTo(LCard)<0)
            {
                low=i;
                LCard=getCard(i);
            }
        return low;
    }
}

