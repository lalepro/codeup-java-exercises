public class RestaurantTest {

    public static void main(String[] args) {
//
//        RestaurantDish dish = new RestaurantDish();
//        dish.nameOfDish = "Butter Chicken";
//        dish.constInCents = 5.0;
//        dish.wouldRecommend = true;
//        System.out.println(dish.eat() + dish.constInCents);
//
//        RestaurantDish dish1 = new RestaurantDish();
//        dish1.nameOfDish = "Soup";
//        dish1.constInCents = 3.0;
//        dish1.wouldRecommend = false;
//
//
//        RestaurantDish dish2 = new RestaurantDish();
//        dish2.nameOfDish = "PBJ";
//        dish2.constInCents = 1.0;
//        dish2.wouldRecommend = true;

       RestaurantDish dish = new RestaurantDish("Butter Chicken",5.0, true);
        System.out.println(dish.getNameOfDish() + dish.getWouldRecommend());

        dish.setNameOfDish("Butter Chickens");
        dish.setConstInCents(50.0);
        dish.setWouldRecommend(true);
        System.out.println("Best Dish Ever: " + dish.getNameOfDish() + "\n Costs: " + dish.getConstInCents() + "\n You'll love it: " + dish.getWouldRecommend());




//
    }


}
