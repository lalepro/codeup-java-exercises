import java.util.Random;

public class ServerNameGenerator {
    static final String[] adjectives = {"delicious", "fresh", "hot", "melted", "prickly", "rotten", "sticky", "sweet", "tart", "juicy"};
    static final String[] noun = {"pizza", "fries", "tofu", "cauliflower", "mac n cheese", "fried pickles", "bbq", "oatmeal", "grapes", "rice"};


    public static void main(String[] args) {
        System.out.println(randomElement());
    }


//    int randomAdjectives = (int) Math.floor(Math.random() * 100);
//    String[] adjectives = new adjectives[randomAdjectives];
public static int randomElement() {
    Random random = new Random();
    int index = random.nextInt(adjectives.length) + random.nextInt(noun.length);
    System.out.println(adjectives[index] + " - " + noun[index]);
    return 0;
}


}


