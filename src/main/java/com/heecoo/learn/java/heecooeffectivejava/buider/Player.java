package com.heecoo.learn.java.heecooeffectivejava.buider;

/**
 * 声明一个运动员
 */
public class Player {
    private String firstName;//名字
    private String lastName;//姓氏
    private double height;//身高
    private int age;//年龄
    private double weight;//体重（kg）
    private double velocity;//折返跑速度
    private double gripWeight;//握推重量
    private double gripNum;//握推个数
    private double CICHitRate;//中投命中率
    private double threePointPercentage;//三分球命中率
    private double armSpan;//臂展

    public Player() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getGripWeight() {
        return gripWeight;
    }

    public void setGripWeight(double gripWeight) {
        this.gripWeight = gripWeight;
    }

    public double getGripNum() {
        return gripNum;
    }

    public void setGripNum(double gripNum) {
        this.gripNum = gripNum;
    }

    public double getCICHitRate() {
        return CICHitRate;
    }

    public void setCICHitRate(double CICHitRate) {
        this.CICHitRate = CICHitRate;
    }

    public double getThreePointPercentage() {
        return threePointPercentage;
    }

    public void setThreePointPercentage(double threePointPercentage) {
        this.threePointPercentage = threePointPercentage;
    }

    public double getArmSpan() {
        return armSpan;
    }

    public void setArmSpan(double armSpan) {
        this.armSpan = armSpan;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                ", age=" + age +
                ", weight=" + weight +
                ", velocity=" + velocity +
                ", gripWeight=" + gripWeight +
                ", gripNum=" + gripNum +
                ", CICHitRate=" + CICHitRate +
                ", threePointPercentage=" + threePointPercentage +
                ", armSpan=" + armSpan +
                '}';
    }

}
