package com.company.lw02.entity;

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 3/31/14
 * Time: 8:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Magazine extends CollectionFormat {
    private boolean tarnish;

    public Magazine() { super(); }
    public Magazine(String title, boolean tarnish){
        super(title);
        this.tarnish = tarnish;
    }

    public void setWrap(boolean tarnish){
        this.tarnish = tarnish;
    }

    public boolean isTarnish(){
        return this.tarnish;
    }

    public Boolean equals(Magazine m){
        if (this.tarnish == m.tarnish &&
                this.getTitle() == m.getTitle() &&
                m != null)
            return true;
        else
            return false;
    }

    //emulating hash-code for magazines
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result * this.getTitle().length();
        result += result * prime + 1347 * (this.tarnish ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " name: " + this.getTitle() +
                (this.isTarnish() ? " with frosted wrap" : " with glossy wrap");
    }
}
