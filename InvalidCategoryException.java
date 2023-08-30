/**
* Class of InvalidCategoryException.
* Module 11 - Project 11
* @author Nathan Bradshaw - 202110 - COMP-1210-001
* @version 11/20/2020
*/
public class InvalidCategoryException extends Exception {
   
   /** Constructor to accept category.
   * @param categoryIn Category to be set. */
   public InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}