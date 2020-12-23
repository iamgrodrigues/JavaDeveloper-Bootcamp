package Threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class FutureExample {

    private static final ExecutorService peopleToPerformChore = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {

        Home home = new Home(new Bedroom());
        List<? extends Future<?>> collect = home.getHouseholdChores().stream()
                .map(chore -> peopleToPerformChore.submit(() -> chore.perform()))
                .collect(Collectors.toList());

        while (true) {

        }
        peopleToPerformChore.shutdown();
    }
}

class Home {
    private List<Room> rooms;

    Home(Room... rooms) {

        this.rooms = Arrays.asList(rooms);
    }

    List<Chore> getHouseholdChores() {

        return this.rooms.stream().map(Room::getRoomChores)
                .reduce(new ArrayList<Chore>(), (pivot, chores) -> {
                    pivot.addAll(chores);
                    return pivot;
                });
    }
}

interface Chore {

    void perform();
}

abstract class Room {

    abstract List<Chore> getRoomChores();
}

class Bedroom extends Room {

    @Override
    List<Chore> getRoomChores() {


//        /* can also be declared as below */
//        ArrayList<Chore> objects = new ArrayList<>();
//
//        objects.add(this::foldClothes);
//        objects.add(this::cleanBedroom);
//        objects.add(this::makeBed);
//
//        /*Or like this*/
//        objects.add(() -> this.foldClothes());
//        objects.add(() -> this.cleanBedroom());
//        objects.add(() -> this.makeBed());

        return Arrays.asList(
                this::foldClothes,
                this::cleanBedroom,
                this::makeBed
        );
    }

    private void foldClothes() {
        System.out.println("Fold the clothes");
    }

    private void cleanBedroom() {
        System.out.println("Clean the bedroom");
    }

    private void makeBed() {
        System.out.println("Make the bed");
    }
}