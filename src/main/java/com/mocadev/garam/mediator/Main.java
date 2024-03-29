package com.mocadev.garam.mediator;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-06-02
 **/
public class Main {

    public static void main(String[] args) {
        Mediator mediator = new ChatMediator();

        Colleague colleague1 = new ChatColleague();
        Colleague colleague2 = new ChatColleague();
        Colleague colleague3 = new ChatColleague();

        colleague1.join(mediator);
        colleague2.join(mediator);
        colleague3.join(mediator);

        colleague1.sendData("AAA");
        colleague2.sendData("BBB");
        colleague3.sendData("CCC");
    }

}
