package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        super("Bass guitar", 4);
    }

    public BassGuitar(Integer numberOfStrings) {

        super ("Bass guitar",numberOfStrings);
    }

    @Override
    public String sound() {
        return "Duum-duum-duum";
    }

}
