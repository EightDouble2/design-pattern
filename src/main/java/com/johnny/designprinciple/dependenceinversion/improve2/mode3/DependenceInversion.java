package com.johnny.designprinciple.dependenceinversion.improve2.mode3;

/**
 * @author johnnyhao
 *
 * 依赖倒置原则
 *
 * setter方法
 */
public class DependenceInversion {

    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
		OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
		openAndClose.open();
    }
}

/**
 * 方式2：通过setter方法传递
 * 开关的接口
 */
interface IOpenAndClose {
    /**
     * 抽象方法
     */
    void open();

    /**
     * 抽象方法
     * @param tv 接收参数
     */
    void setTv(Itv tv);
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
 * 实现IOpenAndClose接口
 */
class OpenAndClose implements IOpenAndClose {
    /**
     * 成员变量
     */
    private Itv tv;

    /**
     * setter方法
     */
    public void setTv(Itv tv) {
        this.tv = tv;
    }

    /**
     * 实现open方法
     */
    public void open() {
        this.tv.play();
    }
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