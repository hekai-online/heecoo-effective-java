package com.heecoo.learn.java.heecooeffectivejava.singleton;

/**
 * 学习枚举类的特性
 * note:
 * 枚举类可以实现一个或多个接口，使用enum定义的枚举类默认继承了java.lang.Enum类，而不是默认继承Object类，因此枚举类不能显示继承其他父类。其中java.lang.Enum类实现了java.lang.Serializable和java.lang.Comparable两个接口。
 * 使用enum定义、非抽象的枚举类默认会使用final修饰，因此枚举类不能派生子类。
 * 枚举类的构造器只能使用private访问控制符，如果省略了构造器的访问控制符，则默认使用private修饰；如果强制指定访问控制符，则只能指定private修饰符。
 * 枚举类的所有实例必须在枚举类的第一行显式列出，否则这个枚举类永远都不能产生实例。列出这些实例时，系统会自动添加public static final 修饰，无须程序员显式添加。
 * 枚举类默认提供了一个values()方法，该方法可以很方便地遍历所有的枚举值
 *
 * @author heecoo
 * @since 2020/07/28
 */
public enum DayEnum {
    MONDAY(1,"星期一"),
    TUESDAY(2,"星期二"),
    WEDNESDAY(3,"星期三"),
    THURSDAY(4,"星期四"),
    FRIDAY(5,"星期五"),
    SATURDAY(6,"星期六"),
    SUNDAY(7,"星期天");
    private int code;
    private String msg;
    private DayEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
    public int getCode(){
        return code;
    }
    public String getMsg(){
        return msg;
    }

    public static void main(String[] args) {
        System.out.println(DayEnum.FRIDAY.getMsg()+"-"+DayEnum.FRIDAY.getCode());
    }
}
