package ru.surova.java.core;

public class Main {

    public static void main(String[] args) {

        PlayerInterface[] players = {
                new Human(1, 500),
                new Cat(3, 200),
                new Robot(5, 1500)
        };

        ObstacleInterface[] obstacles = {
                new Wall(2),
                new Track(1000)
        };

        for (int i = 0; i < obstacles.length; i++){
            for (int j = 0; j < players.length; j++){
                obstacles[i].overcome(players[j]);
            }
        }
    }
}
