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

public class CentralizedDBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Tests getName(). **/
   @Test public void testGetName() {
      CentralizedDB db1 = new CentralizedDB("Database One", 
         1200.0, 5.00, 1500.0);
      Assert.assertEquals("Error", "Database One", db1.getName());
   }
   
   /** Tests setName(). **/
   @Test public void testSetName() {
      CentralizedDB db1 = new CentralizedDB("Database One", 
         1200.0, 5.00, 1500.0);
      db1.setName("Db 1");
      Assert.assertEquals("Error", "Db 1", db1.getName());
   }
   
   /** Tests getBaseCost(). **/
   @Test public void testGetBaseCost() {
      CentralizedDB db1 = new CentralizedDB("Database One", 
         1200.0, 5.00, 1500.0);
      Assert.assertEquals("Error", 1200.0, db1.getBaseCost(), 0.00001);
   }
   
   /** Tests setBaseCost(). **/
   @Test public void testSetBaseCost() {
      CentralizedDB db1 = new CentralizedDB("Database One", 
         1200.0, 5.00, 1500.0);
      db1.setBaseCost(1300.0);
      Assert.assertEquals("Error", 1300.0, db1.getBaseCost(), 0.00001);
   }
   
   /** Tests getDbStorage(). **/
   @Test public void testGetDbStorage() {
      CentralizedDB db1 = new CentralizedDB("Database One", 
         1200.0, 5.00, 1500.0);
      Assert.assertEquals("Error", 5.00, db1.getDbStorage(), 0.00001);
   }
   
   /** Tests setDbStorage(). **/
   @Test public void testSetDbStorage() {
      CentralizedDB db1 = new CentralizedDB("Database One", 
         1200.0, 5.00, 1500.0);
      db1.setDbStorage(6.00);
      Assert.assertEquals("Error", 6.00, db1.getDbStorage(), 0.00001);
   }
   
   /** Tests getCount(). **/
   @Test public void testGetCount() {
      DB.resetCount();
      CentralizedDB db1 = new CentralizedDB("Database One", 
         1200.0, 5.00, 1500.0);
      Assert.assertEquals("Error", 1, db1.getCount());
   }
   
   /** Tests resetCount(). **/
   @Test public void testResetCount() {
      CentralizedDB db1 = new CentralizedDB("Database One", 
         1200.0, 5.00, 1500.0);
      DB.resetCount();
      Assert.assertEquals("Error", 0, db1.getCount());
   }
   
   /** Tests setLicense(). **/
   @Test public void testSetLicense() {
      CentralizedDB db1 = new CentralizedDB("Database One", 
         1200.0, 5.00, 1500.0);
      db1.setLicense(1600.0);
      Assert.assertEquals("Error", 1600.0, db1.getLicense(), 0.00001);
   }
   
   /** Tests monthlyCost(). **/
   @Test public void testMonthlyCost() {
      CentralizedDB db1 = new CentralizedDB("Database One", 
         1200.0, 5.00, 1500.0);
      Assert.assertEquals("Error", 2700, db1.monthlyCost(), 0.00001);
   }
   
   /** Tests toString(). */
   @Test public void testToString() {
      CentralizedDB db1 = new CentralizedDB("Database One", 
         1200.0, 5.00, 1500.0);
      String info = db1.toString();
      Assert.assertTrue("Error", info.contains("License"));
   }
}
