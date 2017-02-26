package edu.alex.java;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int dealerScore = 0;
        int playerScore = 0;
        boolean isExit = false;
        do
        {
            System.out.println("Press '1' - for new game");
            System.out.println("Press '2' - to exit");

            int option = IO.getInt("Enter your option: ", 1, 2 );
            switch(option)
            {
                case 1:
                    Game game = new Game();
                    if((game.getIsGameOver() == true) && (game.checkBlackJack() == true))
                    {
                        playerScore += 1.5;
                        System.out.println("The winner is Player by Black Jack!!!");
                    }
                    else
                    {
                        if((game.getIsGameOver() == true) && (game.checkBlackJack() == false))
                        {
                            System.out.println("The result is Tie: Player with 21 pouints.  Dealer with 21 pouints");
                        }
                        else
                        {
                            game.play();
                            if(game.getWhoWon().equals("Player"))
                            {
                                playerScore += 1;
                                System.out.println("The Winner is " + "Player with " + game.getPlayerHand().getValue() + " points"
                                                 + ". Dealer with " + game.getDealerHand().getValue() + " points");
                            }
                            else
                            {
                                if(game.getWhoWon().equals("Dealer"))
                                {
                                    dealerScore += 1;
                                    System.out.println("The Winner is " + "Dealer with " + game.getDealerHand().getValue() + " points"
                                            + ". Player with " + game.getPlayerHand().getValue() + " points");
                                }
                                else
                                {
                                    System.out.println("The result is Tie: Player with " + game.getPlayerHand().getValue() + " points"
                                                   + ". Dealer with " + game.getDealerHand().getValue() + " points");
                                }
                            }
                        }

                        System.out.printf("The Score is: Player => %s , Dealer => %s\n\n", playerScore,  dealerScore);
                    }
                    break;
                case 2:
                    isExit = true;
                    break;
                default:
                    break;
            }
        } while(!isExit);

    }
}
