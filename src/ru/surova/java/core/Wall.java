package ru.surova.java.core;

public class Wall implements ObstacleInterface {

    private int height;

    public Wall(int height) {
        this.height = height;
    }


    @Override
    public boolean overcome(PlayerInterface player) {
        if (!player.isActive()){
            System.out.println(player.getName() + " is out");
            return false;
        }
        if (player.jump(height)) {
            System.out.println("Wall is jumped over by " + player.getName());
            return true;
        }
        System.out.println("Wall is not jumped over by " + player.getName());
        return false;
    }
}
