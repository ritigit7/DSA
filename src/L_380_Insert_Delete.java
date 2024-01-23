import java.util.ArrayList;
import java.util.Random;

public class L_380_Insert_Delete {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        System.out.println(randomizedSet.insert(1));
        System.out.println(randomizedSet.remove(2));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.remove(1));
        System.out.println(randomizedSet.insert(2));
        System.out.println(randomizedSet.getRandom());
    }
}

class RandomizedSet {

    ArrayList<Integer> aList = new ArrayList<>();
    int i = 0;
    Random random = new Random();

    public RandomizedSet() {
    }

    public boolean insert(int val) {
        if (aList.contains(val)) {
            System.out.println(aList);
            return false;
        } else {
            aList.add(val);
            System.out.println(aList);
            return true;
        }
    }

    public boolean remove(int val) {
        if (aList.contains(val)) {
            aList.remove(aList.indexOf(val));
            System.out.println(aList);
            return true;
        } else {
            System.out.println(aList);
            return false;
        }
    }

    public int getRandom() {
        // if (i == aList.size()) {
        // i = 0;
        // return aList.get(i++);
        // } else {
        // return aList.get(i++);
        // }
        int randomIndex = random.nextInt(aList.size());
        return aList.get(randomIndex);
    }
}