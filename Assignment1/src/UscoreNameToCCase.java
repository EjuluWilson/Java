
/* Question 2
Write a program that converts the underscore names to camel cases.
The program should read the input as a string from the user.
Then prints the results on the screen */

import java.util.Scanner;
class UscoreNameToCCase
{

    // Function to remove underscores and convert
    // into camel case
    static String convert(String s)
    {

        // to count spaces
        int cnt= 0;
        int n = s.length();
        //couverting string  to a character array
        char ch[] = s.toCharArray();
        
        int char_index = 0;

        for (int i = 0; i < n; i++)
        {
            // check for underscores in the  underscore name
            if (ch[i] == '_')
            {
                cnt++;
                // conversion into upper case of next character
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
                continue;
            }

            // If not underscore, copy character
            else
                ch[char_index++] = ch[i];
        }

        // new string will be reduced by the
        // size of spaces in the original string
        return "The camel case format is: --> " + String.valueOf(ch, 0, n - cnt);
    }

    // main function
    public static void main(String args[])
    {
        //Create a Scanner object
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter an underscore name");
        // Read user input
        String str = myObj.nextLine();
        System.out.println(convert(str));
    }
}
