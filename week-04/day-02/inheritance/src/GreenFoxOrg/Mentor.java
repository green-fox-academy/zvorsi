package GreenFoxOrg;

public class Mentor extends Person {

    String level;

    public Mentor(String name, Integer age, String gender){
        super (name, age, gender);
        this.level = level;
    }

    @Override
    public String Introduce(){
        return super.Introduce() + level + " mentor";
    }

    @Override
    public String getGoal(){
        return "Educate brilliant junior software developers.";
    }

}
