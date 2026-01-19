public class Board {
    private final int SIZE = 3;
    private final Cell[][] matrix = new Cell[this.SIZE][this.SIZE];
    private int counter = 0;

    public Board() {
        // 3 x 3 Board
        for (int i = 0; i < this.SIZE; i++) {
            for (int j = 0; j < this.SIZE; j++) {
                this.matrix[i][j] = new Cell(' ');
            }
        }
    }

    public void display() {
        for (int i = 0; i < this.SIZE; i++) {
            for (int j = 0; j < this.SIZE; j++) {
                this.matrix[i][j].display();
                if (j != (this.SIZE - 1)) System.out.print('|');
            }
            if (i != (this.SIZE - 1)) {
                System.out.println("\n-+-+-");
            }
        }
        System.out.println('\n');
    }

    public boolean validate(String choice, char s) {
        for (int i = 0; i < this.SIZE; i++) {
            for (int j = 0; j < this.SIZE; j++) {
                int count = ((i * this.SIZE) + (j + 1));
                if (count == Integer.parseInt(choice) && this.matrix[i][j].occupy(s)) {
                    this.display();
                    this.counter++;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean check(Player p1, Player p2) {
        // check if game is over tie | wins
        // player one wins
        if (
                (this.matrix[0][0].check(p1.getSymbol()) && this.matrix[0][1].check(p1.getSymbol()) && this.matrix[0][2].check(p1.getSymbol())) ||
                (this.matrix[1][0].check(p1.getSymbol()) && this.matrix[1][1].check(p1.getSymbol()) && this.matrix[1][2].check(p1.getSymbol())) ||
                (this.matrix[2][0].check(p1.getSymbol()) && this.matrix[2][1].check(p1.getSymbol()) && this.matrix[2][2].check(p1.getSymbol())) ||

                (this.matrix[0][0].check(p1.getSymbol()) && this.matrix[1][0].check(p1.getSymbol()) && this.matrix[2][0].check(p1.getSymbol())) ||
                (this.matrix[0][1].check(p1.getSymbol()) && this.matrix[1][1].check(p1.getSymbol()) && this.matrix[2][1].check(p1.getSymbol())) ||
                (this.matrix[0][2].check(p1.getSymbol()) && this.matrix[1][2].check(p1.getSymbol()) && this.matrix[2][2].check(p1.getSymbol())) ||

                (this.matrix[0][0].check(p1.getSymbol()) && this.matrix[1][1].check(p1.getSymbol()) && this.matrix[2][2].check(p1.getSymbol())) ||
                (this.matrix[0][2].check(p1.getSymbol()) && this.matrix[1][1].check(p1.getSymbol()) && this.matrix[2][0].check(p1.getSymbol()))
        ) {
            System.out.println("Congrats, " + p1.getName() + " \nYou won!!");
            return true;
        }
        // player two wins
        if (
                (this.matrix[0][0].check(p2.getSymbol()) && this.matrix[0][1].check(p2.getSymbol()) && this.matrix[0][2].check(p2.getSymbol())) ||
                (this.matrix[1][0].check(p2.getSymbol()) && this.matrix[1][1].check(p2.getSymbol()) && this.matrix[1][2].check(p2.getSymbol())) ||
                (this.matrix[2][0].check(p2.getSymbol()) && this.matrix[2][1].check(p2.getSymbol()) && this.matrix[2][2].check(p2.getSymbol())) ||

                (this.matrix[0][0].check(p2.getSymbol()) && this.matrix[1][0].check(p2.getSymbol()) && this.matrix[2][0].check(p2.getSymbol())) ||
                (this.matrix[0][1].check(p2.getSymbol()) && this.matrix[1][1].check(p2.getSymbol()) && this.matrix[2][1].check(p2.getSymbol())) ||
                (this.matrix[0][2].check(p2.getSymbol()) && this.matrix[1][2].check(p2.getSymbol()) && this.matrix[2][2].check(p2.getSymbol())) ||

                (this.matrix[0][0].check(p2.getSymbol()) && this.matrix[1][1].check(p2.getSymbol()) && this.matrix[2][2].check(p2.getSymbol())) ||
                (this.matrix[0][2].check(p2.getSymbol()) && this.matrix[1][1].check(p2.getSymbol()) && this.matrix[2][0].check(p2.getSymbol()))
        ) {
            System.out.println("Congrats, " + p2.getName() + " \nYou won!!");
            return true;
        }
        // tie

        if (this.counter == 9) {
            System.out.println("It is tie");
            return true;
        }
        // not finished yet
        return false;
    }
}
