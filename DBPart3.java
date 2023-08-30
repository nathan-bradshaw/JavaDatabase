//import java.io.File;
import java.io.FileNotFoundException;
/**
* Class of DBList.
* Module 11 - Project 11
* @author Nathan Bradshaw - 202110 - COMP-1210-001
* @version 11/20/2020
*/

public class DBPart3 {

   /** Runs the class DBList. 
   * @param args Used. 
   * @throws FileNotFoundException If file not found. */
   public static void main(String[] args) { //throws FileNotFoundException {
      
      DBList db = new DBList();
      if (args.length == 0) {
         System.out.println("File name expected as" 
            + " command line argument.");
         System.out.println("Program ending.");
      } else {
         String fileName = args[0];
         try {
            db.readFile(fileName);
            System.out.print(db.generateReport());
            System.out.print(db.generateReportByName());
            System.out.print(db.generateReportByMonthlyCost());
            System.out.print(db.generateInvalidRecordsReport());
         }
         catch (FileNotFoundException e) {
            System.out.println("*** Attempted to read file: " + e.getMessage());
         }
      }
   }
}