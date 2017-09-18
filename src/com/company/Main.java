package com.company;

import java.math.BigDecimal;

public class Main
{

    public static void main(String[] args)
    {
        BigDecimal five = new BigDecimal("5");
        BigDecimal ten = new BigDecimal("10");
        BigDecimal oneHundred = new BigDecimal("100");
        BigDecimal result;

        result = five.add(ten);
        System.out.println("5 + 10 = " + result);

        result = ten.subtract(five);
        System.out.println("10 - 5 = " + result);

        result = ten.multiply(ten);
        System.out.println("10 * 10 = " + result);

        result = oneHundred.divide(ten);
        System.out.println("100 / 10 = " + result);

        result = oneHundred.add(ten).add(five);
        System.out.println("100 + 10 + 5 = " + result);

        //Note goes left to right not like normal order of operations
        result = oneHundred.add(ten).add(five).multiply(five);
        System.out.println("100 + 10 + 5 * 5 = " + result + " Oops that isn't right");

        //You have to out the () in code to make the order you want
        result = oneHundred.add(ten).add(five.multiply(five));
        System.out.println("100 + 10 + (5 * 5) = " + result);

        //Keep it simple instead
        result = five.multiply(five);
        result = result.add(oneHundred);
        result = result.add(ten);
        System.out.println("100 + 10 + (5 * 5) = " + result);

        //If you only need a BigDecimal value one time just create it right where you need it
        result = ten.multiply(new BigDecimal("0.1"));
        System.out.println("10 * 0.1 = " + result);

        //Fun with decimal places
        ten = new BigDecimal("10.00");

        result = ten.multiply(ten);
        System.out.println("10.00 * 10.00 = " + result + " has " + result.scale() + " decimal places");

        result = ten.setScale(2);
        System.out.println("Setting scale we can change the number of decimal places: " + result);

        BigDecimal pi = new BigDecimal("3.14159");
        System.out.println("Before round pi = " + pi);

        try
        {
            pi.setScale(2);
        }
        catch (Exception e)
        {
            System.out.println("Trying to scale a number that needs to be rounded to drop decimal places will throw an exception unless you specify a rounding mode");
        }

        //Lots of different rounding modes are available...half up is probably what you consider normal
        result = pi.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Rounding PI half up to 2 decimal places: " + result);

        //Lots of different rounding modes are available...half up is probably what you consider normal
        result = pi.setScale(2, BigDecimal.ROUND_UP);
        System.out.println("Rounding PI up to 2 decimal places: " + result);

        BigDecimal x;
        x = new BigDecimal(10 + 10);
        //x = 10 + 10;

        System.out.println("TODO Starts Here");
        result = null;

        result = ten.add(ten);
        System.out.println("10 + 10 = " + result);

        result = ten.add(ten);
        result = result.add(ten);
        System.out.println("10 + 10 + 10 = " + result);

        result = ten.multiply(ten);
        result = result.multiply(five);
        System.out.println("10 * 10 * 5 = " + result);

        result = ten.multiply(five);
        result = result.add(ten);
        System.out.println("10 + (10 * 5) = " + result);

    }
}
