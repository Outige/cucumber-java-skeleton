package io.cucumber.skeleton;
import io.cucumber.skeleton.*;

public class CucumberPerson {
    private int foodInBelly;
    private int drinksInBelly;

    CucumberPerson() {
        this.foodInBelly = 0;
    }

    public int eat(int cukes) {
        if (cukes < 0) return 1;
        this.foodInBelly = cukes;
        return 0;
    }

    public int drink(int drinks) {
        if (drinks < 0) return 1;
        this.drinksInBelly = drinks;
        return 0;
    }
    
    public int wait(int waitTime) {
        if (waitTime < 0) {
            return 1;
        }
        this.foodInBelly -= waitTime*5;
        this.drinksInBelly -= (int) waitTime*0.5;
        if (this.foodInBelly < 0) this.foodInBelly = 0;
        return 0;
    }

    public boolean growl() {
        if (this.foodInBelly > 0) return true;
        return false;
    }

    public boolean burp() {
        if (this.drinksInBelly > 0) return true;
        return false;
    }

    public boolean sick() {
        return this.foodInBelly >= 100 || this.drinksInBelly >= 100;
    }
}