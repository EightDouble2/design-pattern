package com.johnny.designprinciple.simpleresponsibility;

/**
 * @author johnnyhao
 *
 * 单一职责原则
 */
public class SimpleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();

        airVehicle.run("飞机");
    }
}

/**
 * 交通工具类
 *
 * 根据交通工具运行方法不同，分解成不同类
 * 但是这样做的改动很大，即将类分解，同时修改客户端
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路运行");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空运行");
    }
}
