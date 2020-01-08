package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {

        super("Violin", 4);
    }

    public Violin(Integer numberOfStrings) {
        super ("Violin",numberOfStrings);
    }

    @Override
    public String sound() {
        return "Screech";
    }

}
