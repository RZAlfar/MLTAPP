package com.roz.uni;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class page2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=  inflater.inflate(R.layout.page2, container, false);
//        id
        Button a  =(Button) v.findViewById(R.id.b2);
        Button  b = (Button) v.findViewById(R.id.b3);
        Button  c =(Button) v. findViewById(R.id.b4);


//        open pages :)
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o1();

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o2();

            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                o3();

            }
        });

        return v;  }
//    open
    public void o1() { Intent i = new Intent(getActivity(),page2_1.class);
        startActivity(i);
    }
    public void o2() { Intent i = new Intent(getActivity(),page2_2.class);
        startActivity(i);
    }
    public void o3() { Intent i = new Intent(getActivity(),page2_3.class);
        startActivity(i);
    }
}