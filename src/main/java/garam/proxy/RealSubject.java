package garam.proxy;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public class RealSubject implements Subject {
    @Override
    public void action1() {
        System.out.println("간단한 업무 by real");
    }

    @Override
    public void action2() {
        System.out.println("복잡한 업무 by real");
    }
}
