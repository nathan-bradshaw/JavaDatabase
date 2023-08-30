import java.util.Comparator;
/**
* Class of MonthlyCostComparator.
* Module 10 - Project 10
* @author Nathan Bradshaw - 202110 - COMP-1210-001
* @version 11/13/2020
*/
public class MonthlyCostComparator implements Comparator<DB> {
   /** Comapres two DB objects by monthly cost.
   * @param d1 First object.
   * @param d2 Second object.
   * @return Returns the result. */
   public int compare(DB d1, DB d2) {
      if (d1.monthlyCost() > d2.monthlyCost()) {
         return -1;
      }
      else if (d1.monthlyCost() < d2.monthlyCost()) {
         return 1;
      }
      else {
         return 0;
      }
   }
}