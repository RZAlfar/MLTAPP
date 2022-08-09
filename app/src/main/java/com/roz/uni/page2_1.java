package com.roz.uni;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class page2_1 extends AppCompatActivity {
    


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2_1);
        Button back = findViewById(R.id.back);
        TextView topic = findViewById(R.id.topic);
        topic.setText("Elements");
        back.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        finish();

                                    }

                                }
        );
    }
}