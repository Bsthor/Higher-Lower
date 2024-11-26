/**
 * this class generates a deck for the main class to use
 */
public class Deck {
    private int SuitsNum=4,FacesNum=13;
    private Card[][] Mdeck=new Card[SuitsNum][FacesNum];
    private int NextSuit=0,NextFace=0;
    public void printDeck(Card [] [] d)
    {
        int i,j;
        String face , suit;
        for ( i = 0; i < 4; i++)
            for (j = 0; j < 13; j++) {
                face=d[i][j].getFace();
                suit=d[i][j].getSuit();
                System.out.println(face + " of " + suit);

            }
    }
    public Deck()
    {
        for(int s=0;s<SuitsNum; s++)
            for(int f=0;f<FacesNum;f++)
                Mdeck[s][f]=new Card(f,s);
        //System.out.println("Ordered deck");
        //printDeck(Mdeck); // this shows the ordered deck of removed from comments
        System.out.println();
    }
    public void shuffle()
    {
        int f2,s2;
        Card temp;
        for (int s=0;s<SuitsNum;s++)
            for (int f=0;f<FacesNum;f++)
            {
                s2=(int) (Math.random()*SuitsNum);
                f2=(int) (Math.random()*FacesNum);
                temp=Mdeck[s][f];
                Mdeck[s][f]=Mdeck[s2][f2];
                Mdeck[s2][f2]=temp;
            }
        //System.out.println("The Shuffled deck");
        /**
         *  when un-commented the line above and the line below show the shuffled deck that
         *  the specific game is using ( if the user restart from within a new shuffled deck is generated
         */
        //printDeck(Mdeck);
    }
    public Card deal()
    {
        Card cl=Mdeck[NextSuit][NextFace];
        NextFace++;
        if (NextFace==FacesNum)
        {
            NextSuit++;
            NextFace=0;
        }
        return cl;
    }
}
