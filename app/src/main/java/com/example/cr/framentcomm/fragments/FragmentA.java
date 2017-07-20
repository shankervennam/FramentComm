package com.example.cr.framentcomm.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.cr.framentcomm.Communicator;
import com.example.cr.framentcomm.R;

public class FragmentA extends Fragment implements View.OnClickListener
{
    Button button;
    int counter=0;
    Communicator communicator;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        button = (Button) getActivity().findViewById(R.id.button_a);
        communicator = (Communicator) getActivity();
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        counter++;
        communicator.respond("The button cliked"+counter);
    }
}
