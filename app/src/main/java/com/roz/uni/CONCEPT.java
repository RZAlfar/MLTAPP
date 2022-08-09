package com.roz.uni;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CONCEPT extends AppCompatActivity {
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concept);
            Button back = findViewById(R.id.back);
            TextView topic = findViewById(R.id.topic);
            topic.setText("ARTIFICIAL INTELLIGENCE");
            back.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            finish();

                                        }

                                    }
            );
            ((Button)  findViewById(R.id.b)) .setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i=new Intent(CONCEPT.this,NEXTCONCEPT.class);
                    startActivity(i);
                }
            });


        }


    }
