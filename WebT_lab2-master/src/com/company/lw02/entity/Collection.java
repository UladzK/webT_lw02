package com.company.lw02.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 3/31/14
 * Time: 8:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Collection {
    private List<CollectionPart> parts  =  new ArrayList<CollectionPart>();

    public Collection(LiteralyWork work, CollectionFormat format){
        addPart(work);
        addPart(format);
    }

    public void addPart(CollectionPart p){
        parts.add(p);
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + ": " + this.parts;
    }

}
