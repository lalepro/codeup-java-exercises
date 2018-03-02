public class RestaurantDish {

   private String nameOfDish;
   private double constInCents;
   private Boolean wouldRecommend;

    public RestaurantDish(String nameOfDish, double constInCents, Boolean wouldRecommend) {
        this.nameOfDish = nameOfDish;
        this.constInCents = constInCents;
        this.wouldRecommend = wouldRecommend;
    }

//    public RestaurantDish(String nameOfDish) {
//        this.nameOfDish = nameOfDish;
//    }



    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public double getConstInCents() {
        return constInCents;
    }

    public void setConstInCents(double constInCents) {
        this.constInCents = constInCents;
    }

    public Boolean getWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(Boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

//    public void String sayHello(){
//        return "Hello";
//    }

}
