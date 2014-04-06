package com.company.lw02.transfer;
import com.company.lw02.content.*;

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 3/31/14
 * Time: 10:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class CollectionFormatTO {
    private boolean hardCover;
    private boolean tarnish;
    private String title;
    private Type type;

    public CollectionFormatTO() {

    }

    public CollectionFormatTO(String title, boolean option, Type type) {
        this.type = type;
        if (type == Type.Book) {
            this.hardCover= option;
        } else if (type == Type.Magazine) {
            this.tarnish = option;
        }
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public boolean withHardCover() {
        return this.hardCover;
    }

    public void setPictures(boolean withHardCover) {
        this.hardCover = withHardCover;
    }

    public boolean isTarnish() {
        return tarnish;
    }

    public void setTarnish(boolean tarnish) {
        this.tarnish = tarnish;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

