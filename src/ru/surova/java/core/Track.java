package ru.surova.java.core;

public class Track implements ObstacleInterface {

    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(PlayerInterface player) {
        if (!player.isActive()){
            System.out.println(player.getName() + " is out");
            return false;
        }
        if (player.run(length)){
            System.out.println("Track is run through by " + player.getName());
            return true;
        }
        System.out.println("Track is not run through by " + player.getName());
        return false;
    }
}
