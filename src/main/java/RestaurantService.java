import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName) throws restaurantNotFoundException {

        Restaurant searchResult = null;
        if (null != restaurants && !restaurants.isEmpty() ) {
            for (Restaurant restaurant: restaurants) {
                if (null != restaurantName && restaurantName.equalsIgnoreCase(restaurant.getName() )) {
                    searchResult = restaurant;
                }
            }
        }

        if (null != searchResult) {
            return searchResult;
        }else {
            throw new restaurantNotFoundException(restaurantName);
        }
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
