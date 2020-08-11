package com.johnny.designprinciple.simpleresponsibility;

/**
 * @author johnnyhao
 *
 * 单一职责原则
 * 就一个类而言，应该仅有一个引起它变化的原因，如果你能想到多于一个的动机去改变一个类，那么这个类就具有多于一个的职责
 * 应该把多于的指责分离出去，分别再创建一些类来完成每一个职责
 *
 * - 降低类的复杂度，一个类只负责一项职责。
 * - 提高类的可读性，可维护性
 * - 降低变更引起的风险
 * - 通常情况下，我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违反单一职责原则；只有类中方法数量足够少，可以在方法级别保持单一职责原则
 */
public class SimpleResponsibility {

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
