import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)) {
        System.out.println(" input your weight:");
        double weight = scanner.nextDouble();
        System.out.println(" input your height:");
        double height = scanner.nextDouble();
        double BMI = weight/Math.pow(height, 2);
        System.out.println(BMI);
            if ( BMI < 18.5 ){
                System.out.println("very light");
            } else if ( BMI >= 18.5 && BMI < 25){
                System.out.println("normal weight");
            } else if ( BMI >= 25 && BMI <28 ) {
                System.out.println("slight overweight");
            } else if ( BMI >= 28 && BMI < 32) {
                System.out.println(" obese");
            } else {
                System.out.printf("print BMI : %.2f\n " , BMI);
            }
        }

    }
}




