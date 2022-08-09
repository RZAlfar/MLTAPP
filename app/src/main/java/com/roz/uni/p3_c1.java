package com.roz.uni;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class p3_c1 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p3_c1);
        Button back = findViewById(R.id.back);
        TextView topic = findViewById(R.id.topic);
        topic.setText("Decision tree theorem Expalin");
        back.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        finish();

                                    }

                                }
        );



    }
}
//




