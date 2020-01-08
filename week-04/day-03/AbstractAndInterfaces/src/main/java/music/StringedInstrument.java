package main.java.music;

public abstract class StringedInstrument extends Instrument {

    Integer numberOfStrings;

    public StringedInstrument(String name, Integer numberOfStrings) {
        super (name);
        this.numberOfStrings = numberOfStrings;
    }

    public void play(){
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + sound() + "." );
    }

}
