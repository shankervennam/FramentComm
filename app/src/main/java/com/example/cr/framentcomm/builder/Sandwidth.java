package com.example.cr.framentcomm.builder;


import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Sandwidth
{
    private List<Ingredient> ingredients = new ArrayList<Ingredient>();

    public void getCalories()
    {
        int c=0;

        for(Ingredient i:ingredients)
        {
            c += i.calories();
        }
    }

    public void addIngradient(Ingredient ingredient)
    {
        ingredients.add(ingredient);
    }

    public void getSandwitch()
    {
        for(Ingredient i:ingredients)
        {
            Log.d("TAG",i.name() + "" + i.calories() + "kcal");
        }
    }
}
