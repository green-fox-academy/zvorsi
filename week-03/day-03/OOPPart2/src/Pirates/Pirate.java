package Pirates;

public class Pirate {

    private String pirate;
    private Integer rumCounter;

    public Pirate(String pirate, Integer rumCounter) {
        this.pirate = pirate;
        this.rumCounter = rumCounter;
    }

 /*   public Pirate(String pirate){
        this.pirate = pirate;
    }*/

    public Pirate(Integer rumCounter) {
        this.rumCounter = rumCounter;
    }

    public void drinkSomeRum(){
        rumCounter++;
    }

    public void passOut(String pirate){
        System.out.println(pirate + " is asleep");
    }

    public void howItGoingMate(){
        if (rumCounter < 4){
            System.out.println("Pour me anudder!");
        }else{
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            passOut(pirate);
        }

    }



}
