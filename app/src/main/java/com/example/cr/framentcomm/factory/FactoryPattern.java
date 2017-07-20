package com.example.cr.framentcomm.factory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class FactoryPattern
{
    public Bread getBread(String breadType)
    {
        if(breadType == "BRI")
        {
            return new Bronchi();
        }
        else if(breadType == "BAG")
        {
            return new Baguette();
        }
        else if(breadType == "ROL")
        {
            return new Roll();
        }
        return null;
    }

}
