import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Player {
    private String name;
    private char symbol;
    private static final HashSet<Character> takenSymbols = new HashSet<>();
    private final boolean isHuman;
    private final Scanner SCANNER = new Scanner(System.in);
    private final Random RAND = new Random();

    public Player(boolean isHuman) {
        this.isHuman = isHuman;
        if (isHuman) {
            this.humanAssign();
        } else {
            this.computerAssign();
        }
        this.welcomeMessage();
    }

    public static boolean validateSymbol(char s) {
        return !takenSymbols.contains(s);
    }

    private String input(String msg){
        System.out.print(msg);
        return SCANNER.nextLine();
    }
    private void humanAssign() {
        this.name = this.input("Please Enter your Name: ");

        while (true) {
            char userInputSymbol = this.input("Please Enter your Symbol (ex: 'X' - 'O' - 'L' ...: ").toUpperCase().charAt(0);
            if (Player.validateSymbol(userInputSymbol)) {
                this.symbol = userInputSymbol;
                takenSymbols.add(userInputSymbol);
                break;
            } else {
                System.out.println("Sorry, this symbol ( " + userInputSymbol + " ) is already taken!");
                System.out.println("Choose again..");
            }
        }
    }

    private void computerAssign() {
        this.name = "Comp " + getRandom();
        if (Player.validateSymbol('O')) {
            this.symbol = 'O';
        } else {
            this.symbol = 'X';
        }
    }

    private void welcomeMessage() {
        System.out.println("Hello " + this.name + " your symbol is: ( " + this.symbol + " )\nGOOD LUCK!!");
    }

    private String getRandom(){
        return Integer.toString(RAND.nextInt(9)+1);
    }

    public String move(){
        if(this.isHuman){
            return this.input("Choose [1-9]: ");
        }
        String choice = this.getRandom();
        System.out.println("Computer choice: "+ choice);
        return choice;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public boolean isHuman() {
        return isHuman;
    }
}
