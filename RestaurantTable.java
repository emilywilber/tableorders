import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class RestaurantTable here.
 *
 * @author Emily Wilber
 * @version Feb 6, 2019
 */
public class RestaurantTable
{
    // list of all the table objects
    private Table[] allTables;

    /**
     * Constructor for objects of class RestaurantTable
     */
    public RestaurantTable()
    {

        allTables = new Table[5];
        for( int i=0; i<4; i++ )  {
            allTables[i] = new Table();
        }
    }

    /**
     * precondition:  0 <= tableNum < allTableslength and 
     *                foods.length == prices.length
     * postcondition: all of the foods and prices in the two paramets have 
     *                been added to the orders for allTables[tableNum]
     */
    public void placeTableOrders(int tableNum, String[] foods, double prices[])
    {
        Table t = allTables[tableNum];

        for (int i = 0; i < foods.length; i++) {
            t.placeOrder(foods[i], prices[i]);
            //allTables[tableNum].placeOrder(foods[i], prices[i]);
        }
    }
    
    /**
     * precondition:  0 <= tableNum < allTables.length
     * postcondition: returns the total bill for the table tableNum
     *                (the sum of the prices of the orders)
     */
    public double totalBill(int tableNum)
    {
        ArrayList<Double> priceList = allTables[tableNum].getPrices();
        double sum = 0;
        
        for (double d: priceList) {
            sum += d;
        }
        
        return sum;
    }
    
    /**
     * precondition:  0 <= tableNum < allTables.length
     * postcondition: returns the tip for table tableNum: 15% of the total bill
     *                if there are 6 or more orders for table tableNum,
     *                0.0 otherwise
     */
    public double computeTip(int tableNum) 
    {
        if (allTables[tableNum].getPrices().size() >= 6) {
            double bill = totalBill(tableNum);
            return bill * (double) 0.15;
        }
        return 0.0;
    }
    
}
