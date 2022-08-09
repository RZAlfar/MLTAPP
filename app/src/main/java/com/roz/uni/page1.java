package com.roz.uni;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class page1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.page1, container, false);


        Button a = (Button) v.findViewById(R.id.b1);
        Button b = (Button) v.findViewById(R.id.b2);
        Button c = (Button) v.findViewById(R.id.b3);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open1();

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open2();

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open3();

            }
        });


        return v;
    }

    public void open1() {
        Intent i = new Intent(getActivity(), CONCEPT.class);
        startActivity(i);
    }

    public void open2() {
        Intent i = new Intent(getActivity(), TYPES.class);
        startActivity(i);
    }

    public void open3() {
        Intent i = new Intent(getActivity(), LEARNING.class);
        startActivity(i);
    }
}









