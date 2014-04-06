package com.company.lw02.transfer;
import com.company.lw02.content.*;
/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 3/31/14
 * Time: 10:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class LiteralyWorkTO {
    private Work work;
    private String author;
    private String name;
    private Genre genre;
    private VerseSize size;

    public LiteralyWorkTO() {

    }

    public LiteralyWorkTO(String author, String name, Genre genre) {
        this.author = author;
        this.name = name;
        this.genre = genre;
        this.work = Work.Story;
    }

    public LiteralyWorkTO(String author, String name, VerseSize size) {
        this.author = author;
        this.name = name;
        this.size = size;
        this.work = Work.Verse;
    }

    public Work getWork() {
        return work;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public void setType(Genre genre) {
        this.genre = genre;
    }

    public VerseSize getSize() {
        return size;
    }

    public void setSize(VerseSize size) {
        this.size = size;
    }

}
