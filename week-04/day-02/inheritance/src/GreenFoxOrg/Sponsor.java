package GreenFoxOrg;

public class Sponsor extends Person {

    String company;
    Integer hiredStudents;

    public Sponsor(String name, Integer age, String gender, String company){
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor(){
        super();
        this.company = "Google";
        this.hiredStudents = 0;
    }

    @Override
    public void specificIntroduce(){
        System.out.println(" who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire(){
        hiredStudents++;
    }

    @Override
    public String getGoal(){
        return "Hire brilliant junior software developers.";
    }

}
