import java.text.DecimalFormat;
/**
* Abstract class of DB.
* Module 9 - Project 9
* @author Nathan Bradshaw - 202110 - COMP-1210-001
* @version 11/6/2020
*/

public abstract class DB implements Comparable<DB> {
   //instance variables
   protected String name;
   protected double baseCost;
   protected double dbStorage; //in terabytes
   //class variables
   protected static int count = 0;
   
   //constructor
   /** Sets the variables and increments count.
   * @param nameIn Name to be set.
   * @param baseCostIn Base cost to be set.
   * @param dbStorageIn Storage to be set.
   */
   public DB(String nameIn, double baseCostIn, double dbStorageIn) {
      name = nameIn;
      baseCost = baseCostIn;
      dbStorage = dbStorageIn;
      count++;
   }
   
   /** Gets the name.
   * @return Returns name.
   */
   public String getName() {
      return name;
   }
   
   /** Sets the name.
   * @param nameIn Name to be set.
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /** Gets the base cost.
   * @return Returns base cost.
   */
   public double getBaseCost() {
      return baseCost;
   }
   
   /** Sets the base cost.
   * @param baseCostIn Base cost to be set.
   */
   public void setBaseCost(double baseCostIn) {
      baseCost = baseCostIn;
   }
   
   /** Gets the database sotrage.
   * @return Returns database storage.
   */
   public double getDbStorage() {
      return dbStorage;
   }
   
   /** Sets the database storage.
   * @param dbStorageIn Database storage to be set.
   */
   public void setDbStorage(double dbStorageIn) {
      dbStorage = dbStorageIn;
   }
   
   /** Gets the count.
   * @return Returns count.
   */
   public static int getCount() {
      return count;
   }
   
   /** Resets count to zero.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /** Describes the DB object.
   * @return Returns the info.
   */
   public String toString() {
      DecimalFormat df1 = new DecimalFormat("$#,##0.00");
      DecimalFormat df2 = new DecimalFormat("0.000");
      String output = "";
      output += name + " (" + this.getClass()
         + ") Monthly Cost: " + df1.format(monthlyCost()) 
         + "\nStorage: " + df2.format(dbStorage) + " TB"
         + "\nBase Cost: " + df1.format(baseCost);
      return output;
   }
   
   /** Gets the monthly cost.
   * @return Returns the monthly cost.
   */
   public abstract double monthlyCost();
   
   /** Compares two DB objects.
   * @param otherDB DB object to be compared.
   * @return Returns int if based on result. */
   public int compareTo(DB otherDB) {
      int compare = getName().compareTo(otherDB.getName());
      return compare;
   }
}