import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MenuService {

   private static Map<String, ArrayList<Item>> restaurantMenuMap = new HashMap<String, ArrayList<Item>>();

   static {

       Item aalooParattha = new Item("Aloo Paratha", 60);
       Item dal = new Item("Dal", 100);
       Item gobiParatha = new Item("Gobi Paratha", 65);
       Item chilliPaneer = new Item("Chilly Paneer", 130);

       ArrayList<Item> vegMenu1= new ArrayList<>();
       vegMenu1.add(aalooParattha);
       vegMenu1.add(dal);
       vegMenu1.add(gobiParatha);
       vegMenu1.add(chilliPaneer);
       restaurantMenuMap.put("Urban Paratha", vegMenu1);


       Item chicken = new Item("Chicken Curry", 160);
       Item chickenBiriyani = new Item("Chicken Biriyani", 200);
       Item eggMasala = new Item("Egg Masala", 65);
       Item kadaiChicken = new Item("Kadai Chicken", 215);

       ArrayList<Item> nonVegMenu1= new ArrayList<>();
       vegMenu1.add(chicken);
       vegMenu1.add(chickenBiriyani);
       vegMenu1.add(eggMasala);
       vegMenu1.add(kadaiChicken);
       restaurantMenuMap.put("Urban Biriyani", nonVegMenu1);
   }

   public static ArrayList<Item> getMenuByRestaurantName(String restaurantName) {
       if (null != restaurantName) {
           return restaurantMenuMap.get(restaurantName);
       }
       return null;
   }

}
