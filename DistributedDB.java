import java.text.DecimalFormat;
/**
* Class of CentralizedDB.
* Module 9 - Project 9
* @author Nathan Bradshaw - 202110 - COMP-1210-001
* @version 11/6/2020
*/
public class DistributedDB extends DB {
   //instance variables
   protected int numOfUsers;
   protected double costPerUser;
   /** constant. */ 
   public static final double COST_FACTOR = 1.1; //DistributedDB.COST_FACTOR
   
   //contructor
   /** Sets the variables.
   * @param nameIn Name to be set.
   * @param baseCostIn Base cost to be set.
   * @param dbStorageIn Storage to be set.
   * @param numOfUsersIn Number of users to be set.
   * @param costPerUserIn Cost per user to be set.
   */
   public DistributedDB(String nameIn, double baseCostIn, 
         double dbStorageIn, int numOfUsersIn, 
         double costPerUserIn) {
      super(nameIn, baseCostIn, dbStorageIn);
      numOfUsers = numOfUsersIn;
      costPerUser = costPerUserIn;
   }
   
   /** Gets the number of users.
   * @return Returns number of users.
   */
   public int getNumberOfUsers() {
      return numOfUsers;
   }
   
   /** Sets the number of users.
   * @param numOfUsersIn Number of users to be set.
   */
   public void setNumberOfUsers(int numOfUsersIn) {
      numOfUsers = numOfUsersIn;
   }
   
   /** Gets the cost per user.
   * @return Returns the cost per user.
   */
   public double getCostPerUser() {
      return costPerUser;
   }
   
   /** Sets the cost per user.
   * @param costPerUserIn Cost per user to be set.
   */
   public void setCostPerUser(double costPerUserIn) {
      costPerUser = costPerUserIn;
   }
   
   /** Gets the user cost.
   * @return Returns user cost.
   */
   public double userCost() {
      return numOfUsers * costPerUser;
   }
   
   /** Gets the cost factor.
   * @return Returns the cost factor.
   */
   public double getCostFactor() {
      return COST_FACTOR;
   }
   
   /** Gets the monthly cost.
   * @return Returns the monthly cost.
   */
   public double monthlyCost() {
      return baseCost + userCost() * COST_FACTOR;
   }
   
   /** Describes the DistributedDB object.
   * @return Returns the info.
   */
   public String toString() {
      DecimalFormat df1 = new DecimalFormat("$#,##0.00");
      String output = "";
      output += super.toString() + "\nNumber of Users: "
         + numOfUsers + "\nCost per User: " 
         + df1.format(costPerUser) + "\nUser Cost: "
         + df1.format(userCost()) + "\nCost Factor: "
         + getCostFactor();
      return output;
   } 
}