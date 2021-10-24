import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Task2 {

    public static void main(String[] args) {

        try {
            //
            // PATH
            File pathFile = new File("three_expressions.txt");
            //
            //
            Scanner scannerObj = new Scanner(pathFile);

            while ( scannerObj.hasNextLine() ) {
                String data = scannerObj.nextLine(); //  data =  stores per 1 line of .txt file
                System.out.println(data);
                checkParanthesis(data);
            }
            scannerObj.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    public static void checkParanthesis(String data ) {
        Stack paranStack = new Stack();
        int stringLen = data.length();
        int indexChar = 0;
        while (indexChar != stringLen  ) {

            if ((data.charAt(indexChar) == ')') && (paranStack.isEmpty() == true))
            {
                System.out.println("Parenthesis are NOT put  correct! ");
                return;
            }

            if (data.charAt(indexChar) == '(') paranStack.push(data.charAt(indexChar));
            if (data.charAt(indexChar) == ')') paranStack.pop();

            indexChar++;

        }

        if ( paranStack.isEmpty() == true )  System.out.println("Parenthesis are put correct.");
        else System.out.println("Parenthesis are NOT put  correct!");

    }


}