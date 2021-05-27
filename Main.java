package com.nixsolutions.elenaevsiukova;


import java.math.BigDecimal;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    private static final java.util.logging.Logger LOGGER =
            java.util.logging.Logger.getLogger(Main.class.getName());
    private static final Logger LOG = LogManager.getLogManager().getLogger(Main.class.getName());

    public static void main(String[] args) {



        MyBaseTypesUtil valueForFormat=new MyBaseTypesUtil();
        valueForFormat.format(345.754, "string for method");

        MyBaseTypesUtil sum=new MyBaseTypesUtil();
        sum.plus("454635.535345373", "4562365.55635");

        MyBaseTypesUtil difference=new MyBaseTypesUtil();
        difference.minus("454635.535345373", "4562365.55635");

        MyBaseTypesUtil multiplication=new MyBaseTypesUtil();
        multiplication.mul("4346265.3748322", "267625.5673657342526");

        MyBaseTypesUtil division=new MyBaseTypesUtil();
        division.div("4254625.3545466366", "6365.563738388");



            }
        }






