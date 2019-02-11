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
        String[] foods1 = {"Beesechurger", "Water", "Turkish Delight"};
        double[] prices1 = {700.99, 90.50, 13.10};
        String[] foods2 = {"Apple Cake", "Banana Cake", "Carrot Cake", "Date Cake", 
        "Egg Cream", "Fig Cake"};
        double[] prices2 = {10.0, 20.0, 30.0, 40.0, 50.0, 60.0};
        double total1;
        double total2;
        total1 = prices1[0]+prices1[1]+prices1[2];
        total2 = prices2[0]+prices2[1]+prices2[2]+prices2[3]+prices2[4]+prices2[5];
        
        RestaurantTable restaurantTables = new RestaurantTable(); 
        restaurantTables.placeTableOrders(0, foods1, prices1);
        restaurantTables.placeTableOrders(1, foods2, prices2);
        
        System.out.println("Total bill for T1 should be " + total1);
        System.out.println("Total bill for T1 = " + restaurantTables.totalBill(0));
        System.out.println("Tip for T1 = " + restaurantTables.computeTip(0));
        System.out.println("Total bill for T2 should be " + total2);
        System.out.println("Total bill for T2 = " + restaurantTables.totalBill(1));
        System.out.println("Tip for T2 should be " + total2 * 0.15);
        System.out.println("Tip for T2 = " + restaurantTables.computeTip(1));

    }
    
    
}
