import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
/**
* Test class of HeterogeneousDB.
* Module 9 - Project 9
* @author Nathan Bradshaw - 202110 - COMP-1210-001
* @version 11/6/2020
*/

public class HeterogeneousDBTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Tests getCostFactor(). **/
   @Test public void testGetCostFactor() {
      HeterogeneousDB db4 = new HeterogeneousDB("Database Four", 
         2000, 7.5, 100, 14.0);
      Assert.assertEquals("Error", 1.3, db4.getCostFactor(), 0.00001);
   }
   
   /** Tests monthlyCost(). **/
   @Test public void testMonthlyCost() {
      HeterogeneousDB db4 = new HeterogeneousDB("Database Four", 
         2000, 7.5, 100, 14.0);
      Assert.assertEquals("Error", 3820.00, db4.monthlyCost(), 0.00001);
   }
   
   /** Tests toString(). */
   @Test public void testToString() {
      HeterogeneousDB db4 = new HeterogeneousDB("Database Four", 
         2000, 7.5, 100, 14.0);
      String info = db4.toString();
      Assert.assertTrue("Error", info.contains("Factor"));
   }
}
