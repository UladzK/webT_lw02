package com.company.lw02.entity;

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 3/31/14
 * Time: 8:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book extends CollectionFormat {
    private boolean hardCover;

    public Book() { super(); }
    public Book(String title, boolean hardCover){
        super(title);
        this.hardCover = hardCover;
    }

    public void setHardCover(boolean hardCover){
        this.hardCover = hardCover;
    }

    public boolean withHardCover(){
        return this.hardCover;
    }

    public Boolean equals(Book b){
        if (this.hardCover == b.hardCover &&
                this.getTitle() == b.getTitle() &&
                b != null)
            return true;
        else
            return false;
    }

    //emulating hash-code for books
    public int hashCode() {
        final int prime = 29;
        int result = 1;
        result = prime * result * this.getTitle().length();
        result += result * prime + 1543 * (this.hardCover ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " name: " + this.getTitle() +
                (this.withHardCover() ? " " : " with hard cover");
    }
}
