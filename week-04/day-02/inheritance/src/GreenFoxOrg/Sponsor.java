package GreenFoxOrg;

public class Sponsor extends Person {

    String company;
    Integer hiredStudents;

    public Sponsor(String name, Integer age, String gender){
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    @Override
    public String Introduce(){
        return super.Introduce() + " who represents " + company + " and hireed " + hiredStudents + " students so far.";
    }

    public void hire(){
        hiredStudents++;
    }

    @Override
    public String getGoal(){
        return "Hire brilliant junior software developers.";
    }

}
