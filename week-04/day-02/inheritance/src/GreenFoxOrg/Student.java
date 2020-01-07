package GreenFoxOrg;

public class Student extends Person {

    String previousOrg;
    Integer skippedDays;
    Integer numberOfDays;


    public void setSkippedDays(Integer skippedDays) {
        this.skippedDays = skippedDays;
    }

    public Student(){
        super ();
        this.previousOrg = "The School of Life";
        this.skippedDays = 0;
    }

    public Student(String name, Integer age, String gender, String previousOrg){
        super (name, age, gender);
        this.previousOrg = previousOrg;
        this.skippedDays = 0;
    }

    @Override
    public void specificIntroduce(){
        System.out.println(" from " + previousOrg + " who skipped " + skippedDays + " days from the course already.");
    }

    @Override
    public String getGoal(){
        return "Be a junior software developer.";
    }

    public void skipDays(Integer numberOfDays){
        numberOfDays++;
    }

}
