package com.company.lw02.entity;
import com.company.lw02.content.VerseSize;

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 3/31/14
 * Time: 9:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Verse extends LiteralyWork {
    private VerseSize size;

    public Verse(String title, String author, VerseSize size){
        super(title, author);
        this.size = size;
    }

    public VerseSize getSize(){
        return this.size;
    }

    public void setSize(VerseSize size) {
        this.size = size;
    }

    public Boolean equals(Verse v){
        if (this.getTitle() == v.getTitle() &&
                this.getAuthor() == v.getAuthor() &&
                this.size == v.getSize()
                && v != null)
            return true;
        else
            return false;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " \"" + this.getTitle() +
                "\" by "+ this.getAuthor()+ " count: " + this.getSize();
    }
}
