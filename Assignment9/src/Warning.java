// ************************************************************************
// Warning.java
// Reads student data from a text file and writes data to another text file.
// ************************************************************************

import java.util.Scanner;
import java.io.*;

public class Warning {
    // -------------------------------------------------------------------
// Reads student data (name, semester hours, quality points) from a
// text file, computes the GPA, then writes data to another file
// if the student is placed on academic warning.
// -------------------------------------------------------------------
    public static void main(String[] args) {
        int creditHrs; // number of semester hours earned
        double qualityPts; // number of quality points earned
        double gpa; // grade point (quality point) average
        String line, name, inputName = "students.dat";
        String outputName = "warning.dat";

        try {
            // Set up scanner to input file
            File myObj = new File("P:\\Java\\Assignment9\\"+inputName);
            Scanner scan = new Scanner(myObj);

            // Set up the output file stream
            PrintWriter outFile = new PrintWriter("P:\\Java\\Assignment9\\"+outputName);

            // Print a header to the output file
            outFile.println();
            outFile.println("Students on Academic Warning");
            outFile.println();

            // Process the input file, one token at a time
            while (scan.hasNextLine()) {
            // Get the credit hours and quality points and
                name = scan.next();
                creditHrs = Integer.parseInt(scan.next());
                qualityPts = Double.parseDouble(scan.next());
                gpa = qualityPts/creditHrs;

                line = name+" "+creditHrs+" "+gpa;

            // determine if the student is on warning. If so,
            // write the student data to the output file.
                if  ((gpa<1.5) && (creditHrs < 30)){
                    // put on academic warning
                    outFile.println(line);

                } else if ((gpa<1.75) && (creditHrs < 60)){
                    // put on academic warning
                    outFile.println(line);

                } else if (gpa<2.0) {
                    // put on academic warning
                    outFile.println(line);
                }
            }
        // Close output file
            outFile.close();

        } catch (FileNotFoundException exception) {
            System.out.println("The file " + inputName + " was not found.");
        } catch (IOException exception) {
            System.out.println(exception);
        } catch (NumberFormatException e) {
            System.out.println("Format error in input file: " + e);
        }
    }
}