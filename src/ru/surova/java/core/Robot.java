package ru.surova.java.core;

public class Robot implements PlayerInterface {

    private int jumpLimit;
    private int runLimit;
    private boolean isActive = true;

    public Robot(int jumpLimit, int runLimit) {
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
        return "Robot";
    }

    @Override
    public boolean isActive() {
        return isActive;
    }
}
