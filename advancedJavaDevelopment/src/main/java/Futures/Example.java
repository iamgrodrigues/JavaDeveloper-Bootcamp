package Futures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Example {
    private static final ExecutorService peopleToPerformChore = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Home home = new Home(new Bedroom());
        List<Future<String>> futures =
        new CopyOnWriteArrayList<>(home.getHouseholdChores().stream()
                .map(chore -> peopleToPerformChore.submit(() -> {
                        try {
                            return chore.perform();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        return null;
                    })
                )
                .collect(Collectors.toList()));

        while (true) {
            int choresToBeDone = 0;
            for (Future<?> future : futures) {
                if (future.isDone()){
                    try {
                        System.out.println("Congratulation you've done the chore: " + future.get());
                        futures.remove(future);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }else {
                    choresToBeDone++;
                }
            }if (futures.stream().allMatch(Future::isDone)){
                break;
            }
            System.out.println("Chores to be done :: " + choresToBeDone);
            Thread.sleep(500);
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
    String perform() throws InterruptedException;
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

    private String foldClothes() throws InterruptedException {
        Thread.sleep(3000);
        String foldClothes = "Fold the clothes";
        System.out.println(foldClothes);
        return foldClothes;
    }

    private String cleanBedroom() throws InterruptedException {
        Thread.sleep(5000);
        String cleanBedroom = "Clean the Bedroom";
        System.out.println(cleanBedroom);
        return cleanBedroom;
    }

    private String makeBed() throws InterruptedException {
        Thread.sleep(10000);
        String makeBed = "Make the bed";
        System.out.println(makeBed);
        return makeBed;
    }
}