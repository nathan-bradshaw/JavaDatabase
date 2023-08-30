import java.text.DecimalFormat;
/**
* Class of CentralizedDB.
* Module 9 - Project 9
* @author Nathan Bradshaw - 202110 - COMP-1210-001
* @version 11/6/2020
*/
public class CentralizedDB extends DB {
   //instance variable
   private double license;
   
   //constructor
   /** Sets the variables.
   * @param nameIn Name to be set.
   * @param baseCostIn Base cost to be set.
   * @param dbStorageIn Storage to be set.
   * @param licenseIn License to be set.
   */
   public CentralizedDB(String nameIn, double baseCostIn, 
                  double dbStorageIn, double licenseIn) {
      super(nameIn, baseCostIn, dbStorageIn);
      license = licenseIn;
   }
   
   /** Gets the license.
   * @return Returns license.
   */
   public double getLicense() {
      return license;
   }
   
   /** Sets the license.
   * @param licenseIn License to be set.
   */
   public void setLicense(double licenseIn) {
      license = licenseIn;
   }
   
   /** Gets the monthly cost.
   * @return Returns sum base cost and license.
   */
   public double monthlyCost() {
      return baseCost + license;
   }
   
   /** Describes the CentralizedDB object.
   * @return Returns the info.
   */
   public String toString() {
      DecimalFormat df1 = new DecimalFormat("$#,##0.00");
      String output = "";
      output += super.toString() + "\nLicense: "
         + df1.format(license);
      return output;
   }
}