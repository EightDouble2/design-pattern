package com.johnny.designprinciple.dependenceinversion.improve2.mode1;

/**
 * @author johnnyhao
 *
 * 依赖倒置原则
 *
 * 接口传递方式
 */
public class DependenceInversion {

    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
		OpenAndClose openAndClose = new OpenAndClose();
		openAndClose.open(changHong);
    }
}

/**
 * 方式1：通过接口传递实现依赖
 * 开关的接口
 */
interface IOpenAndClose {
    /**
     * 抽象方法，接收接口
     * @param tv 接收参数
     */
    void open(Itv tv);
}

/**
 * Itv接口
 */
interface Itv {
    /**
     * 抽象方法
     */
    void play();
}

/**
 * 实现Itv接口
 */
class ChangHong implements Itv {
    /**
     * 实现play方法
     */
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}

/**
 * 实现IOpenAndClose接口
 */
class OpenAndClose implements IOpenAndClose{
    /**
     * 实现open方法
     */
    public void open(Itv tv){
        tv.play();
    }
}