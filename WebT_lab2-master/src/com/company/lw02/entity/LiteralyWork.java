package com.company.lw02.entity;

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 3/31/14
 * Time: 8:43 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class LiteralyWork implements CollectionPart {

    private String title;
    private String author;

    public LiteralyWork() { }
    public LiteralyWork(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return this.author;
    }

    public Boolean equals(LiteralyWork w){
        if (this.title == w.getTitle() && this.author == w.getAuthor() && w != null)
            return true;
        else
            return false;
    }

    //emulating hash-code for works
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result * this.title.length();
        result += result * prime;
        return result;
    }

}
