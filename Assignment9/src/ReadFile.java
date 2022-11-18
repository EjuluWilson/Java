import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter file name:  ");

        while (true) {
            String myFile = scan.nextLine();
            try {
                File myObj = new File("P:\\Java\\Assignment9\\" + myFile + ".txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
                break;
            } catch (FileNotFoundException e) {
                System.out.println("File not found. Enter another file name: hint -> (javaMugina)");
            }
        }
    }
}