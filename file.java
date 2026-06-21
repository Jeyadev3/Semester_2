package geometricObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class file {
    public static void main(String[] args) {
        String path = "C:\Users\JEYADEV T\OneDrive\Documents\jaya.txt";

        try {
            FileInputStream fis = new FileInputStream(path);
            int op = fis.read();

            while (op != -1) {   // -1 means end of file
                System.out.print((char) op);  // convert int to char
                op = fis.read();  // read next character
            }

            fis.close(); // always close file

        } catch (FileNotFoundException e) {
            System.out.println("Error: Could not find the file at " + path);
        } catch (IOException e) {
            System.out.println("Error while reading the file.");
        }
    }
}