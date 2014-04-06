package com.company.lw02.builder;
import com.company.lw02.customExceptions.ParamsException;
import com.company.lw02.factory.*;
import com.company.lw02.entity.*;
import com.company.lw02.transfer.*;
/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 3/31/14
 * Time: 8:13 PM
 * To change this template use File | Settings | File Templates.
 */

public class Builder {
    private CollectionFormatFactory formatFactory;
    private LiteralyWorkFactory workFactory;

    public Builder(){
        formatFactory = new CollectionFormatFactory();
        workFactory = new LiteralyWorkFactory();
    }

    public Collection buildCollection(BuilderTO to) {
        try {
            //validating user input
            if (to.getWork() == null || to.getType() == null)
                throw new ParamsException();
            else
                return new Collection(buildWork(to.getWork()), buildFormat(to.getType()));
        }
        catch (ParamsException e){
           return null;
        }
    }

    private CollectionFormat buildFormat(CollectionFormatTO to) {
        return formatFactory.getCollectionFormat(to);
    }

    private LiteralyWork buildWork(LiteralyWorkTO to) {
        return workFactory.getLiterallyWork(to);
    }


}