package com.johnny.designprinciple.dependenceinversion;

/**
 * @author johnnyhao
 *
 * 依赖倒置原则
 * 要求客户端依赖于抽象耦合
 *
 * - 高层模块不应该依赖低层模块，二者都应该依赖其抽象
 * - 抽象不应该依赖细节，细节应该依赖抽象
 * - 依赖倒转(倒置)的中心思想是面向接口编程
 * - 依赖倒转原则是基于这样的设计理念：
 *   - 相对于细节的多变性，抽象的东西要稳定的多
 *   - 以抽象为基础搭建的架构比以细节为基础的架构要稳定的多
 *   - 在java中，抽象指的是接口或抽象类，细节就是具体的实现类
 * - 使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给他们的实现类去完成
 *
 * - 模块间的依赖通过抽象发生，实现类之间不发生直接的依赖关系，其依赖关系是通过接口或抽象类产生的
 * - 接口或抽象类不依赖实现类，实现类依赖接口或抽象类
 * - 采用依赖倒置原则可以减少类间的耦合性，提高系统的稳定，降低并行开发引起的风险，提高代码的可读性和可维护性
 *
 * 注意：
 * - 低层模块尽量都要有抽象类或接口，或者两者都有，程序稳定性更好
 * - 变量的声明类型尽量是抽象类或接口, 这样我们的变量引用和实际对象间，就存在一个缓冲层，利于程序扩展和优化
 * - 继承时遵循里氏替换原则
 */
public class DependenceInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

/**
 * 用户类
 *
 * - 这种方法简单，但是如果想要接收微信，短信等，同时Person也要增加相应的接收方法
 * - 引入一个抽象的接口IReceiver, 表示接收者, 这样Person类与接口IReceiver发生依赖
 *   因为Email, WeiXin等等属于接收的范围，他们各自实现IReceiver接口就可以, 这样我们就符合依赖倒转原则
 */
class Person {
    /**
     * 用户接收电子邮件
     * @param email 电子邮件
     */
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}

/**
 * 电子邮件类
 */
class Email {
    /**
     * 获取电子邮件信息
     * @return 电子邮件信息
     */
    public String getInfo() {
        return "电子邮件信息";
    }
}