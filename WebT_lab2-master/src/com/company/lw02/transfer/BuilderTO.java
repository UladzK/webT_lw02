package com.company.lw02.transfer;

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 3/31/14
 * Time: 10:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class BuilderTO {
    private CollectionFormatTO type;
    private LiteralyWorkTO work;

    public BuilderTO() {    }

    public BuilderTO(CollectionFormatTO type, LiteralyWorkTO work) {
        this.type = type;
        this.work = work;
    }

    public CollectionFormatTO getType() {
        return type;
    }

    public void setType(CollectionFormatTO type) {
        this.type = type;
    }

    public LiteralyWorkTO getWork() {
        return work;
    }

    public void setWork(LiteralyWorkTO work) {
        this.work = work;
    }

}

