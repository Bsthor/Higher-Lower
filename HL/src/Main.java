import java.util.Scanner;

/**
 * this game is meant to be hard which is why you have to clear the whole deck to win.
 * If I was to add more to the game I would add a way to add the jokers ( maybe they are worth 1 since the ace is worth the most), this
 * would require changing the way the cards are set up.
 * another addition that could be done is music and sounds. music in the bacground could add to the atmosphere of the game and sound
 * effects can tell the looser when they have lost.
 * a final change would be making it in javafx ( or similar ) so that the game could have a GUI with proper interactive elements and
 * visuals for the individual cards.
 * @param args
 */
public static void main(String[] args) {
    System.out.println("Welcome to My higher or lower game to win you must get all of" +
            "deck correct in one go");
    setup();

}

/**
 * This code will end the program when it's accessed from other locations
 * @param End
 */
public static  void End (String End){
    if (End.equalsIgnoreCase("Q")){
        System.exit(1);
    }
}

/**
 * Re-starts the set-up this includes making a new shuffled dech
 * @param Restart
 */
public static void Restart (String Restart){
    if (Restart.equalsIgnoreCase("R")){
        setup();
    }
}

/**
 * Fail deals with any lose conditions.
 */
public static void Fail(){
    Scanner Listen = new Scanner(System.in);
    System.out.println("You Lose Press R to restart or Q to End");
    String restart= Listen.nextLine();
    Restart( restart );
    End(restart);
}

/**
 * set-up is the main code for the program. it generates a shuffled hand and loops checking if the user is correct
 * for each card in the hand.
 * all of the if else commands within the loop handle a specific instance of a card and a guess
 */
public static void setup()
    {
        Deck deck;
        Hand h;
        int nextCard;
        int i;
        deck=new Deck();
        deck.shuffle();
        h=new Hand(52);
        for (i=0;i<h.getsize();i++)
        {
            h.addCard(deck.deal());
        }
        Scanner Listen = new Scanner(System.in);
        nextCard=1;
        for (int j = 0; j < h.getsize() - 1; j++) {
            Card currentc=h.getCard(j);
            Card nextc=h.getCard(j +1);
            System.out.println(STR."\{currentc.getFace()} of \{currentc.getSuit()}");
            System.out.println(h.getsize());
            System.out.println("Will the Next Card Be Higher(H) or Lower(L)(or the same) ");
            String ans = Listen.nextLine();
            if(ans.equalsIgnoreCase("H"))
            {
                if (currentc.getFace().equals("2"))
                {
                    if (!nextc.getFace().equals("2"))
                    {
                        System.out.println("Correct,the next card is");
                    } else
                    {
                        Fail();
                    }
                } else if (currentc.getFace().equals("3")) {
                    if (!nextc.getFace().equals("2") && !nextc.getFace().equals("3")){
                        System.out.println("Correct,the next card is");
                    } else {
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    }
                }else if (currentc.getFace().equals("4")) {
                if (!nextc.getFace().equals("2") && !nextc.getFace().equals("3") && !nextc.getFace().equals("4")){
                    System.out.println("Correct,the next card is");
                } else {
                    System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                    Fail();
                }

                } else if (currentc.getFace().equals("5")) {//current 5
                    if (!nextc.getFace().equals("2") && !nextc.getFace().equals("3") && !nextc.getFace().equals("4") && !nextc.getFace().equals("5")){
                        System.out.println("Correct,the next card is");
                    } else {
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    }

                } else if (currentc.getFace().equals("6")) {
                    if (!nextc.getFace().equals("2") && !nextc.getFace().equals("3") && !nextc.getFace().equals("4") && !nextc.getFace().equals("5")
                            && !nextc.getFace().equals("6")){
                        System.out.println("Correct,the next card is");
                    } else {
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    }

                }else if (currentc.getFace().equals("7")) {
                    if (!nextc.getFace().equals("2") && !nextc.getFace().equals("3") && !nextc.getFace().equals("4") && !nextc.getFace().equals("5")
                            && !nextc.getFace().equals("6") && !nextc.getFace().equals("7")){
                        System.out.println("Correct,the next card is");
                    } else {
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                       Fail();
                    }

                } else if (currentc.getFace().equals("8")) {
                    if (!nextc.getFace().equals("2") && !nextc.getFace().equals("3") && !nextc.getFace().equals("4") && !nextc.getFace().equals("5")
                            && !nextc.getFace().equals("6") && !nextc.getFace().equals("7") && !nextc.getFace().equals("8")){
                        System.out.println("Correct,the next card is");
                    } else {
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    }

                } else if (currentc.getFace().equals("9")) {
                    if (nextc.getFace().equals("10") ||  nextc.getFace().equals("Jack") || nextc.getFace().equals("Queen") ||
                            nextc.getFace().equals("King") || nextc.getFace().equals("Ace")){
                        System.out.println("Correct,the next card is");
                    }else{
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    }

                } else if (currentc.getFace().equals("10")) {
                    if (nextc.getFace().equals("Jack") || nextc.getFace().equals("Queen") ||
                            nextc.getFace().equals("King") || nextc.getFace().equals("Ace")){
                        System.out.println("Correct,the next card is");
                    }else{
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                       Fail();
                    }

                }else if (currentc.getFace().equals("Jack")) {
                    if (nextc.getFace().equals("Queen") || nextc.getFace().equals("King") || nextc.getFace().equals("Ace")){
                        System.out.println("Correct,the next card is");
                    }else{
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    }

                } else if (currentc.getFace().equals("Queen")) {
                    if (nextc.getFace().equals("King") || nextc.getFace().equals("Ace")){
                        System.out.println("Correct,the next card is");
                    }else{
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    }

                } else if (currentc.getFace().equals("King")) {
                    if (nextc.getFace().equals("Ace")){
                        System.out.println("Correct,the next card is");
                    }else{
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    }

                } else if (currentc.getFace().equals("Ace")) {
                    System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                    Fail();

                }
            } else if(ans.equalsIgnoreCase("L"))
            {
                if (currentc.getFace().equals("2"))//current 2
                {
                    if (!nextc.getFace().equals("2"))
                    {
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    } else
                    {
                        System.out.println("Correct,the next card is");
                    }
                } else if (currentc.getFace().equals("3")) {//current 3
                    if (!nextc.getFace().equals("2") && !nextc.getFace().equals("3")){
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    } else {
                        System.out.println("Correct,the next card is");
                    }
                }else if (currentc.getFace().equals("4")) { //current 4
                    if (!nextc.getFace().equals("2") && !nextc.getFace().equals("3") && !nextc.getFace().equals("4")){
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    } else {
                        System.out.println("Correct,the next card is");
                    }

                } else if (currentc.getFace().equals("5")) {//current 5
                    if (!nextc.getFace().equals("2") && !nextc.getFace().equals("3") && !nextc.getFace().equals("4") && !nextc.getFace().equals("5")){
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    } else {
                        System.out.println("Correct,the next card is");
                    }

                } else if (currentc.getFace().equals("6")) {
                    if (!nextc.getFace().equals("2") && !nextc.getFace().equals("3") && !nextc.getFace().equals("4") && !nextc.getFace().equals("5")
                            && !nextc.getFace().equals("6")){
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    } else {
                        System.out.println("Correct,the next card is");
                    }

                }else if (currentc.getFace().equals("7")) {
                    if (!nextc.getFace().equals("2") && !nextc.getFace().equals("3") && !nextc.getFace().equals("4") && !nextc.getFace().equals("5")
                            && !nextc.getFace().equals("6") && !nextc.getFace().equals("7")){
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    } else {
                        System.out.println("Correct,the next card is");
                    }

                } else if (currentc.getFace().equals("8")) {
                    if (!nextc.getFace().equals("2") && !nextc.getFace().equals("3") && !nextc.getFace().equals("4") && !nextc.getFace().equals("5")
                            && !nextc.getFace().equals("6") && !nextc.getFace().equals("7") && !nextc.getFace().equals("8")){
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    } else {
                        System.out.println("Correct,the next card is");
                    }

                } else if (currentc.getFace().equals("9")) {
                    if (nextc.getFace().equals("10") ||  nextc.getFace().equals("Jack") || nextc.getFace().equals("Queen") ||
                            nextc.getFace().equals("King") || nextc.getFace().equals("Ace")){
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    }else{
                        System.out.println("Correct,the next card is");
                    }

                } else if (currentc.getFace().equals("10")) {
                    if (nextc.getFace().equals("Jack") || nextc.getFace().equals("Queen") ||
                            nextc.getFace().equals("King") || nextc.getFace().equals("Ace")){
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    }else{
                        System.out.println("Correct,the next card is");
                    }

                }else if (currentc.getFace().equals("Jack")) {
                    if (nextc.getFace().equals("Queen") || nextc.getFace().equals("King") || nextc.getFace().equals("Ace")){
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    }else{
                        System.out.println("Correct,the next card is");
                    }

                } else if (currentc.getFace().equals("Queen")) {
                    if (nextc.getFace().equals("King") || nextc.getFace().equals("Ace")){
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    }else{
                        System.out.println("Correct,the next card is");
                    }

                } else if (currentc.getFace().equals("King")) {
                    if (nextc.getFace().equals("Ace")){
                        System.out.println("The Next Card was a "+ nextc.getFace() + " of " + nextc.getSuit());
                        Fail();
                    }else{
                        System.out.println("Correct,the next card is");
                    }

                } else if (currentc.getFace().equals("Ace")) {
                    System.out.println("Correct,the next card is");

                }
            }

        }
        System.out.println("You Win. Press R to restart or Q to Quit");
        String restart= Listen.nextLine();
        Restart(restart);
        End(restart);



    }


