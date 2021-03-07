package Strategy;

public class Party {
    private FoodAndLocation foodAndLocation;

    public FoodAndLocation getFoodAndLocation() {
        return foodAndLocation;
    }

    public void setFoodAndLocation(FoodAndLocation foodAndLocation) {
        this.foodAndLocation = foodAndLocation;
    }

    public void plan(){
        getFoodAndLocation().plan();
    }
}
