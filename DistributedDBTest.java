import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Test class of CentralizedDB.
* Module 9 - Project 9
* @author Nathan Bradshaw - 202110 - COMP-1210-001
* @version 11/6/2020
*/

public class DistributedDBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests getNumberOfUsers(). **/
   @Test public void testGetNumberOfUsers() {
      DistributedDB db2 = new DistributedDB("Database Two", 
         2000.0, 7.5, 100, 12.0);
      Assert.assertEquals("Error", 100, db2.getNumberOfUsers());
   }
   
   /** Tests setNumberOfUsers(). **/
   @Test public void testSetNumberOfUsers() {
      DistributedDB db2 = new DistributedDB("Database Two", 
         2000.0, 7.5, 100, 12.0);
      db2.setNumberOfUsers(110);
      Assert.assertEquals("Error", 110, db2.getNumberOfUsers());
   }
   
   /** Tests getCostPerUser(). **/
   @Test public void testGetCostPerUser() {
      DistributedDB db2 = new DistributedDB("Database Two", 
         2000.0, 7.5, 100, 12.0);
      Assert.assertEquals("Error", 12.0, db2.getCostPerUser(), 0.00001);
   }
   
   /** Tests setCostPerUser(). **/
   @Test public void testSetCostPerUser() {
      DistributedDB db2 = new DistributedDB("Database Two", 
         2000.0, 7.5, 100, 12.0);
      db2.setCostPerUser(14.0);
      Assert.assertEquals("Error", 14.0, db2.getCostPerUser(), 0.00001);
   }
   
   /** Tests userCost(). **/
   @Test public void testUserCost() {
      DistributedDB db2 = new DistributedDB("Database Two", 
         2000.0, 7.5, 100, 12.0);
      Assert.assertEquals("Error", 1200.00, db2.userCost(), 0.00001);
   }
   
   /** Tests getCostFactor(). **/
   @Test public void testGetCostFactor() {
      DistributedDB db2 = new DistributedDB("Database Two", 
         2000.0, 7.5, 100, 12.0);
      Assert.assertEquals("Error", 1.1, db2.getCostFactor(), 0.00001);
   }
   
   /** Tests monthlyCost(). **/
   @Test public void testMonthlyCost() {
      DistributedDB db2 = new DistributedDB("Database Two", 
         2000.0, 7.5, 100, 12.0);
      Assert.assertEquals("Error", 3320.00, db2.monthlyCost(), 0.00001);
   }
   
   /** Tests toString(). */
   @Test public void testToString() {
      DistributedDB db2 = new DistributedDB("Database Two", 
         2000.0, 7.5, 100, 12.0);
      String info = db2.toString();
      Assert.assertTrue("Error", info.contains("Factor"));
   }
}
