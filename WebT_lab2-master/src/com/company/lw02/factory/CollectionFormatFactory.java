package com.company.lw02.factory;
import com.company.lw02.entity.*;
import com.company.lw02.content.*;
import com.company.lw02.transfer.*;
/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 3/31/14
 * Time: 10:25 PM
 * To change this template use File | Settings | File Templates.
 */

public class CollectionFormatFactory {

    public CollectionFormatFactory() {  }

    public CollectionFormat getCollectionFormat(CollectionFormatTO to) {
        if (to.getType() == Type.Book) {
            return new Book(to.getTitle(), to.withHardCover());
        } else if (to.getType() == Type.Magazine) {
            return new Magazine(to.getTitle(), to.isTarnish());
        }
        return null;
    }
}