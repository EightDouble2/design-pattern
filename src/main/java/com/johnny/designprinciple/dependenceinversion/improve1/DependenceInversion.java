package com.johnny.designprinciple.dependenceinversion.improve1;

/**
 * @author johnnyhao
 *
 * 依赖倒置原则
 *
 * 接口传递方式
 */
public class DependenceInversion {

    public static void main(String[] args) {
        // 客户端无需改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

/**
 * 用户类
 */
class Person {
    /**
     * 用户接收信息
     * 使方法对信息接收接口进行依赖
     * @param iReceiver 信息接收接口
     */
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}

/**
 * 定义信息接收接口
 */
interface IReceiver {
    /**
     * 获取信息
     * @return 返回信息
     */
    String getInfo();
}

/**
 * 电子邮件类
 */
class Email implements IReceiver {
    /**
     * 获取电子邮件
     * @return 电子邮件信息
     */
    public String getInfo() {
        return "电子邮件信息";
    }
}

/**
 * 微信类
 */
class WeiXin implements IReceiver {
    /**
     * 获取微信
     * @return 微信信息
     */
    public String getInfo() {
        return "微信信息";
    }
}