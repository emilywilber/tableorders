import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * tester
 *
 * @author Emily Wilber
 * @version Feb 6, 2019
 */
public class Tester
{
    public static void main(String[] args)
    {
        //small table 
        Arrays foods1 = {"Beesechurger", "Water", "Turkish Delight"};
        Arrays prices1 = {700.99, 90.50, 13.10};
        placeTableOrders(0, foods1, prices1);
        System.out.println(totalBill(0));
        
    }
    
    
}
