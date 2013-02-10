package priceperouncecheck;
import java.util.Scanner;

/**
 *
 * @author James Traver
 * james [at] codeforcoffee [dot] org
 * github.com/code-for-coffee
 * 
 * This software is released under the GPL License.
 * http://www.gnu.org/licenses/gpl.html
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
        
        // declare return data
        String whichIsBetterProduct = "";
        
        // return which product is the better buy
        return whichIsBetterProduct;
    }
    
    public static void main(String[] args) {
        final int ARRAY_LENGTH  = 2;
        double firstProduct[]   = new double[ARRAY_LENGTH];
        double secondProduct[]  = new double[ARRAY_LENGTH];
        String appName          = "PricePerOunceCheck";
        String appDescription   = "An app to find what is a better buy between price/Oz variations.";
        String appGuide[]       = { "Please enter the first product's price: ", 
                                    "Please enter the first product's weight: ",
                                    "Please enter the second product's price: ",
                                    "Please enter the second product's weight: " };
        
        System.out.println(appName + "\n" + appDescription);
        
        
    }
}
