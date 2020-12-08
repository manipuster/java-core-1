package ru.surova.java.core;

public class Cat implements PlayerInterface {

    private int jumpLimit;
    private int runLimit;
    private boolean isActive = true;

    public Cat(int jumpLimit, int runLimit) {
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }


    @Override
    public boolean run(int length) {
        if (runLimit >= length){
            return true;
        }
        isActive = false;
        return false;
    }

    @Override
    public boolean jump(int height) {
        if (jumpLimit >= height){
            return true;
        }
        isActive = false;
        return false;
    }

    @Override
    public String getName() {
        return "Cat";
    }

    @Override
    public boolean isActive() {
        return isActive;
    }
}
