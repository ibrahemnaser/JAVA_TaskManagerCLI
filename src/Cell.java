public class Cell {
    private char symbol;

    public Cell(char s){
        this.symbol = s;
    }

    public boolean occupy(char s){
        if(this.symbol == ' '){
            this.symbol = s;
            return true;
        }
        return false;
    }

    public void display(){
        System.out.print(this.symbol);
    }

    public boolean check(char s){
        return this.symbol == s;
    }
}
