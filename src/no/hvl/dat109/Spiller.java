package no.hvl.dat109;

public class Spiller {

    private String spiller1;
    private String spiller2;
    private char symbol;


    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getSpiller1() {
        return spiller1;
    }

    public void setSpiller1(String spiller1) {
        this.spiller1 = spiller1;
    }

    public String getSpiller2() {
        return spiller2;
    }

    public void setSpiller2(String spiller2) {
        this.spiller2 = spiller2;
    }

    public Spiller(String spiller1, String spiller2, char symbol){
        this.spiller1 = spiller1;
        this.spiller2 = spiller2;
        this.symbol = symbol;
    }

}
