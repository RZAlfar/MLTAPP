package com.roz.uni;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class page4 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.page4, container, false);

        Button a  =(Button) v.findViewById(R.id.b);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open();                            }
        });
    return v;}
    public void open() { Intent i = new Intent(getActivity(),page4_1.class);
        startActivity(i);
    }
}