package io.cucumber.skeleton;

public class Belly {
    public int eat(int cukes) {
        if (cukes < 0) return 1;
        return 0;
    }
    
    public int wait(int waitTime) {
        if (waitTime < 0) return 1;
        return 0;
    }

    public void growl() {

    }
}
