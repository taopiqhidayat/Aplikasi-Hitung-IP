package com.taohid.aplikasihitungip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText oct4;
    EditText oct3;
    EditText oct2;
    EditText oct1;
    EditText nosu;

    TextView js;
    TextView bs;
    TextView jh;
    TextView riawal;
    TextView riawak;
    TextView riakaw;
    TextView riakak;
    TextView sumabi;
    TextView suma;
    TextView na;
    TextView baw;
    TextView bak;

    Button buthiha;
    Button buteka;

    int bsb1,bsb2,bsb3,bsb4;
    int b,sb1,sb2,sb3,sbt1,sbt2,sbt3;
    int x,y;
    double ox,oy;
    int bag;
    int ipal,ipaw,hobi;
    int ok1,ok2,ok3,ok4;
    String bok1,bok2,bok3,bok4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oct4=(EditText) findViewById(R.id.oct4);
        oct3=(EditText) findViewById(R.id.oct3);
        oct2=(EditText) findViewById(R.id.oct2);
        oct1=(EditText) findViewById(R.id.oct1);
        nosu=(EditText) findViewById(R.id.nosu);

        js=(TextView) findViewById(R.id.js);
        bs=(TextView) findViewById(R.id.bs);
        jh=(TextView) findViewById(R.id.jh);
        riawal=(TextView) findViewById(R.id.riawal);
        riawak=(TextView) findViewById(R.id.riawak);
        riakaw=(TextView) findViewById(R.id.riakaw);
        riakak=(TextView) findViewById(R.id.riakak);
        sumabi=(TextView) findViewById(R.id.sumabi);
        suma=(TextView) findViewById(R.id.suma);
        na=(TextView) findViewById(R.id.na);
        baw=(TextView) findViewById(R.id.baw);
        bak=(TextView) findViewById(R.id.bak);

        buthiha=(Button) findViewById(R.id.buthiha);
        buteka=(Button) findViewById((R.id.buteka));

        buteka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah=new Intent(MainActivity.this, TentangKami.class);
                startActivity(pindah);
            }
        });
        buthiha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //semua kecuali range ip & broadcast add
                b = Integer.valueOf(nosu.getText().toString());
                ok1 = Integer.valueOf(oct4.getText().toString());
                ok2 = Integer.valueOf(oct3.getText().toString());
                ok3 = Integer.valueOf(oct2.getText().toString());
                ok4 = Integer.valueOf(oct1.getText().toString());
                //A
                if (b >= 8 && b < 16) {
                    sb1 = b - 8;
                    sbt1 = 8 - sb1;
                    bok1 = "11111111";
                    bok3 = bok4 = "00000000";
                    bok2 = "";
                    for (x = 1; x <= sb1; x++) {
                        bok2 = bok2 + "1";
                    }
                    for (y = 1; y <= sbt1; y++) {
                        bok2 = bok2 + "0";
                    }

                    bsb1 = 255;
                    bsb3 = bsb4 = 0;
                    if (b == 8) {
                        bsb2 = 0;
                    }
                    if (b == 9) {
                        bsb2 = 128;
                    }
                    if (b == 10) {
                        bsb2 = 192;
                    }
                    if (b == 11) {
                        bsb2 = 224;
                    }
                    if (b == 12) {
                        bsb2 = 240;
                    }
                    if (b == 13) {
                        bsb2 = 248;
                    }
                    if (b == 14) {
                        bsb2 = 252;
                    }
                    if (b == 15) {
                        bsb2 = 254;
                    }

                    na.setText(ok1 + "." + 0 + "." + 0 + "." + 0);


                    sb1 = b - 8;
                    sbt1 = 24 - sb1;
                    ox = Math.pow(2, sb1);
                    oy = Math.pow(2, sbt1) - 2;
                    bag = 256 - bsb2;
                }
                //B
                if (b >= 16 && b < 24) {
                    sb2 = b - 16;
                    sbt2 = 8 - sb2;
                    bok1 = bok2 = "11111111";
                    bok4 = "00000000";
                    bok3 = "";
                    for (x = 1; x <= sb2; x++) {
                        bok3 = bok3 + "1";
                    }
                    for (y = 1; y <= sbt2; y++) {
                        bok3 = bok3 + "0";
                    }

                    bsb1 = bsb2 = 255;
                    bsb4 = 0;
                    if (b == 16) {
                        bsb3 = 0;
                    }
                    if (b == 17) {
                        bsb3 = 128;
                    }
                    if (b == 18) {
                        bsb3 = 192;
                    }
                    if (b == 19) {
                        bsb3 = 224;
                    }
                    if (b == 20) {
                        bsb3 = 240;
                    }
                    if (b == 21) {
                        bsb3 = 248;
                    }
                    if (b == 22) {
                        bsb3 = 252;
                    }
                    if (b == 23) {
                        bsb3 = 254;
                    }

                    na.setText(ok1 + "." + ok2 + "." + 0 + "." + 0);


                    sb2 = b - 16;
                    sbt2 = 16 - sb2;
                    ox = Math.pow(2, sb2);
                    oy = Math.pow(2, sbt2) - 2;
                    bag = 256 - bsb3;

                }
                //C
                if (b >= 24 && b <= 30) {
                    sb3 = b - 24;
                    sbt3 = 8 - sb3;
                    bok1 = bok2 = bok3 = "11111111";
                    bok4 = "";

                    for (x = 1; x <= sb3; x++) {
                        bok4 = bok4 + "1";
                    }
                    for (y = 1; y <= sbt3; y++) {
                        bok4 = bok4 + "0";
                    }

                    bsb1 = bsb2 = bsb3 = 255;
                    if (b == 24) {
                        bsb4 = 0;
                    }
                    if (b == 25) {
                        bsb4 = 128;
                    }
                    if (b == 26) {
                        bsb4 = 192;
                    }
                    if (b == 27) {
                        bsb4 = 224;
                    }
                    if (b == 28) {
                        bsb4 = 240;
                    }
                    if (b == 29) {
                        bsb4 = 248;
                    }
                    if (b == 30) {
                        bsb4 = 252;
                    }

                    na.setText(ok1 + "." + ok2 + "." + ok3 + "." + 0);


                    sb3 = b - 24;
                    sbt3 = 8 - sb3;
                    ox = Math.pow(2, sb3);
                    oy = Math.pow(2, sbt3) - 2;
                    bag = 256 - bsb4;

                }
                sumabi.setText(bok1 + "." + bok2 + "." + bok3 + "." + bok4);
                suma.setText(bsb1 + "." + bsb2 + "." + bsb3 + "." + bsb4);
                js.setText(Double.toString(ox));
                jh.setText(Double.toString(oy));
                bs.setText(Double.toString(bag));

                //range ip awal akhir, broadcast address
                if (b == 8) {
                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ipaw + "." + 0 + "." + 1);
                    riakaw.setText(ok1 + "." + ipal + "." + 255 + "." + 254);
                    baw.setText(ok1 + "." + ipal + "." + 255 + "." + 255);
                }
                if (b == 9) {
                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ipaw + "." + 0 + "." + 1);
                    riakaw.setText(ok1 + "." + ipal + "." + 255 + "." + 254);
                    baw.setText(ok1 + "." + ipal + "." + 255 + "." + 255);
                    ipal = 2 * bag - 1;
                    ipaw = ipaw + bag;
                    riawak.setText(ok1 + "." + ipaw + "." + 0 + "." + 1);
                    riakak.setText(ok1 + "." + ipal + "." + 255 + "." + 254);
                    bak.setText(ok1 + "." + ipal + "." + 255 + "." + 255);
                }
                if (b == 10) {

                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ipaw + "." + 0 + "." + 1);
                    riakaw.setText(ok1 + "." + ipal + "." + 255 + "." + 254);
                    baw.setText(ok1 + "." + ipal + "." + 255 + "." + 255);
                    ipal = 4 * bag - 1;
                    ipaw = ipaw + bag;
                    ipaw = ipaw + bag;
                    ipaw = ipaw + bag;
                    riawak.setText(ok1 + "." + ipaw + "." + 0 + "." + 1);
                    riakak.setText(ok1 + "." + ipal + "." + 255 + "." + 254);
                    bak.setText(ok1 + "." + ipal + "." + 255 + "." + 255);
                }
                if (b == 11) {

                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ipaw + "." + 0 + "." + 1);
                    riakaw.setText(ok1 + "." + ipal + "." + 255 + "." + 254);
                    baw.setText(ok1 + "." + ipal + "." + 255 + "." + 255);
                    ipal = 8 * bag - 1;
                    ipaw = ipaw + bag;
                    ipaw = ipaw + bag;
                    ipaw = ipaw + bag;
                    ipaw = ipaw + bag;
                    riawak.setText(ok1 + "." + ipaw + "." + 0 + "." + 1);
                    riakak.setText(ok1 + "." + ipal + "." + 255 + "." + 254);
                    bak.setText(ok1 + "." + ipal + "." + 255 + "." + 255);

                }
                if (b == 12) {

                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ipaw + "." + 0 + "." + 1);
                    riakaw.setText(ok1 + "." + ipal + "." + 255 + "." + 254);
                    baw.setText(ok1 + "." + ipal + "." + 255 + "." + 255);
                    ipal = 16 * bag - 1;
                    for (x = 1; x <= 15; x++) {
                        ipaw = ipaw + bag;
                    }
                    riawak.setText(ok1 + "." + ipaw + "." + 0 + "." + 1);
                    riakak.setText(ok1 + "." + ipal + "." + 255 + "." + 254);
                    bak.setText(ok1 + "." + ipal + "." + 255 + "." + 255);
                }
                if (b == 13) {
                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ipaw + "." + 0 + "." + 1);
                    riakaw.setText(ok1 + "." + ipal + "." + 255 + "." + 254);
                    baw.setText(ok1 + "." + ipal + "." + 255 + "." + 255);
                    ipal = 32 * bag - 1;
                    for (x = 1; x <= 31; x++) {
                        ipaw = ipaw + bag;
                    }
                    riawak.setText(ok1 + "." + ipaw + "." + 0 + "." + 1);
                    riakak.setText(ok1 + "." + ipal + "." + 255 + "." + 254);
                    bak.setText(ok1 + "." + ipal + "." + 255 + "." + 255);
                }
                if (b == 14) {

                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ipaw + "." + 0 + "." + 1);
                    riakaw.setText(ok1 + "." + ipal + "." + 255 + "." + 254);
                    baw.setText(ok1 + "." + ipal + "." + 255 + "." + 255);
                    ipal = 64 * bag - 1;
                    for (x = 1; x <= 63; x++) {
                        ipaw = ipaw + bag;
                    }
                    riawak.setText(ok1 + "." + ipaw + "." + 0 + "." + 1);
                    riakak.setText(ok1 + "." + ipal + "." + 255 + "." + 254);
                    bak.setText(ok1 + "." + ipal + "." + 255 + "." + 255);
                }
                if (b == 15) {

                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ipaw + "." + 0 + "." + 1);
                    riakaw.setText(ok1 + "." + ipal + "." + 255 + "." + 254);
                    baw.setText(ok1 + "." + ipal + "." + 255 + "." + 255);
                    ipal = 128 * bag - 1;
                    for (x = 1; x <= 127; x++) {
                        ipaw = ipaw + bag;
                    }
                    riawak.setText(ok1 + "." + ipaw + "." + 0 + "." + 1);
                    riakak.setText(ok1 + "." + ipal + "." + 255 + "." + 254);
                    bak.setText(ok1 + "." + ipal + "." + 255 + "." + 255);
                }
                if (b == 16) {
                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ok2 + "." + ipaw + "." + 1);
                    riakaw.setText(ok1 + "." + ok2 + "." + ipal + "." + 254);
                    baw.setText(ok1 + "." + ok2 + "." + ipal + "." + 255);
                }
                if (b == 17) {

                    hobi = bag - 2;
                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ok2 + "." + ipaw + "." + 1);
                    riakaw.setText(ok1 + "." + ok2 + "." + ipal + "." + 254);
                    baw.setText(ok1 + "." + ok2 + "." + ipal + "." + 255);
                    ipal = 2 * bag - 1;
                    ipaw = ipaw + bag;
                    riawak.setText(ok1 + "." + ok2 + "." + ipaw + "." + 1);
                    riakak.setText(ok1 + "." + ok2 + "." + ipal + "." + 254);
                    bak.setText(ok1 + "." + ok2 + "." + ipal + "." + 255);
                }
                if (b == 18) {

                    hobi = bag - 2;
                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ok2 + "." + ipaw + "." + 1);
                    riakaw.setText(ok1 + "." + ok2 + "." + ipal + "." + 254);
                    baw.setText(ok1 + "." + ok2 + "." + ipal + "." + 255);
                    ipal = 4 * bag - 1;
                    ipaw = ipaw + bag;
                    ipaw = ipaw + bag;
                    ipaw = ipaw + bag;
                    riawak.setText(ok1 + "." + ok2 + "." + ipaw + "." + 1);
                    riakak.setText(ok1 + "." + ok2 + "." + ipal + "." + 254);
                    bak.setText(ok1 + "." + ok2 + "." + ipal + "." + 255);
                }
                if (b == 19) {

                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ok2 + "." + ipaw + "." + 1);
                    riakaw.setText(ok1 + "." + ok2 + "." + ipal + "." + 254);
                    baw.setText(ok1 + "." + ok2 + "." + ipal + "." + 255);
                    ipal = 8 * bag - 1;
                    ipaw = ipaw + bag;
                    ipaw = ipaw + bag;
                    ipaw = ipaw + bag;
                    ipaw = ipaw + bag;
                    riawak.setText(ok1 + "." + ok2 + "." + ipaw + "." + 1);
                    riakak.setText(ok1 + "." + ok2 + "." + ipal + "." + 254);
                    bak.setText(ok1 + "." + ok2 + "." + ipal + "." + 255);

                }
                if (b == 20) {

                    hobi = bag - 2;
                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ok2 + "." + ipaw + "." + 1);
                    riakaw.setText(ok1 + "." + ok2 + "." + ipal + "." + 254);
                    baw.setText(ok1 + "." + ok2 + "." + ipal + "." + 255);
                    ipal = 16 * bag - 1;
                    for (x = 1; x <= 15; x++) {
                        ipaw = ipaw + bag;
                    }
                    riawak.setText(ok1 + "." + ok2 + "." + ipaw + "." + 1);
                    riakak.setText(ok1 + "." + ok2 + "." + ipal + "." + 254);
                    bak.setText(ok1 + "." + ok2 + "." + ipal + "." + 255);
                }
                if (b == 21) {
                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ok2 + "." + ipaw + "." + 1);
                    riakaw.setText(ok1 + "." + ok2 + "." + ipal + "." + 254);
                    baw.setText(ok1 + "." + ok2 + "." + ipal + "." + 255);
                    ipal = 32 * bag - 1;
                    for (x = 1; x <= 31; x++) {
                        ipaw = ipaw + bag;
                    }
                    riawak.setText(ok1 + "." + ok2 + "." + ipaw + "." + 1);
                    riakak.setText(ok1 + "." + ok2 + "." + ipal + "." + 254);
                    bak.setText(ok1 + "." + ok2 + "." + ipal + "." + 255);
                }
                if (b == 22) {

                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ok2 + "." + ipaw + "." + 1);
                    riakaw.setText(ok1 + "." + ok2 + "." + ipal + "." + 254);
                    baw.setText(ok1 + "." + ok2 + "." + ipal + "." + 255);
                    ipal = 64 * bag - 1;
                    for (x = 1; x <= 63; x++) {
                        ipaw = ipaw + bag;
                    }
                    riawak.setText(ok1 + "." + ok2 + "." + ipaw + "." + 1);
                    riakak.setText(ok1 + "." + ok2 + "." + ipal + "." + 254);
                    bak.setText(ok1 + "." + ok2 + "." + ipal + "." + 255);
                }
                if (b == 23) {

                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ok2 + "." + ipaw + "." + 1);
                    riakaw.setText(ok1 + "." + ok2 + "." + ipal + "." + 254);
                    baw.setText(ok1 + "." + ok2 + "." + ipal + "." + 255);
                    ipal = 128 * bag - 1;
                    for (x = 1; x <= 127; x++) {
                        ipaw = ipaw + bag;
                    }
                    riawak.setText(ok1 + "." + ok2 + "." + ipaw + "." + 1);
                    riakak.setText(ok1 + "." + ok2 + "." + ipal + "." + 254);
                    bak.setText(ok1 + "." + ok2 + "." + ipal + "." + 255);
                }
                if (b == 24) {
                    hobi = bag - 2;
                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ok2 + "." + ok3 + "." + (ipaw + 1));
                    riakaw.setText(ok1 + "." + ok2 + "." + ok3 + "." + hobi);
                    baw.setText(ok1 + "." + ok2 + "." + ok3 + "." + ipal);
                }
                if (b == 25) {

                    hobi = bag - 2;
                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ok2 + "." + ok3 + "." + (ipaw + 1));
                    riakaw.setText(ok1 + "." + ok2 + "." + ok3 + "." + hobi);
                    baw.setText(ok1 + "." + ok2 + "." + ok3 + "." + ipal);
                    hobi = 2 * bag - 2;
                    ipal = 2 * bag - 1;
                    ipaw = ipaw + bag;
                    riawak.setText(ok1 + "." + ok2 + "." + ok3 + "." + (ipaw + 1));
                    riakak.setText(ok1 + "." + ok2 + "." + ok3 + "." + hobi);
                    bak.setText(ok1 + "." + ok2 + "." + ok3 + "." + ipal);
                }
                if (b == 26) {
                    hobi = bag - 2;
                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ok2 + "." + ok3 + "." + (ipaw + 1));
                    riakaw.setText(ok1 + "." + ok2 + "." + ok3 + "." + hobi);
                    baw.setText(ok1 + "." + ok2 + "." + ok3 + "." + ipal);
                    hobi = 4 * bag - 2;
                    ipal = 4 * bag - 1;
                    ipaw = ipaw + bag;
                    ipaw = ipaw + bag;
                    ipaw = ipaw + bag;
                    riawak.setText(ok1 + "." + ok2 + "." + ok3 + "." + (ipaw + 1));
                    riakak.setText(ok1 + "." + ok2 + "." + ok3 + "." + hobi);
                    bak.setText(ok1 + "." + ok2 + "." + ok3 + "." + ipal);
                }
                if (b == 27) {

                    hobi = bag - 2;
                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ok2 + "." + ok3 + "." + (ipaw + 1));
                    riakaw.setText(ok1 + "." + ok2 + "." + ok3 + "." + hobi);
                    baw.setText(ok1 + "." + ok2 + "." + ok3 + "." + ipal);
                    hobi = 8 * bag - 2;
                    ipal = 8 * bag - 1;
                    ipaw = ipaw + bag;
                    ipaw = ipaw + bag;
                    ipaw = ipaw + bag;
                    ipaw = ipaw + bag;
                    riawak.setText(ok1 + "." + ok2 + "." + ok3 + "." + (ipaw + 1));
                    riakak.setText(ok1 + "." + ok2 + "." + ok3 + "." + hobi);
                    bak.setText(ok1 + "." + ok2 + "." + ok3 + "." + ipal);

                }
                if (b == 28) {

                    hobi = bag - 2;
                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ok2 + "." + ok3 + "." + (ipaw + 1));
                    riakaw.setText(ok1 + "." + ok2 + "." + ok3 + "." + hobi);
                    baw.setText(ok1 + "." + ok2 + "." + ok3 + "." + ipal);
                    hobi = 16 * bag - 2;
                    ipal = 16 * bag - 1;
                    for (x = 1; x <= 15; x++) {
                        ipaw = ipaw + bag;
                    }
                    riawak.setText(ok1 + "." + ok2 + "." + ok3 + "." + (ipaw + 1));
                    riakak.setText(ok1 + "." + ok2 + "." + ok3 + "." + hobi);
                    bak.setText(ok1 + "." + ok2 + "." + ok3 + "." + ipal);
                }
                if (b == 29) {

                    hobi = bag - 2;
                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ok2 + "." + ok3 + "." + (ipaw + 1));
                    riakaw.setText(ok1 + "." + ok2 + "." + ok3 + "." + hobi);
                    baw.setText(ok1 + "." + ok2 + "." + ok3 + "." + ipal);
                    hobi = 32 * bag - 2;
                    ipal = 32 * bag - 1;
                    for (x = 1; x <= 31; x++) {
                        ipaw = ipaw + bag;
                    }
                    riawak.setText(ok1 + "." + ok2 + "." + ok3 + "." + (ipaw + 1));
                    riakak.setText(ok1 + "." + ok2 + "." + ok3 + "." + hobi);
                    bak.setText(ok1 + "." + ok2 + "." + ok3 + "." + ipal);
                }
                if (b == 30) {

                    hobi = bag - 2;
                    ipal = bag - 1;
                    ipaw = ipaw + 0;
                    riawal.setText(ok1 + "." + ok2 + "." + ok3 + "." + (ipaw + 1));
                    riakaw.setText(ok1 + "." + ok2 + "." + ok3 + "." + hobi);
                    baw.setText(ok1 + "." + ok2 + "." + ok3 + "." + ipal);
                    hobi = 64 * bag - 2;
                    ipal = 64 * bag - 1;
                    for (x = 1; x <= 63; x++) {
                        ipaw = ipaw + bag;
                    }
                    riawak.setText(ok1 + "." + ok2 + "." + ok3 + "." + (ipaw + 1));
                    riakak.setText(ok1 + "." + ok2 + "." + ok3 + "." + hobi);
                    bak.setText(ok1 + "." + ok2 + "." + ok3 + "." + ipal);

                }
            }
        }
        );
    }
}
