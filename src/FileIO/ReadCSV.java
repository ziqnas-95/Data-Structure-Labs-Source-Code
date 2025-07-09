/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileIO;

import java.io.BufferedReader;
import java.io.*;
/**
 *
 * @author Haziq Nasaruddin
 */
public class ReadCSV {
    
    public static void main(String[] args) {
        
        //readCSV("sample_students.csv");
        System.out.println("");
        
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))){
            
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null){
                String[] values = line.split(",");
                count++;
                if (count != 1){
                    for (String x : values){
                        System.out.print(x.trim() + "\t");
                    }
                    System.out.println("");
                }
                
            }

        } catch (IOException e){
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
        
    }
    
    
    public static void readCSV(String filename){
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null){
                String[] values = line.split(",");
                count++;
                if (count != 1){
                    for (String x : values){
                        System.out.print(x.trim() + "\t");
                    }
                    System.out.println("");
                }
                
            }

        } catch (IOException e){
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
