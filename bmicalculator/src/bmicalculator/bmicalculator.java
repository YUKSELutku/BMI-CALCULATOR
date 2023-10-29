// Utku YÜKSEL 220315027 //
package bmicalculator;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Utku YÜKSEL 220315027
 */
public class bmicalculator {

    public static void main(String[] args) {
        
        final double poundtoKilogram = 0.45359237;
        final double inchtoMeter = 0.0254;
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Body Mass Index Calculator");
        System.out.println("");

        System.out.print("Enter your weight in pounds: ");
        double pound = scanner.nextDouble();
        
        System.out.print("Enter your height in inches: ");
        double inch = scanner.nextDouble();
        
        double kilogram = pound * poundtoKilogram;
        double meter = inch * inchtoMeter;
       
        int bmiValue = (int)(kilogram / (meter * meter));
        System.out.println("Your BMI is: " + bmiValue);
        
        if (bmiValue<18.5){
            System.out.println("You are underweight.");
        }
        else if (bmiValue >= 18.5 && bmiValue<24.9){
            System.out.println("You are healthy.");
        }
        else if (bmiValue >= 25 && bmiValue<29.9){
            System.out.println("You are overweight.");
        }
        else {
            System.out.println("You are obese.");
        }

        
    }
    
}
