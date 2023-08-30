/**
* Class of HeterogeneousDB.
* Module 9 - Project 9
* @author Nathan Bradshaw - 202110 - COMP-1210-001
* @version 11/6/2020
*/
public class HeterogeneousDB extends DistributedDB {
   /** constant. */
   public static final double COST_FACTOR = 1.3; //HeterogeneousDB.COST_FACTOR
   
   //constructor
   /** Sets the variables.
   * @param nameIn Name to be set.
   * @param baseCostIn Base cost to be set.
   * @param dbStorageIn Storage to be set.
   * @param numOfUsersIn Number of users to be set.
   * @param costPerUserIn Cost per user to be set.
   */
   public HeterogeneousDB(String nameIn, double baseCostIn, 
         double dbStorageIn, int numOfUsersIn, 
         double costPerUserIn) {
      super(nameIn, baseCostIn, dbStorageIn, numOfUsersIn, costPerUserIn);
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
}