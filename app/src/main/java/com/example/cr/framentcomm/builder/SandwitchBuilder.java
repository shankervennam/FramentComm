package com.example.cr.framentcomm.builder;

public class SandwitchBuilder
{


    public static Sandwidth readyMade()
    {
        Sandwidth s= new Sandwidth();
        s.addIngradient(new Bagel());
        s.addIngradient(new Italian());

        return s;
    }

    public static Sandwidth Sandwidth(Sandwidth s, Ingredient ingredient)
    {
        s.addIngradient(ingredient);
        return s;
    }
}
