package com.johnny.designprinciple.simpleresponsibility;

/**
 * @author johnnyhao
 *
 * 单一职责原则
 */
public class SimpleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2  = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runWater("轮船");
        vehicle2.runAir("飞机");
    }
}

/**
 * 交通工具类
 *
 * 这种修改方法没有对原来的类做大的修改，只是增加方法
 * 这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责
 */
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路运行");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空运行");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中运行");
    }
}
