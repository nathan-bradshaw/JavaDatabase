import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Test class of HomogeneousDB.
* Module 9 - Project 9
* @author Nathan Bradshaw - 202110 - COMP-1210-001
* @version 11/6/2020
*/

public class HomogeneousDBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Tests getCostFactor(). **/
   @Test public void testGetCostFactor() {
      HomogeneousDB db3 = new HomogeneousDB("Database Three", 
         2000, 7.5, 100, 14.0);
      Assert.assertEquals("Error", 1.2, db3.getCostFactor(), 0.00001);
   }
   
   /** Tests monthlyCost(). **/
   @Test public void testMonthlyCost() {
      HomogeneousDB db3 = new HomogeneousDB("Database Three", 
         2000, 7.5, 100, 14.0);
      Assert.assertEquals("Error", 3680.00, db3.monthlyCost(), 0.00001);
   }
   
   /** Tests toString(). */
   @Test public void testToString() {
      HomogeneousDB db3 = new HomogeneousDB("Database Three", 
         2000, 7.5, 100, 14.0);
      String info = db3.toString();
      Assert.assertTrue("Error", info.contains("Factor"));
   }
}
