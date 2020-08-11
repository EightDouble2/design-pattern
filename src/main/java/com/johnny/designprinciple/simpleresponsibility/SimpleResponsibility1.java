package com.johnny.designprinciple.simpleresponsibility;

/**
 * @author johnnyhao
 *
 * 单一职责原则
 */
public class SimpleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

/**
 * 交通工具类
 *
 * run方法中，违反了单一职责原则
 * 需根据交通工具运行方法不同，分解成不同类
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路运行");
    }
}
