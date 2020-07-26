package com.heecoo.learn.java.heecooeffectivejava.buider;

public class Test {

    public static void main(String[] args) {
        NBAPlayerBuilder nbaPlayerBuilder = new NBAPlayerBuilder();
        Player player = nbaPlayerBuilder
                .registerFirstName("kyrie")
                .registerLastName("irving")
                .registerAge(26)
                .measureArmSpan(2)
                .measureCICHitRate(0.65)
                .measureGripNum(120)
                .measureGripWeight(110)
                .measureHeight(192)
                .measureThreePointPercentage(0.55)
                .measureVelocity(4.3)
                .measureWeight(86)
                .createPlayer();
        System.out.println(player.toString());

    }
}
