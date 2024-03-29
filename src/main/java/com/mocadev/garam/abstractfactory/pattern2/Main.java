package com.mocadev.garam.abstractfactory.pattern2;

import com.mocadev.garam.abstractfactory.pattern2.concrete.FactoryInstance;
import com.mocadev.garam.abstractfactory.pattern2.factory.Button;
import com.mocadev.garam.abstractfactory.pattern2.factory.GuiFactory;
import com.mocadev.garam.abstractfactory.pattern2.factory.Textarea;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class Main {

    public static void main(String[] args) {
        GuiFactory factory = FactoryInstance.getFactory();
		assert factory != null;
		Button button = factory.createButton();
        Textarea textarea = factory.createTextarea();

        button.click();
        System.out.println("textarea.getText() = " + textarea.getText());
    }

}
