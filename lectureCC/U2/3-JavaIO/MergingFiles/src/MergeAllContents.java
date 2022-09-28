import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeAllContents {

    // Write a profram to merge all contents in the files present in a given folder
    // file abc.txt and def.txt

    public static void main(String[] args) throws IOException {
        
        // create a print writer object
            // will contain the merged contents of all files
        PrintWriter printWriter = new PrintWriter("merged.txt");

        // create a file object that points to the folder that contains all of the files
        File file = new File("src/files/");

        // use the list() method to get an array of all the files in the folder
        String[] f = file.list();

        // iterate over the array of files
        for ( String f1: f) {

            // create a buffered reader object for each file
            BufferedReader br = new BufferedReader(new FileReader("src/files/" + f1));

            // read each line using the readLine() method
            String line = br.readLine();

            // create a while loop to iterate over each line
            while (line != null) {

                // write the line to the print writer object
                printWriter.println(line);

                // read the next line
                line = br.readLine();
            }

        }

        // clear the cache
        printWriter.flush();


    }
    
}
