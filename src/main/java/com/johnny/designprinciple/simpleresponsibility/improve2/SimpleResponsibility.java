package com.johnny.designprinciple.simpleresponsibility.improve2;

/**
 * @author johnnyhao
 *
 * 单一职责原则
 */
public class SimpleResponsibility {

    public static void main(String[] args) {
        Vehicle vehicle  = new Vehicle();
        vehicle.run("汽车");
        vehicle.runWater("轮船");
        vehicle.runAir("飞机");
    }
}

/**
 * 交通工具类
 *
 * 这种修改方法没有对原来的类做大的修改，只是增加方法
 * 这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责
 */
class Vehicle {
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
