//package com.roz.uni;
//
//import android.graphics.Color;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.Gravity;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageButton;
//import android.widget.TextSwitcher;
//import android.widget.TextView;
//import android.widget.ViewSwitcher;
//
//public class info_1 extends AppCompatActivity {
//
//    private int stringIndex = 0;
//    private String[] steps = {"Step 1","Step 2","Step 3","Step 4","Step5"
//    };
//    private String[] cont = {"do this","22222"," is","I ",":X"
//    };
//    private TextView step,contt;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_info1);
//
//        Button back = findViewById(R.id.back);
//        TextView topic = findViewById(R.id.topic);
//        topic.setText("Linear Regression");
//        back.setOnClickListener(new View.OnClickListener() {
//                                    @Override
//                                    public void onClick(View v) {
//                                        finish();
//
//                                    }
//
//                                }
//        );
////         الشغل التاني عن العرض للنصوص
//        ImageButton next = findViewById(R.id.next1);
//        ImageButton prev = findViewById(R.id.prev1);
//        TextSwitcher textSwitcher = findViewById(R.id.switch1);
//        TextSwitcher switch1c = findViewById(R.id.switch1c);
//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (stringIndex == steps.length-1) {
//                      stringIndex = steps.length-1;
//                    textSwitcher.setText(steps[stringIndex]);switch1c.setText(cont[stringIndex]);
//                } else { ++stringIndex;
//                    textSwitcher.setText(steps[stringIndex]);switch1c.setText(cont[stringIndex]);
//                }
//            }
//        });
//
//        prev.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (stringIndex == 0) {
//                    stringIndex = 0;
//                    textSwitcher.setText(steps[stringIndex]);switch1c.setText(cont[stringIndex]);
//                } else { --stringIndex;
//                    textSwitcher.setText(steps[stringIndex]);switch1c.setText(cont[stringIndex]);
//                }
//            }
//        });
//
//        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
//            @Override
//            public View makeView() {
//                step = new TextView(info_1.this);
//                step.setTextColor(Color.BLACK);
//                step.setTextSize(30);
//                step.setGravity(Gravity.CENTER_HORIZONTAL);
//                return step;
//            }
//        });
//
//        textSwitcher.setText(steps[stringIndex]);
//
//
//        switch1c.setFactory(new ViewSwitcher.ViewFactory() {
//            @Override
//            public View makeView() {
//                contt = new TextView(info_1.this);
//                contt.setTextColor(Color.BLACK);
//                contt.setTextSize(20);
//                contt.setGravity(Gravity.CENTER_HORIZONTAL);
//                return contt;
//            }
//        });
//
//        switch1c.setText(cont[stringIndex]);
//
//
//
//
//    }
//
//}
//
//
