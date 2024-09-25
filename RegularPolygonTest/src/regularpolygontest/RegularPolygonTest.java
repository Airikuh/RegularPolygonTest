/*
Erika Valle-Baird
CIS 296
001
Project 1
10/20/2021
File to Test RegularPolygon Class Along with ArrayList, File Input, and File Output
*/

package regularpolygontest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class RegularPolygonTest {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Create object to open file 
              Scanner inFile;
              //Create ArrayList of RegularPolygon Objects
              ArrayList<RegularPolygon> vals = new ArrayList<RegularPolygon>();
              //Create String to put File Input into
      String name;
       
      //Error Handling 
      try{
          //Open File
          inFile = new Scanner(new File("C:\\Users\\airik\\Documents\\JavaWork\\NetBeansProjects\\RegularPolygonTest\\src\\regularpolygontest\\input.txt"));
          
          //While There is Something in the file to read
          while(inFile.hasNext()){
              //Read in single line from file
              name = inFile.nextLine();
              //Split based on whitespace
              String[] parts = name.split(" ");
              //If we have a case of only 2 numbers on the line Construct with 2 argument constructor
             if(parts.length==2){
               vals.add(new RegularPolygon(Integer.parseInt(parts[0]),Double.parseDouble(parts[1])));
             }
             //Else we have 4 numbers on a line since assumed file data is correct
             else{
                 vals.add(new RegularPolygon(Integer.parseInt(parts[0]),Double.parseDouble(parts[1]),Double.parseDouble(parts[2]),Double.parseDouble(parts[3])));            
             }

          }
          //Create Output File Variable
          PrintWriter pw = null;
          //Error Handling
          try{
              //Open and create output file
              pw = new PrintWriter("data.txt");
              //For loop to cycle through ArrayList object values and write into file
              for(RegularPolygon rp: vals){
                 pw.println(rp);
             }
          }
          catch(FileNotFoundException ex){
              System.out.println("Whoa Buddy Problem With Output File!");
              
          }
          finally{
              if(pw != null){
                  //Close File
                  pw.close();
              }
          }
          //Print contents of ArrayList object values to screen
           for(RegularPolygon rp: vals){
                 System.out.println(rp);
             }
           //Close File
          inFile.close();
      
      }
      
      catch(FileNotFoundException ex){
          System.out.println("ERROR With Input File");
      }
      
      
    }
}
