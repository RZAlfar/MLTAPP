package com.roz.uni;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class page3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.page3, container, false);

        Button  a1 = (Button) v.findViewById(R.id.b1_1);
        Button  a2 =(Button) v. findViewById(R.id.b1_2);
        Button  b1 =(Button) v. findViewById(R.id.b2_1);
        Button  b2 = (Button) v.findViewById(R.id.b2_2);
        Button  c1 =(Button) v. findViewById(R.id.b3_1);
        Button  c2 = (Button) v.findViewById(R.id.b3_2);

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              oa1();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ob1();
            }

        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oc1();
            }
        });

        ////////////////////////////////
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oa2();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ob2();
            }

        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oc2();
            }
        });

        return v;}

    public void oa1() { Intent i = new Intent(getActivity(),p3_a1.class);
        startActivity(i);
    }
    public void ob1() { Intent i = new Intent(getActivity(),p3_b1.class);
        startActivity(i);
    }
    public void oc1() { Intent i = new Intent(getActivity(),p3_c1.class);
        startActivity(i);
    }
///////////////////////////////////
public void oa2() { Intent i = new Intent(getActivity(),p3_a2.class);
    startActivity(i);
}
    public void ob2() { Intent i = new Intent(getActivity(),p3_b2.class);
        startActivity(i);
    }
    public void oc2() { Intent i = new Intent(getActivity(),p3_c2.class);
        startActivity(i);
    }
}
