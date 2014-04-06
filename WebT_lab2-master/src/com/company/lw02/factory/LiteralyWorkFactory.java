package com.company.lw02.factory;
import com.company.lw02.entity.*;
import com.company.lw02.content.*;
import com.company.lw02.transfer.*;
/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 3/31/14
 * Time: 10:21 PM
 * To change this template use File | Settings | File Templates.
 */

public class LiteralyWorkFactory {

    public LiteralyWorkFactory() { }

    public LiteralyWork getLiterallyWork(LiteralyWorkTO to) {
        if (to.getWork() == Work.Story) {
            return new Story(to.getAuthor(), to.getName(), to.getGenre());
        } else if (to.getWork() == Work.Verse) {
            return new Verse(to.getAuthor(), to.getName(), to.getSize());
        }
        return null;
    }
}
