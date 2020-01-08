package printableInterface;

public class Domino implements Printable{

    Integer leftSide;
    Integer rightSide;


    public Domino(Integer leftSide, Integer rightSide) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    public Domino() {
    }

    @Override
    public void printAllFields() {
        System.out.println("Domino A side: " + this.leftSide + ", B side: " + this.rightSide);
    }
}
