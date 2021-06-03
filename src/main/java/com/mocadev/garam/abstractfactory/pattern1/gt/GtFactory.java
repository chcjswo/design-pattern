package com.mocadev.garam.abstractfactory.pattern1.gt;

import com.mocadev.garam.abstractfactory.pattern1.factory.BikeFactory;
import com.mocadev.garam.abstractfactory.pattern1.factory.Body;
import com.mocadev.garam.abstractfactory.pattern1.factory.Wheel;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-31
 **/
public class GtFactory implements BikeFactory {
    @Override
    public Body createBody() {
        return new GtBody();
    }

    @Override
    public Wheel createWheel() {
        return new GtWheel();
    }
}
