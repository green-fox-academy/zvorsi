import java.sql.SQLOutput;
import java.util.Scanner;

public class conditionalMutation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");

        double a = scanner.nextDouble();
        int out = 0;
        // if a is even increment out by one

        if(a % 2 == 0){
            System.out.println("you have entered even number if you read 1 here: " + (out + 1));
        }else{
            System.out.println("you have entered odd number if you read 0 here: " + out);
        }


        System.out.println("enter a number between 10 and 20");

        int b = scanner.nextInt();
        String out2 = "";
        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"

        if(b < 20 && b > 10){
            out2 = "Sweet!";
            System.out.println(out2);
        }else if(b < 10){
            out2 = "Less!";
            System.out.println(out2);
        }else if(b > 20){
            out2 = "More!";
            System.out.println(out2);
        }

        int c = 12;
        int credits = 100;
        boolean isBonus = false;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        // if isBonus is true c should remain the same

        if(( credits >= 50 ) && ( isBonus == false )){
            System.out.println(c - 2);
        }else if (( credits < 50 ) && ( isBonus == false )){
            System.out.println(c - 1);
        }else if( isBonus == true ){
            System.out.println(c);
        }


        int d = 8;
        int time = 120;
        String out3 = "";
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        // if time is more than 200
        // set out3 to "Time out"
        // otherwise set out3 to "Run Forest Run!"

        if(d % 4 == 0 && time < 200){
            out3 = "check";
            System.out.println(out3);
        }else if (time > 200){
            out3 = "time out";
            System.out.println(out3);
        }else{
            out3 = "run Forrest run";
        }

    }
}
