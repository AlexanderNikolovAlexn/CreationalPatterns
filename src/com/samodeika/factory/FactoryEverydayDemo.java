package com.samodeika.factory;

import java.util.Calendar;

/**
 * Created by Eagle on 20.10.2015 ?..
 */
public class FactoryEverydayDemo {

    public static void main(String args []) {

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));

    }

}
