public class Game   {

    public Game(){
        System.out.println("***************************");
        System.out.println("Welcome To Tic-Tac-Toe Game");
        System.out.println("***************************");
    }

    public static void run(){
        // Player
        Player playerOne = new Player(true);
        Player playerTwo = new Player(false);

        // Board
        Board board = new Board();
        board.display();

        while(true){
            while(!board.validate(playerOne.move(), playerOne.getSymbol())){
                System.out.println("Sorry, "+ playerOne.getName() +" this position  is already take!!\nTry Again!!");
            }
            if(board.check(playerOne,playerTwo)){
                break;
            };
            while(!board.validate(playerTwo.move(), playerTwo.getSymbol())){
                System.out.println("Sorry, "+ playerTwo.getName() +" this position  is already take!!\nTry Again!!");
            }
            if(board.check(playerOne,playerTwo)){
               break;
            };
        }
    }
}
