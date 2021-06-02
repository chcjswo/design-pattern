package garam.factorymethod.concrete;

import garam.factorymethod.framework.Item;
import garam.factorymethod.framework.ItemCreator;
import java.time.LocalDateTime;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-05-28
 **/
public class MpCreator extends ItemCreator {

    @Override
    protected void requestItemInfo() {
        System.out.println("데이터베이스에서 마력 회복 물약 정보 조회");
    }

    @Override
    protected void createItemLog() {
        System.out.println("마력 회복 물약 새로 생성 " + LocalDateTime.now());
    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }

}
