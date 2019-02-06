import java.util.List;
import java.util.ArrayList;
/**
 * makes a table
 * 
 * @author Emily Wilber
 * @version Feb 6, 2019
 */
public class Table
{
    // a lits of strings, one for each person at this table
    private ArrayList<String> foods;
    // a lits of doubles, one for each person at this table
    private ArrayList<Double> prices;
    /**
     * Constructor for objects of class Table
     */
    public Table()
    {
        foods = new ArrayList<String>();
        prices = new ArrayList<Double>();
    }

    /**
     * Places an order for one table
     */
    public void placeOrder(String food, Double price)
    {
        foods.add(food);
        prices.add(price);
    }
    
    /**
     * makes foods accessible
     */
    public ArrayList<String> getFoods()
    {
        return foods;
    }
    
    /**
     * makes prices available
     */
    public ArrayList<Double> getPrices()
    {
        return prices;
    }
}
