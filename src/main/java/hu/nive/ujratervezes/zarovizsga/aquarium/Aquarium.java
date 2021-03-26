package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Aquarium {

    private List<Fish> fishList = new ArrayList<>();


    public List<String> getStatus() {
        List<String> statusList = new ArrayList<>();
        for (Fish item:fishList) {
            statusList.add(item.status());
        }
        return statusList;
    }

    public void addFish(Fish fish) {
        fishList.add(fish);
    }

    public void removeFish() {
        Iterator<Fish> it = fishList.iterator();
        while (it.hasNext()) {
            Fish fish = it.next();
            if (fish.getWeight() >= 11) {
                it.remove();
            }
        }
    }

    public void feed() {
        for (Fish item: fishList) {
            item.feed();
        }
    }
}
