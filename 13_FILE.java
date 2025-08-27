import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOp {
    public static void main(String[] args) {
        // Check if user passed correct arguments
        if (args.length < 2) {
            System.out.println("Usage: java FileCopy <sourceFile> <destinationFile>");
            return;
        }

        String sourceFile = args[0];       // first argument = input file
        String destinationFile = args[1];  // second argument = output file

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }

            System.out.println("File copied successfully from " + sourceFile + " to " + destinationFile);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

File copied successfully from input.txt to output.txt

-->how to run in eclipse
In Eclipse, right-click your FileCopy.java file.

Select Run As → Run Configurations....

In the left panel, select your program (e.g., FileCopy).

Go to the Arguments tab (top right).

In the Program arguments box, type your filenames, e.g.:

--2.How to add input.txt
   Right Click on the project directory then add file

