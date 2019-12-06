import java.util.Scanner;

public class BMI2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Enter name: " );
        String myName = scanner.nextLine();

        System.out.println( "Enter your weight (kg)" );
        double myWeight = scanner.nextDouble();

        System.out.println( "Enter your height (m):" );
        double myHeight = scanner.nextDouble();
        myHeight = ( myHeight * myHeight );

        double BMI = ( myWeight / myHeight );
        System.out.println( "BMI: " + BMI );

        if ( BMI < 18.5 ) {
            System.out.println( myName + ", you are underweight." );
        } else if ( 18.6 < BMI  && BMI < 25 ) {
            System.out.println( myName + ", you are healthy weight." );
        } if ( BMI > 25.1 ) {
            System.out.println( myName + ", you are overweight." );
        }

        System.out.println( "According to the more precise BMIPrime, " + myName );
        double BMIP = (BMI / 25);
        // System.out.println("which is " + BMIP + " for you" );

        if ( BMIP <= 0.74 ){
            System.out.println( "you are underweight." );
        } else if ( 0.74 < BMIP && BMIP <= 1.00 ){
            System.out.println( "you are normal weight." );
        }if ( BMIP > 1.00){
            System.out.println( "you are overweight by " + (int) (( BMIP - 1 ) * 100 ) + " %");
        }
    }
}
