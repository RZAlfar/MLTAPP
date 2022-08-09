package com.roz.uni;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;


public class page4_1 extends AppCompatActivity {
    private TextView rx,ry,rz,rw,c1,c2,c3,c4,c5,c6,a1,a2,a3,a4,a5,a6;
//    ,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
    private RadioGroup rxg,ryg,rzg,rwg,routg;
    private RadioButton selx,sely,selz,selw,selout,rx1,rx2,rx3,rx4,ry1,ry2,ry3,ry4,rz1,rz2,rz3,rz4,rw1,rw2,rw3,rw4;
    private Button add,finish,cal,submit;
    private EditText y,y1,y2,y3,y4,z,z1,z2,z3,z4,w,w1,w2,w3,w4,x,x1,x2,x3,x4;
    String tx,ty,tz,tw,tout;
    int i=0;
    ConstraintLayout  con_input,con_table,con_radio,grid_out;

    Double yes_count=0.0,no_count=0.0;
    Double [] answer_yes = new Double [4];Double [] answer_no = new Double [4];
    Double [][] count_yes= new Double [4][4]; Double [][] count_no= new Double [4][4];
    String  [][] d  = new String [20][5];
    String [] [] data ={{"x1","x2","x3","x4"},{"y1","y2","y3","y4"},{"z1","z2","z3","z4"},{"w1","w2","w3","w4"} };
//            new String [4][4];
//    {"x1","x2","x3","x4"},{"y1","y2","y3","y4"},{"z1","z2","z3","z4"},{"w1","w2","w3","w4"},



    int input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page4_1);
        Button back = findViewById(R.id.back);
        input=1;
        TextView topic = findViewById(R.id.topic);
        topic.setText("");
        back.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        finish();

                                    }

                                }
        );
//        con_input = (ConstraintLayout) findViewById(R.id.con_input);
//        con_radio =(ConstraintLayout) findViewById(R.id.con_radio);
        con_table =(ConstraintLayout) findViewById(R.id.con_table);
        grid_out = (ConstraintLayout) findViewById(R.id.grid_out);
        con_table.setVisibility(con_table.GONE);
//        con_radio.setVisibility(con_radio.GONE);
        grid_out.setVisibility(grid_out.GONE);

//        Text View
         rx = findViewById(R.id.rx); ry = findViewById(R.id.ry); rz = findViewById(R.id.rz);rw= findViewById(R.id.rw);
         c1 = findViewById(R.id.c1);c2 = findViewById(R.id.c2);c3 = findViewById(R.id.c3);c4 = findViewById(R.id.c4);
       c5 = findViewById(R.id.c5);c6 = findViewById(R.id.c6);
       a1=findViewById(R.id.a1); a2=findViewById(R.id.a2); a3=findViewById(R.id.a3); a4=findViewById(R.id.a4);
        a5=findViewById(R.id.a5); a6=findViewById(R.id.a6);
//       c7 = findViewById(R.id.c7);c8 = findViewById(R.id.c8);
//        c9 = findViewById(R.id.c9);c10 = findViewById(R.id.c10);c11 = findViewById(R.id.c11);c12 = findViewById(R.id.c12);
//        c13 = findViewById(R.id.c13);c14 = findViewById(R.id.c14);c15 = findViewById(R.id.c15);c16 = findViewById(R.id.c16);
//        c17 = findViewById(R.id.c17);c18 = findViewById(R.id.c18);c19 = findViewById(R.id.c19);c20 = findViewById(R.id.c20);

//array set zeros
        for(int j=0 ;j<4;j++){for(int k=0;k<4 ;k++){count_yes[j][k]=0.0;
        count_no[j][k]=0.0;}}
//        for(int j=0;j<4;j++){answer_yes[j]=1.0;answer_no[j]=1.0;}
//        Radio
         rx1 = findViewById(R.id.rx1); rx2 = findViewById(R.id.rx2); rx3 = findViewById(R.id.rx3);
         rx4 = findViewById(R.id.rx4);
         ry1 = findViewById(R.id.ry1); ry2 = findViewById(R.id.ry2);
         ry3 = findViewById(R.id.ry3); ry4 = findViewById(R.id.ry4);
         rz1 = findViewById(R.id.rz1); rz2 = findViewById(R.id.rz2);
         rz3 = findViewById(R.id.rz3); rz4 = findViewById(R.id.rz4);
         rw1 = findViewById(R.id.rw1); rw2 = findViewById(R.id.rw2);
         rw3 = findViewById(R.id.rw3); rw4 = findViewById(R.id.rw4);
//     Button
         add = findViewById(R.id.add ); finish = findViewById(R.id.finish); cal= findViewById(R.id.cal);
//         submit =findViewById(R.id.submit);
//     radio group
         rxg =findViewById(R.id.rxg);RadioGroup ryg =findViewById(R.id.ryg);
         rzg =findViewById(R.id.rzg);RadioGroup rwg =findViewById(R.id.rwg);
         routg =findViewById(R.id.routg);
//edittext
               x = findViewById(R.id.x); x1 = findViewById(R.id.x1); x2 = findViewById(R.id.x2);
        x3 = findViewById(R.id.x3); x4 = findViewById(R.id.x4); y = findViewById(R.id.y);
        y1 = findViewById(R.id.y1); y2 = findViewById(R.id.y2); y3 = findViewById(R.id.y3);
        y4 = findViewById(R.id.y4); z = findViewById(R.id.z); z1 = findViewById(R.id.z1);
        z2 = findViewById(R.id.z2);  z3 = findViewById(R.id.z3);  z4 = findViewById(R.id.z4);
        w = findViewById(R.id.w);  w1 = findViewById(R.id.w1);  w2 = findViewById(R.id.w2);
        w3 = findViewById(R.id.w3);  w4 = findViewById(R.id.w4);


//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                con_input.setVisibility(con_input.GONE);
//                con_radio.setVisibility(con_radio.VISIBLE);
//                con_table.setVisibility(con_table.VISIBLE);
//                add.setVisibility(View.VISIBLE);finish.setVisibility(View.VISIBLE);
//
//
//                if (!TextUtils.isEmpty(x.getText().toString())){rx.setVisibility(View.VISIBLE);}
//                if (!TextUtils.isEmpty(x1.getText().toString())){rx1.setVisibility(View.VISIBLE);}else {rx1.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(x2.getText().toString())){rx2.setVisibility(View.VISIBLE);}else {rx2.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(x3.getText().toString())){rx3.setVisibility(View.VISIBLE);}else {rx3.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(x4.getText().toString())){rx4.setVisibility(View.VISIBLE);}else {rx4.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(y.getText().toString())){ry.setVisibility(View.VISIBLE);}
//                if (!TextUtils.isEmpty(y1.getText().toString())){ry1.setVisibility(View.VISIBLE);}else {ry1.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(y2.getText().toString())){ry2.setVisibility(View.VISIBLE);}else {ry2.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(y3.getText().toString())){ry3.setVisibility(View.VISIBLE);}else {ry3.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(y4.getText().toString())){ry4.setVisibility(View.VISIBLE);}else {ry4.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(z.getText().toString())){rz.setVisibility(View.VISIBLE);}
//                if (!TextUtils.isEmpty(z1.getText().toString())){rz1.setVisibility(View.VISIBLE);}else {rz1.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(z2.getText().toString())){rz2.setVisibility(View.VISIBLE);}else {rz2.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(z3.getText().toString())){rz3.setVisibility(View.VISIBLE);}else {rz3.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(z4.getText().toString())){rz4.setVisibility(View.VISIBLE);}else {rz4.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(w.getText().toString())){rw.setVisibility(View.VISIBLE);}
//                if (!TextUtils.isEmpty(w1.getText().toString())){rw1.setVisibility(View.VISIBLE);}else {rw1.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(w2.getText().toString())){rw2.setVisibility(View.VISIBLE);}else {rw2.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(w3.getText().toString())){rw3.setVisibility(View.VISIBLE);}else {rw3.setVisibility(View.GONE);}
//                if (!TextUtils.isEmpty(w4.getText().toString())){rw4.setVisibility(View.VISIBLE);}else {rw4.setVisibility(View.GONE);}
//
//                rx.setText(x.getText().toString());
//                rx1.setText(x1.getText().toString());data[0][0]=x1.getText().toString();
//                rx2.setText(x2.getText().toString());data[0][1]=x2.getText().toString();
//                rx3.setText(x3.getText().toString());data[0][2]=x3.getText().toString();
//                rx4.setText(x4.getText().toString());data[0][3]=x4.getText().toString();
//                ry.setText(y.getText().toString());
//                ry1.setText(y1.getText().toString());data[1][0]=y1.getText().toString();
//                ry2.setText(y2.getText().toString());data[1][1]=y2.getText().toString();
//                ry3.setText(y3.getText().toString());data[1][2]=y3.getText().toString();
//                ry4.setText(y4.getText().toString());data[1][3]=y4.getText().toString();
//                rz.setText(z.getText().toString());
//                rz1.setText(z1.getText().toString());data[2][0]=z1.getText().toString();
//                rz2.setText(z2.getText().toString());data[2][1]=z2.getText().toString();
//                rz3.setText(z3.getText().toString());data[2][2]=z3.getText().toString();
//                rz4.setText(z4.getText().toString());data[2][3]=z4.getText().toString();
//                rw.setText(w.getText().toString());
//                rw1.setText(w1.getText().toString());data[3][0]=w1.getText().toString();
//                rw2.setText(w2.getText().toString());data[3][1]=w2.getText().toString();
//                rw3.setText(w3.getText().toString());data[3][2]=w3.getText().toString();
//                rw4.setText(w4.getText().toString());data[3][3]=w4.getText().toString();
//
//
//
//
//
//            }});


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==20){ return;}else {
                    con_table.setVisibility(con_table.VISIBLE);

                    if(rxg.getCheckedRadioButtonId()==-1|ryg.getCheckedRadioButtonId()==-1|rzg.getCheckedRadioButtonId()==-1
                            |rwg.getCheckedRadioButtonId()==-1|routg.getCheckedRadioButtonId()==-1) {
                        Toast.makeText(page4_1.this,"Choose Elements For Each input",Toast.LENGTH_SHORT).show();}
                    else {

                int xid =rxg.getCheckedRadioButtonId(); selx = (RadioButton) findViewById(xid);
                tx=selx.getText().toString();d[i][0]=tx;c2.setText(tx);

                int yid =ryg.getCheckedRadioButtonId();sely = (RadioButton) findViewById(yid);
                ty=sely.getText().toString();d[i][1]=ty;c3.setText(ty);
                int zid =rzg.getCheckedRadioButtonId();selz = (RadioButton) findViewById(zid);
                tz=selz.getText().toString(); d[i][2]=tz;c4.setText(tz);
                int wid =rwg.getCheckedRadioButtonId();selw = (RadioButton) findViewById(wid);
                tw=selw.getText().toString();d[i][3]=tw;c5.setText(tw);
                int outid =routg.getCheckedRadioButtonId();selout = (RadioButton) findViewById(outid);
                tout=selout.getText().toString();d[i][4]=tout;c6.setText(tout);
                ++i;
                c1.setText("Input("+i+")");}
              }
            }});

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { int q;

                add.setVisibility(View.INVISIBLE);cal.setVisibility(View.VISIBLE);
                con_table.setVisibility(con_table.GONE);

                for ( q=0;q<i;q++){
                    if(Objects.equals(d[q][4], "yes")) {
                    ++yes_count; int k,j;
                    for(j=0;j<4;j++){ for(k=0;k<4;k++){
                        if(Objects.equals(d[q][j], data[j][k])){
                                ++count_yes[j][k];}
                    }}
                }if(Objects.equals(d[q][4], "no")) {
                        ++no_count; int k,j;
                        for(j=0;j<4;j++){ for(k=0;k<4;k++){
                            if(Objects.equals(d[q][j], data[j][k])){
                                ++count_no[j][k];}
                        }}
                    }
                    }


            }});
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grid_out.setVisibility(grid_out.VISIBLE);
                finish.setVisibility(View.GONE);

                int xid =rxg.getCheckedRadioButtonId(); RadioButton wantedx = (RadioButton) findViewById(xid);
                String wanx=wantedx.getText().toString(); for(int u=0;u<4;u++){
                    for (int j=0;j<4;j++){if(Objects.equals(data[u][j], wanx))
                    {answer_yes[0]=count_yes[u][j];
                    answer_no[0]=count_no[u][j];}
                    }}

                int yid =ryg.getCheckedRadioButtonId();RadioButton wantedy = (RadioButton) findViewById(yid);
                String wany=wantedy.getText().toString();for(int k=0;k<4;k++){
                        for (int j=0;j<4;j++){if(Objects.equals(data[k][j], wany))
                        {answer_yes[1]=count_yes[k][j];
                            answer_no[1]=count_no[k][j];}}}

                int zid =rzg.getCheckedRadioButtonId();RadioButton wantedz = (RadioButton) findViewById(zid);
                String wanz=wantedz.getText().toString();for(int h=0;h<4;h++){
                            for (int j=0;j<4;j++){if(Objects.equals(data[h][j], wanz))
                            {answer_yes[2]=count_yes[h][j];
                                answer_no[2]=count_no[h][j];}}}

                int wid =rwg.getCheckedRadioButtonId();RadioButton wantedw = (RadioButton) findViewById(wid);
                String wanw=wantedw.getText().toString();for(int l=0;l<4;l++){
                                for (int j=0;j<4;j++){if(Objects.equals(data[l][j], wanw))
                                {answer_yes[3]=count_yes[l][j];
                                    answer_no[3]=count_no[l][j];}}}
                Double a=1.0,m=1.0;
                 for(int p=0;p<4;p++){a=(answer_yes[p]/yes_count)*a;} a=a*(yes_count/(yes_count+no_count));
                for(int p=0;p<4;p++){m=(answer_no[p]/no_count)*m;} m=m*(no_count/i);

                String data_show ="";
                for(int o=0;o<4;o++){for(int e=0;e<4;e++){data_show= (data[o][e]+"//"+data_show); }}
                a1.setText(""+yes_count);a2.setText(""+no_count);
                a3.setText(""+(yes_count/i));a4.setText(""+(no_count/i));
                a5.setText(""+a);
                a6.setText(""+m);




            }});





    }

}