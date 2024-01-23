public class L_2353_Design_Food_Rating_System {
    public static void main(String[] args) {
        String[] foods = { "kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi" };
        String[] cuisines = { "korean", "japanese", "japanese", "greek", "japanese",
                "korean" };
        int[] ratings = { 9, 12, 8, 15, 14, 7 };
        FoodRatings foodRatings = new FoodRatings(foods, cuisines, ratings);
        // foodRatings.changeRating("sushi", 16);
        // System.out.println(foodRatings.highestRated("japanese"));
        System.out.println(foodRatings.highestRated("korean"));
        System.out.println(foodRatings.highestRated("japanese"));
        foodRatings.changeRating("sushi", 16);
        System.out.println(foodRatings.highestRated("japanese"));
        foodRatings.changeRating("ramen", 16);
        System.out.println(foodRatings.highestRated("japanese"));
    }
}

class FoodRatings {

    String[] fds, cisn;
    int[] rtng;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        fds = foods;
        cisn = cuisines;
        rtng = ratings;
    }

    public void changeRating(String food, int newRating) {
        int findex = 0;
        for (String f : fds) {
            if (f == food) {
                rtng[findex] = newRating;
                break;
            }
            findex++;
        }
        for (int in : rtng) {
            System.out.print(in);
        }
        System.out.println();
    }

    public String highestRated(String cuisine) {
        int max = 0;
        int length = cisn.length;
        for (int i = 0; i < length; i++) {
            if (cuisine == cisn[i] && max < rtng[i]) {
                max = i;
            }
        }
        return fds[max];
    }
}