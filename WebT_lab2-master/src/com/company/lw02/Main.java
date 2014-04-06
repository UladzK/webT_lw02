package com.company.lw02;

import com.company.lw02.builder.Builder;
import com.company.lw02.controller.Controller;
public class Main {

    public static void main(String[] args) {
	    Builder b = new Builder();
        Controller c = new Controller(b);
        c.run();
    }
}
