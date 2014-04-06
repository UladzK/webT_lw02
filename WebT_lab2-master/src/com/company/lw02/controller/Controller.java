package com.company.lw02.controller;
import com.company.lw02.builder.Builder;
import com.company.lw02.view.View;
import com.company.lw02.transfer.*;
import com.company.lw02.entity.Collection;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 3/31/14
 * Time: 3:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class Controller {
    private  Builder b;
    private  View view = new View();

    public Controller(Builder b){
        this.b = b;
    }

    public void run() {
        BuilderTO builderTO;
        Random r = new Random();
        int userCount = r.nextInt(20);

        //emulating user input
        for (int i = 0; i < userCount; i++){
            //get user input
            builderTO = view.stubUserInput();

            Collection c = b.buildCollection(builderTO);
            CollectionTO compTO = new CollectionTO();
            compTO.setCollection(c);

            view.Show(compTO);
        }
    }
}
