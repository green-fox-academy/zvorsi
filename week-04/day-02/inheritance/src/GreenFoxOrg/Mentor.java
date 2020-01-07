package GreenFoxOrg;

public class Mentor extends Person {

    String level;

    public Mentor(String name, Integer age, String gender, String level){
        super (name, age, gender);
        this.level = level;
    }

    public Mentor(){
        super();
        this.level = "intermediate";
    }

    @Override
    public void specificIntroduce(){
        System.out.println(" " + level + " mentor.");
    }

    @Override
    public String getGoal(){
        return "Educate brilliant junior software developers.";
    }

}
