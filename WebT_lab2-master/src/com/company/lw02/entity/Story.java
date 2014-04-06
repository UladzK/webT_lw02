package com.company.lw02.entity;
import com.company.lw02.content.Genre;
/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 3/31/14
 * Time: 9:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Story extends LiteralyWork {
    private  Genre genre;

    public Story(String title, String author, Genre genre){
        super(title, author);
        this.genre = genre;
    }

    public Genre getGenre(){
        return this.genre;
    }

    public void setGenre(Genre genre){
        this.genre = genre;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " \"" + this.getTitle()
                + "\" written by " + this.getAuthor() + " in genre " + this.getGenre();
    }
    public Boolean equals(Story s){
        if (this.getTitle() == s.getTitle() &&
                this.getAuthor() == s.getAuthor() &&
                this.genre == s.getGenre()
                && s != null)
            return true;
        else
            return false;
    }

}
