/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileIO;
import java.io.*;
/**
 *
 * @author Haziq Nasaruddin
 */
public class WriteCSV {
    
    public static void main(String[] args) {
        
        writeToCSVFile();
        
    }
    
    public static void writeToCSVFile() {
        
        /**
         * parameters in the FileWriter can be adjusted to how we want it
         * whether to write to a new file or to append it
         * 
         * to write to a new file           new FileWriter("data.csv")
         * to append to an existing file    new FileWriter("data.csv", true)
         */
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"))) { // simply change the file type here (txt or csv)
            // Write header                                                                         
            writer.write("Name,Age,City");
            writer.newLine();
            
            // Write data rows
            writer.write("John,25,New York");
            writer.newLine();
            writer.write("Sarah,30,Los Angeles");
            writer.newLine();
            writer.write("Mike,22,Chicago");
            writer.newLine();
            
            System.out.println("CSV file written successfully!");
            
        } catch (IOException e) {
            System.out.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}