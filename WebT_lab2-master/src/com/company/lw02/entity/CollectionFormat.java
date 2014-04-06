package com.company.lw02.entity;
/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 3/31/14
 * Time: 8:42 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class CollectionFormat implements CollectionPart {
    private String title;

    public CollectionFormat(){ }

    public CollectionFormat(String title) {
        this.title = title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public Boolean equals(CollectionFormat cf){
        if (this.getTitle() == cf.getTitle() && cf != null )
            return true;
        else
            return false;
    }

    //emulating hash-code for compendium
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result * this.title.length();
        result += result * prime;
        return result;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.title;
    }
}

