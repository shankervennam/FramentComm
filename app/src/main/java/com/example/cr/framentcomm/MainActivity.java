package com.example.cr.framentcomm;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import com.example.cr.framentcomm.factory.Baguette;
import com.example.cr.framentcomm.factory.Bread;
import com.example.cr.framentcomm.factory.Bronchi;
import com.example.cr.framentcomm.factory.FactoryPattern;
import com.example.cr.framentcomm.factory.Roll;
import com.example.cr.framentcomm.fragments.FragmentB;

public class MainActivity extends AppCompatActivity
{
    public TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factory_pattern);
        textView = (TextView) findViewById(R.id.text);
        FactoryPattern factoryPattern = new FactoryPattern();
        Bread bread = factoryPattern.getBread("BRI");
        textView.setText(bread.name());
    }

//    public void respond(String value)
//    {
//        android.app.FragmentManager fragmentManager =getFragmentManager();
//        FragmentB f2 = (FragmentB) fragmentManager.findFragmentById(R.id.fragment2);
//        f2.changeText(value);
//    }
}
