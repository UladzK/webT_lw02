package com.company.lw02.view;

import java.util.Random;
import com.company.lw02.transfer.*;
import com.company.lw02.content.*;
import com.company.lw02.entity.Collection;
/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 3/31/14
 * Time: 3:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class View {

    //database for user-input emulation
    private String[] titles = {"The Lord of the Rings", "The Gift of the Magi", "The mysterious island",
            "Ubiq", "The stainless steel rat", "House of leaves",
            "Monday begins in saturday", "the Goblin Reservation"};
    private String[] authors = {"J.R.R.Tolkien", "O.Henry", "Jules Verne",
            "Philip Dick", "Harry Harrison", "Mark Zadilewski", "Strugatsky brothers",
             "Clifford Simak"};
    private String[] names = {"pie","honeyBadger", "foo", "bar","h1ho"};

    //emulating user input method
    public BuilderTO stubUserInput(){

        Random rand = new Random();

        CollectionFormatTO formatTO;
        LiteralyWorkTO workTO;
        BuilderTO builderTO;
        boolean isStory = rand.nextBoolean();
        int choice = rand.nextInt(titles.length);


        Type type = Type.values()[rand.nextInt(2)];
        Work work = Work.values()[rand.nextInt(2)];
        Genre genre = Genre.values()[rand.nextInt(4)];
        VerseSize size = VerseSize.values()[rand.nextInt(4)];

        if (isStory)
            workTO = new LiteralyWorkTO(titles[choice], authors[choice], genre);
        else
            workTO = new LiteralyWorkTO(titles[choice], authors[choice], size);
        formatTO = new CollectionFormatTO(names[rand.nextInt(4)], rand.nextBoolean(), type);
        return new BuilderTO(formatTO, workTO);
    }

    public void Show(CollectionTO to){
        Collection c = to.getCollection();
        System.out.println(c);
    }

    //for debug
    //public void Show(String msg){
    //    System.out.println(msg);
    //}
}
