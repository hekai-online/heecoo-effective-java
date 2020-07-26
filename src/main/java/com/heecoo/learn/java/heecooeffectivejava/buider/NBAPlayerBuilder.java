package com.heecoo.learn.java.heecooeffectivejava.buider;

/**
 * NBA球探
 */
public class NBAPlayerBuilder implements Builder {

    private Player player = new Player();

    public Builder registerFirstName(String firstName) {
        player.setFirstName(firstName);
        return this;
    }

    public Builder registerLastName(String lastName) {
        player.setLastName(lastName);
        return this;
    }

    public Builder measureHeight(double height) {
        player.setHeight(height);
        return this;
    }

    public Builder registerAge(int age) {
        player.setAge(age);
        return this;
    }

    public Builder measureWeight(double weight) {
        player.setWeight(weight);
        return this;
    }

    public Builder measureVelocity(double velocity) {
        player.setVelocity(velocity);
        return this;
    }

    public Builder measureGripWeight(double gripWeight) {
        player.setGripWeight(gripWeight);
        return this;
    }

    public Builder measureGripNum(int gripNum) {
        player.setGripNum(gripNum);
        return this;
    }

    public Builder measureCICHitRate(double CICHitRate) {
        player.setCICHitRate(CICHitRate);
        return this;
    }

    public Builder measureThreePointPercentage(double threePointPercentage) {
        player.setThreePointPercentage(threePointPercentage);
        return this;
    }

    public Builder measureArmSpan(double armSpan) {
        player.setArmSpan(armSpan);
        return this;
    }

    public Player createPlayer() {
        return player;
    }
}
