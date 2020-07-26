package com.heecoo.learn.java.heecooeffectivejava.buider;

/**
 * 创建者接口，定义创建功能；
 */
public interface Builder {
    //登记名字
    Builder registerFirstName(String firstName);
    //登记姓氏
    Builder registerLastName(String lastName);
    //测量身高
    Builder measureHeight(double height);
    //登记年龄
    Builder registerAge(int age);
    //测量体重（kg）
    Builder measureWeight(double weight);
    //测量折返跑速度
    Builder measureVelocity(double velocity);
    //测量握推重量
    Builder measureGripWeight(double gripWeight);
    //测量握推个数
    Builder measureGripNum(int gripNum);
    //测量中投命中率
    Builder measureCICHitRate(double CICHitRate);
    //测量三分球命中率
    Builder measureThreePointPercentage(double threePointPercentage);
    //测量臂展
    Builder measureArmSpan(double armSpan);

    //生成一个球探报告
    Player createPlayer();
}
