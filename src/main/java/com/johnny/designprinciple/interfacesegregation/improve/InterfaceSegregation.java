package com.johnny.designprinciple.interfacesegregation.improve;

/**
 * @author johnnyhao
 *
 * 接口隔离原则
 */
public class InterfaceSegregation {
    public static void main(String[] args) {

        // class1通过接口去依赖(使用)Impl1类
        Class1 class1 = new Class1();
        class1.depend1(new Impl1());
        class1.depend2(new Impl1());

        // class2通过接口去依赖(使用)Impl2类
        Class2 class2 = new Class2();
        class2.depend1(new Impl2());
        class2.depend3(new Impl2());
    }
}

/**
 * 将接口分离成接口1，2，3
 *
 * 接口1
 */
interface Interface1 {
    /**
     * 方法1
     */
    void operation1();
}

/**
 * 接口2
 */
interface Interface2 {
    /**
     * 方法2
     */
    void operation2();
}

/**
 * 接口3
 */
interface Interface3 {
    /**
     * 方法3
     */
    void operation3();
}

class Impl1 implements Interface1, Interface2 {
    public void operation1() {
        System.out.println("Impl1 实现了 operation1");
    }
    public void operation2() {
        System.out.println("Impl1 实现了 operation2");
    }
}

class Impl2 implements Interface1, Interface3 {
    public void operation1() {
        System.out.println("Impl2 实现了 operation1");
    }
    public void operation3() {
        System.out.println("Impl2 实现了 operation3");
    }
}

/**
 * Class1类通过接口Interface依赖(使用)Impl1类
 */
class Class1 {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend2(Interface2 i) {
        i.operation2();
    }
}

/**
 * Class2类通过接口Interface依赖(使用)Impl2类
 */
class Class2 {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend3(Interface3 i) {
        i.operation3();
    }
}