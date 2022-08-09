//package com.roz.uni;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.text.TextUtils;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.TextView;
//
//
//public class page4_1 extends AppCompatActivity {
//    private TextView rx,ry,rz,rw,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
//    private EditText y,y1,y2,y3,y4,z,z1,z2,z3,z4,w,w1,w2,w3,w4,x,x1,x2,x3,x4;
//    private RadioGroup rxg,ryg,rzg,rwg,routg;
//    private RadioButton selx,sely,selz,selw,selout,rx1,rx2,rx3,rx4,ry1,ry2,ry3,ry4,rz1,rz2,rz3,rz4,rw1,rw2,rw3,rw4;
//    private Button b,b2;
//    private int[] xel ={0,0,0,0} ;
//    private int[] yel ={0,0,0,0} ;
//    private int[] zel ={0,0,0,0} ;
//    private int[] wel ={0,0,0,0} ;
//    String all,tx,ty,tz,tw,tout;
//    int b_count=0;
//    private String[] d1 = {"","","","",""}; private String[] d2 = {"","","","",""}; private String[] d3 = {"","","","",""}; private String[] d4 = {"","","","",""};
//    private String[] d5 = {"","","","",""}; private String[] d6 = {"","","","",""}; private String[] d7 = {"","","","",""}; private String[] d8 = {"","","","",""};
//    private String[] d9 = {"","","","",""}; private String[] d10 = {"","","","",""}; private String[] d11 = {"","","","",""};private String[] d12 = {"","","","",""};
//    private String[] d13 = {"","","","",""}; private String[] d14 = {"","","","",""}; private String[] d15 = {"","","","",""}; private String[] d16 = {"","","","",""};
//    private String[] d17 = {"","","","",""}; private String[] d18 = {"","","","",""}; private String[] d19 = {"","","","",""}; private String[] d20 = {"","","","",""};
//    int input;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.page4_1);
//        Button back = findViewById(R.id.back);
//        input=1;
//        TextView topic = findViewById(R.id.topic);
//        topic.setText("");
//        back.setOnClickListener(new View.OnClickListener() {
//                                    @Override
//                                    public void onClick(View v) {
//                                        finish();
//
//                                    }
//
//                                }
//        );
////        اسناد العناوين
////        Text View
//        rx = findViewById(R.id.rx); ry = findViewById(R.id.ry); rz = findViewById(R.id.rz);rw= findViewById(R.id.rw);
//        c1 = findViewById(R.id.c1);c2 = findViewById(R.id.c2);c3 = findViewById(R.id.c3);c4 = findViewById(R.id.c4);
//        c5 = findViewById(R.id.c5);c6 = findViewById(R.id.c6);c7 = findViewById(R.id.c7);c8 = findViewById(R.id.c8);
//        c9 = findViewById(R.id.c9);c10 = findViewById(R.id.c10);c11 = findViewById(R.id.c11);c12 = findViewById(R.id.c12);
//        c13 = findViewById(R.id.c13);c14 = findViewById(R.id.c14);c15 = findViewById(R.id.c15);c16 = findViewById(R.id.c16);
//        c17 = findViewById(R.id.c17);c18 = findViewById(R.id.c18);c19 = findViewById(R.id.c19);c20 = findViewById(R.id.c20);
////        Edit text
//        x = findViewById(R.id.x); x1 = findViewById(R.id.x1); x2 = findViewById(R.id.x2);
//        x3 = findViewById(R.id.x3); x4 = findViewById(R.id.x4); y = findViewById(R.id.y);
//        y1 = findViewById(R.id.y1); y2 = findViewById(R.id.y2); y3 = findViewById(R.id.y3);
//        y4 = findViewById(R.id.y4); z = findViewById(R.id.z); z1 = findViewById(R.id.z1);
//        z2 = findViewById(R.id.z2);  z3 = findViewById(R.id.z3);  z4 = findViewById(R.id.z4);
//        w = findViewById(R.id.w);  w1 = findViewById(R.id.w1);  w2 = findViewById(R.id.w2);
//        w3 = findViewById(R.id.w3);  w4 = findViewById(R.id.w4);
////        Radio
//        rx1 = findViewById(R.id.rx1); rx2 = findViewById(R.id.rx2); rx3 = findViewById(R.id.rx3);
//        rx4 = findViewById(R.id.rx4);
//        ry1 = findViewById(R.id.ry1); ry2 = findViewById(R.id.ry2);
//        ry3 = findViewById(R.id.ry3); ry4 = findViewById(R.id.ry4);
//        rz1 = findViewById(R.id.rz1); rz2 = findViewById(R.id.rz2);
//        rz3 = findViewById(R.id.rz3); rz4 = findViewById(R.id.rz4);
//        rw1 = findViewById(R.id.rw1); rw2 = findViewById(R.id.rw2);
//        rw3 = findViewById(R.id.rw3); rw4 = findViewById(R.id.rw4);
////     Button
//        b = findViewById(R.id.b);
//        b2 = findViewById(R.id.b2);
////     radio group
//        rxg =findViewById(R.id.rxg);RadioGroup ryg =findViewById(R.id.ryg);
//        rzg =findViewById(R.id.rzg);RadioGroup rwg =findViewById(R.id.rwg);
//        routg =findViewById(R.id.routg);
//
//
//
//
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (!TextUtils.isEmpty(x.getText().toString())){rx.setVisibility(View.VISIBLE);}
//                if (!TextUtils.isEmpty(x1.getText().toString())){rx1.setVisibility(View.VISIBLE);xel[0]=1;}else {xel[0]=0;rx1.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(x2.getText().toString())){rx2.setVisibility(View.VISIBLE);xel[1]=1;}else {xel[1]=0;rx2.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(x3.getText().toString())){rx3.setVisibility(View.VISIBLE);xel[2]=1;}else {xel[2]=0;rx3.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(x4.getText().toString())){rx4.setVisibility(View.VISIBLE);xel[3]=1;}else {xel[3]=0;rx4.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(y.getText().toString())){ry.setVisibility(View.VISIBLE);}
//                if (!TextUtils.isEmpty(y1.getText().toString())){ry1.setVisibility(View.VISIBLE);yel[0]=1;}else {yel[0]=0;ry1.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(y2.getText().toString())){ry2.setVisibility(View.VISIBLE);yel[1]=1;}else {yel[1]=0;ry2.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(y3.getText().toString())){ry3.setVisibility(View.VISIBLE);yel[2]=1;}else {yel[2]=0;ry3.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(y4.getText().toString())){ry4.setVisibility(View.VISIBLE);yel[3]=1;}else {yel[3]=0;ry4.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(z.getText().toString())){rz.setVisibility(View.VISIBLE);}
//                if (!TextUtils.isEmpty(z1.getText().toString())){rz1.setVisibility(View.VISIBLE);zel[0]=1;}else {zel[0]=0;rz1.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(z2.getText().toString())){rz2.setVisibility(View.VISIBLE);zel[1]=1;}else {zel[1]=0;rz2.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(z3.getText().toString())){rz3.setVisibility(View.VISIBLE);zel[2]=1;}else {zel[2]=0;rz3.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(z4.getText().toString())){rz4.setVisibility(View.VISIBLE);zel[3]=1;}else {zel[3]=0;rz4.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(w.getText().toString())){rw.setVisibility(View.VISIBLE);}
//                if (!TextUtils.isEmpty(w1.getText().toString())){rw1.setVisibility(View.VISIBLE);wel[0]=1;}else {wel[0]=0;rw1.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(w2.getText().toString())){rw2.setVisibility(View.VISIBLE);wel[1]=1;}else {wel[1]=0;rw2.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(w3.getText().toString())){rw3.setVisibility(View.VISIBLE);wel[2]=1;}else {wel[2]=0;rw3.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(w4.getText().toString())){rw4.setVisibility(View.VISIBLE);wel[3]=1;}else {wel[3]=0;rw4.setVisibility(View.GONE);}
//
//                rx.setText(x.getText().toString());rx1.setText(x1.getText().toString());
//                rx2.setText(x2.getText().toString());rx3.setText(x3.getText().toString());
//                rx4.setText(x4.getText().toString());
//                ry.setText(y.getText().toString());ry1.setText(y1.getText().toString());
//                ry2.setText(y2.getText().toString());ry3.setText(y3.getText().toString());
//                ry4.setText(y4.getText().toString());
//                rz.setText(z.getText().toString());rz1.setText(z1.getText().toString());
//                rz2.setText(z2.getText().toString());rz3.setText(z3.getText().toString());
//                rz4.setText(z4.getText().toString());
//                rw.setText(w.getText().toString());rw1.setText(w1.getText().toString());
//                rw2.setText(w2.getText().toString());rw3.setText(w3.getText().toString());
//                rw4.setText(w4.getText().toString());
//
//            }});
//
//
//
//
//
//        b.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) { b_count++;
//                if(b_count==1){
//                    int xid =rxg.getCheckedRadioButtonId(); selx = (RadioButton) findViewById(xid);
//                    tx=selx.getText().toString();d1[0]= String.valueOf(xid);
////
//                    int yid =ryg.getCheckedRadioButtonId();sely = (RadioButton) findViewById(yid);
//                    ty=sely.getText().toString();d1[1]=String.valueOf(yid);
//
//                    int zid =rzg.getCheckedRadioButtonId();selz = (RadioButton) findViewById(zid);
//                    tz=selz.getText().toString();d1[2]=String.valueOf(zid);
//
//                    int wid =rwg.getCheckedRadioButtonId();selw = (RadioButton) findViewById(wid);
//                    tw=selw.getText().toString();d1[3]=String.valueOf(wid);
//
//                    int outid =routg.getCheckedRadioButtonId();selout = (RadioButton) findViewById(outid);
//                    tout=selout.getText().toString();d1[4]=String.valueOf(outid);
////                all=tx+"---"+ty+"---"+tz+"---"+tw+"---"+tout;
//                    all= String.valueOf(d1);
//                    c1.setText(all);}
////                else if(b_count==2){
////
////                    int xid =rxg.getCheckedRadioButtonId(); selx = (RadioButton) findViewById(xid);
////                    tx=selx.getText().toString();d2[0]= String.valueOf(xid);
//////
////                    int yid =ryg.getCheckedRadioButtonId();sely = (RadioButton) findViewById(yid);
////                    ty=sely.getText().toString();d2[1]=ty;
////
////                    int zid =rzg.getCheckedRadioButtonId();selz = (RadioButton) findViewById(zid);
////                    tz=selz.getText().toString();d2[2]=tz;
////
////                    int wid =rwg.getCheckedRadioButtonId();selw = (RadioButton) findViewById(wid);
////                    tw=selw.getText().toString();d2[3]=tw;
////
////                    int outid =routg.getCheckedRadioButtonId();selout = (RadioButton) findViewById(outid);
////                    tout=selout.getText().toString();d2[4]=tout;
////                    all=tx+"---"+ty+"---"+tz+"---"+tw+"---"+tout;
////                    c2.setText(all);}
//
//
//            }});
//
//
//
//    }
//
//}
