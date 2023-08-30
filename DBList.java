import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
* Class of DBList.
* Module 10 - Project 10
* @author Nathan Bradshaw - 202110 - COMP-1210-001
* @version 11/13/2020
*/

public class DBList {
   //fields
   private DB[] array;
   private String[] invalidRecords;
   
   //constructor
   /** Sets the variables. */
   public DBList() {
      array = new DB[0];
      invalidRecords = new String[0];
   }
   
   /** Gets the DB array.
   * @return Returns the DB array. */
   public DB[] getDBArray() {
      return array;
   }
   
   /** Gets the invalid records array.
   * @return Returns the invalid records array. */
   public String[] getInvalidRecordsArray() {
      return invalidRecords;
   }
   
   /** Adds a DB object to the array.
   * @param dBIn object to be added. */
   public void addDB(DB dBIn) {
      array = Arrays.copyOf(array, array.length + 1);
      array[array.length - 1] = dBIn;
   }
   
   /** Adds an invalid record to the list.
   * @param invRecIn Invalid record to be added. */
   public void addInvalidRecord(String invRecIn) {
      invalidRecords = Arrays.copyOf(invalidRecords, 
                        invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = invRecIn;
   }
   
   /** Reads in a file for the DB array.
   * @param fileNameIn The data file name to be read. 
   * @throws FileNotFoundException If file not found. */
   public void readFile(String fileNameIn) throws FileNotFoundException {
      
      String origCategory;
      char category;
      String name;
      double baseStorageCost, dbStorage, costPerUser;
      int numOfUsers;
      
      Scanner scanFile = new Scanner(new File(fileNameIn));
      
      while (scanFile.hasNextLine()) {
         
         String line = scanFile.nextLine();
         Scanner scanLine = new Scanner(line);
         scanLine.useDelimiter(",");
         while (scanLine.hasNext()) {
  
            try {
            
               origCategory = scanLine.next(); //original
               category = origCategory.charAt(0);
               name = scanLine.next();
               baseStorageCost = Double.parseDouble(scanLine.next());
               dbStorage = Double.parseDouble(scanLine.next());
            
               switch (category) {
                  case 'C': double license = Double.parseDouble(
                              scanLine.next());
                     CentralizedDB newCDB = new CentralizedDB(name, 
                        baseStorageCost, dbStorage, license);
                     addDB(newCDB);
                     break;
                  
                  case 'D': numOfUsers = scanLine.nextInt();
                     costPerUser = Double.parseDouble(scanLine.next());
                     DistributedDB newDDB = new DistributedDB(name, 
                        baseStorageCost, dbStorage, numOfUsers, 
                        costPerUser);
                     addDB(newDDB);
                     break;
                  
                  case 'H': numOfUsers = scanLine.nextInt();
                     costPerUser = Double.parseDouble(scanLine.next());
                     HomogeneousDB newHDB = new HomogeneousDB(name, 
                        baseStorageCost, dbStorage, numOfUsers,
                        costPerUser);
                     addDB(newHDB);
                     break;
                  
                  case 'E': numOfUsers = scanLine.nextInt();
                     costPerUser = Double.parseDouble(scanLine.next());
                     HeterogeneousDB newEDB = new HeterogeneousDB(name, 
                        baseStorageCost, dbStorage, numOfUsers, 
                        costPerUser);
                     addDB(newEDB);
                     break;
                  
                  default: scanLine.nextLine();
                     throw new InvalidCategoryException(origCategory);
               }
            }
            catch (NumberFormatException e) {
               String invalid = "";
               invalid += line;
               invalid += "\n" + e.toString();
               addInvalidRecord(invalid);
               scanLine.nextLine();
            }
            catch (NoSuchElementException e) {
               String invalid = line;
               invalid += "\n" + e.toString();
               invalid += ": For missing input data";
               addInvalidRecord(invalid);
            }
            catch (InvalidCategoryException e) {
               String invalid = "";
               invalid += line;
               invalid += "\n" + e.toString();
               addInvalidRecord(invalid);
            }
         }
      }
      scanFile.close();
   }
   
   /** Generates the Monthly Database Report.
   * @return Returns the report. */
   public String generateReport() {
      String output = "-------------------------------";
      output += "\nMonthly Database Report";
      output += "\n-------------------------------\n";
      for (DB obj: array) {
         output += obj.toString();
         output += "\n\n";
      }
      return output;
   }
   
   /** Generates the Monthly Database Report by name.
   * @return Returns the report. */
   public String generateReportByName() {
      Arrays.sort(getDBArray());
      String output = "-----------------------------------------";
      output += "\nMonthly Database Report (by Name)";
      output += "\n-----------------------------------------\n";
      for (DB obj: array) {
         output += obj.toString();
         output += "\n\n";
      }
      return output;
   }
   
   /** Generates the Monthly Database Report by 
   * monthly cost.
   * @return Returns the report. */
   public String generateReportByMonthlyCost() {
      Arrays.sort(getDBArray(), 
               new MonthlyCostComparator());
      String output = "-------------------------------------------------";
      output += "\nMonthly Database Report (by Monthly Cost)";
      output += "\n-------------------------------------------------\n";
      for (DB obj: array) {
         output += obj.toString();
         output += "\n\n";
      }
      return output;
   }
   
   /** Generates the Invalid Records Report.
   * @return Returns the report. */
   public String generateInvalidRecordsReport() {
      String output = "----------------------";
      output += "\nInvalid Records Report";
      output += "\n----------------------\n";
      for (String rec: invalidRecords) {
         output += rec;
         output += "\n\n";
      }
      output += "\n";
      return output;
   }
}