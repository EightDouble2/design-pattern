package com.johnny.designprinciple.interfacesegregation;

/**
 * @author johnnyhao
 *
 * 接口隔离原则
 * 一个类对另外一个类的依赖是建立在最小的接口上
 *
 * - 类Class1通过接口Interface依赖类Impl1，类Class2通过接口Interface依赖类Impl2，如果接口Interface对于类Class1和类Class2来说不是最小接口，那么类Impl1和类Impl2必须去实现他们不需要的方法
 * - 将接口Interface拆分为独立的几个接口，类Class1和类Class2分别与他们需要的接口建立依赖关系，也就是采用接口隔离原则
 */
public class InterfaceSegregation {
    public static void main(String[] args) {

        // class1通过接口去依赖(使用)Impl1类，但只使用1，2方法
        Class1 class1 = new Class1();
        class1.depend1(new Impl1());
        class1.depend2(new Impl1());

        // class2通过接口去依赖(使用)Impl2类，但只使用1，3方法
        Class2 class2 = new Class2();
        class2.depend1(new Impl2());
        class2.depend3(new Impl2());
    }
}

/**
 * 接口
 */
interface Interface {
    /**
     * 方法1
     */
    void operation1();
    /**
     * 方法2
     */
    void operation2();
    /**
     * 方法3
     */
    void operation3();
}

class Impl1 implements Interface {
    public void operation1() {
        System.out.println("Impl1 实现了 operation1");
    }
    public void operation2() {
        System.out.println("Impl1 实现了 operation2");
    }
    public void operation3() {
        System.out.println("Impl1 实现了 operation3");
    }
}

class Impl2 implements Interface {
    public void operation1() {
        System.out.println("Impl2 实现了 operation1");
    }
    public void operation2() {
        System.out.println("Impl2 实现了 operation2");
    }
    public void operation3() {
        System.out.println("Impl2 实现了 operation3");
    }
}

/**
 * Class1类通过接口Interface依赖(使用)Impl1类，但是只会用到1,2方法
 */
class Class1 {
    public void depend1(Interface i) {
        i.operation1();
    }
    public void depend2(Interface i) {
        i.operation2();
    }
}

/**
 * Class2类通过接口Interface依赖(使用)Impl2类，但是只会用到1,3方法
 */
class Class2 {
    public void depend1(Interface i) {
        i.operation1();
    }
    public void depend3(Interface i) {
        i.operation3();
    }
}