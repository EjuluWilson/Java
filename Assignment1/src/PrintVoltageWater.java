/* Question 1
Create a new Java class PrintVoltageWater that prints a table
showing the meter voltage corresponding to 20 random water
temperatures varying from 0 °C to 100 °C degrees. */

//import random class
import java.util.Random;
public class PrintVoltageWater {

    public static void main(String[] args) {
        // define constants
             final double k = 0.5;
        final int Ro = 50;
        final int Vs = 50;
        final int Rs = 75;

        //create a romdom generator object
        Random rnd = new Random();
        //print table header
        System.out.println("--------------------------------------");
        System.out.printf("%10s %20s ", "T(°C)", "Vm (V)");
        System.out.println();
        System.out.println("--------------------------------------");
        for (int i = 1; i <= 20; i++){
            // generate random temperature from O to 100
            int T = rnd.nextInt(101);
            //calculate R
            double R = (Ro + (k*T));
            //calculate Vm
            double Vm = (R/(Rs+R))*Vs;

            //print table row
            System.out.printf("%8d %22.3f", T, Vm);
            System.out.println();
        }
        System.out.println("--------------------------------------");
    }
}
