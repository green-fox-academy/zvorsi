package GreenFoxOrg;

public class Student extends Person {

    String previousOrg;
    Integer skippedDays;
    Integer numberOfDays;


    public void setSkippedDays(Integer skippedDays) {
        this.skippedDays = skippedDays;
    }

    public Student(String name, Integer age, String gender, String previousOrg){
        super (name, age, gender);
        this.previousOrg = previousOrg;
        this.skippedDays = 0;
    }

    @Override
    public String Introduce(){
        return super.Introduce() + " from " + previousOrg + " who skipped " + skippedDays + " days from the course already.";
    }

    @Override
    public String getGoal(){
        return "Be a junior software developer.";
    }

    public void skipDays(Integer numberOfDays){
        numberOfDays++;
    }

}
