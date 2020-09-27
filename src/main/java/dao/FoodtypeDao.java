package dao;
import models.Foodtype;
import java.util.List;

public interface FoodtypeDao {

    //create
    void add (Foodtype foodtype);
    //void addFoodtypeTpRestaurant(FoodtypeDao foodtypeDaO, Restaurant restaurant);

    //read
    List<Foodtype> getAll();
    // List<Restaurant> getAllRestaurantsForAFoodtype(int id);

    //update
    //omit for now

    //delete
    void deleteById(int id);
    void clearAll();
}
