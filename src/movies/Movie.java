package movies;
public class Movie {
    private String name;
    private String category;
    private int rating;
    public Movie(String title, String category) {
        this.name = title;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

//    public String toString(){
//        return String.format(
//                "<Movie Title: "+ name + " " +
//                "Category : " + category +
//                this.getName();
//                this.getCategory();
//        )
//    }


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}



