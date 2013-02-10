package priceperouncecheck;
import java.util.Scanner;

/**
 *
 * @author james [at] codeforcoffee [dot] org
 * github.com/code-for-coffee
 * 
 * This software is released under the GPL License.
 * http://www.gnu.org/licenses/gpl.html
 * 
 * 
 */

public class PricePerOunceCheck {

    /*
     * This application is designed to allow a user to enter:
     * 1 product's price and ounce and another product's price OR ounce
     * It will then alert the user as to which is the better buy.
     */
    
    public static String RatioCalculate(double firstProductPrice, 
                                        double firstProductOunce, 
                                        double secondProductPrice, 
                                        double secondProductOunce) {
        /* 
         * @params firstProductPrice is the price of the first product
         * @params firstProductOunce are how many ounces are in the first product
         * @params secondProductPrice is the price of the first product
         * @params secondProductOunce are how many ounces are in the first product
         */
        
        // declare variables to be used in RatioCalculate()
        String whichIsBetterProduct[] = { "First Product with a price of $ ",
                                          "Second Product with a price of $ " };
        double firstProduct           = firstProductPrice / firstProductOunce;
        double secondProduct          = secondProductPrice / secondProductOunce;
        
        if (firstProduct < secondProduct) {
            return whichIsBetterProduct[0] + firstProductPrice;
        } else {
            return whichIsBetterProduct[1] + secondProductPrice;
        }
    }
    
    public static void main(String[] args) {
        
        // define variables to be used in main()
        final int ARRAY_LENGTH  = 4;
        double productData[]    = new double[ARRAY_LENGTH];
        String appName          = "PricePerOunceCheck";
        String appDescription   = "An app to find what is a better buy between price/Oz variations.";
        String appGuide[]       = { "Please enter the first product's price: ", 
                                    "Please enter the first product's weight: ",
                                    "Please enter the second product's price: ",
                                    "Please enter the second product's weight: " };
        String appResults[]     = { "We've done the math! The better buy is the one that costs ",
                                    "Thank you for using this app!" };
        String appError         = "You did not enter a number. Please re-run this application and enter valid data.";
        String yourResult       = null;
        Scanner userInput       = new Scanner(System.in);       
        
        // output to user & gather data
        System.out.println(appName + "\n" + appDescription);
        
        // run a loop to gather this data
        for (int i = 0; i < ARRAY_LENGTH; i++) {
           System.out.println(appGuide[i]);
           if(!userInput.hasNextDouble()){            
               System.out.println(appError);
               System.exit(0);
           } else {
               productData[i] = userInput.nextDouble();
           }           
        }    
        
        /* 
         * this is included just for testing to make sure valid data was entered
        
        * for (double element : productInput) {
            System.out.println(element);
        }
        * 
        */
        
        // now, let's actually run the calculation and give the user their result
        yourResult = RatioCalculate(productData[0], productData[1], productData[2], productData[3]);
        System.out.print(appResults[0] + ": \n" + yourResult);
        System.out.println(appResults[1]);
        System.exit(0);
    }
}
