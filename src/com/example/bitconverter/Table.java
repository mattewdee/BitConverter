package com.example.bitconverter;

import java.util.StringTokenizer;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Table extends MainActivity {

    float numbit = 8;
    int kilo1024 = 1024;
    int kilo1000 = 1000;
    TextView bits;
    TextView bytes;
    TextView kilobits;
    TextView kilobyte;
    TextView megabits;
    TextView megabytes;
    TextView gigabits;
    TextView gigabytes;
    TextView terabytes;
    TextView petabytes;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table);
        bits = (TextView) findViewById(R.id.Wbits);
        bytes = (TextView) findViewById(R.id.Wbytes);
        kilobits = (TextView) findViewById(R.id.Wkilobits);
        kilobyte = (TextView) findViewById(R.id.Wkilobyte);
        megabits = (TextView) findViewById(R.id.Wmegabits);
        megabytes = (TextView) findViewById(R.id.Wmegabytes);
        gigabits = (TextView) findViewById(R.id.Wgigabits);
        gigabytes = (TextView) findViewById(R.id.Wgigabytes);
        terabytes = (TextView) findViewById(R.id.Wterabytes);
        petabytes = (TextView) findViewById(R.id.Wpetabytes);

        String s = getIntent().getStringExtra("tipologia");
        String how = getIntent().getStringExtra("howkilo");
        calcola(s, how);


    }


    public void calcola(String s, String how) {

        if (how.equals("kilo=1000")) {

            if (s.equals("bits")) {
                String input = getIntent().getStringExtra("input");
                bits.setText(input);
                float myNum = (Integer.parseInt(input)) * numbit;
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1000));
                kilobyte.setText(String.valueOf((myNum / 1000) / 8));
                megabits.setText(String.valueOf(((myNum / 1000) / 8) / 1000));
                megabytes.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 8));
                gigabits.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 1000));
                gigabytes.setText(String.valueOf(((((myNum / 1000) / 8) / 1000) / 1000) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 1000) / 8));


            } else if (s.equals("bytes")) {
                String input = getIntent().getStringExtra("input");
                bytes.setText(input);
                float myNum = (Integer.parseInt(input)) * numbit;
                bits.setText(String.valueOf(myNum));
                kilobits.setText(String.valueOf(myNum / 1000));
                kilobyte.setText(String.valueOf((myNum / 1000) / 8));
                megabits.setText(String.valueOf(((myNum / 1000) / 8) / 1000));
                megabytes.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 8));
                gigabits.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 1000));
                gigabytes.setText(String.valueOf(((((myNum / 1000) / 8) / 1000) / 1000) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 1000) / 8));

            } else if (s.equals("kilobits")) {
                String input = getIntent().getStringExtra("input");
                kilobits.setText(input);
                float myNum = Integer.parseInt(input) * 1000;
                bits.setText(String.valueOf(myNum));

                bytes.setText(String.valueOf((myNum / 8)));
                kilobyte.setText(String.valueOf((myNum / 1000) / 8));
                megabits.setText(String.valueOf(((myNum / 1000) / 8) / 1000));
                megabytes.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 8));
                gigabits.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 1000));
                gigabytes.setText(String.valueOf(((((myNum / 1000) / 8) / 1000) / 1000) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 1000) / 8));

            } else if (s.equals("kilobyte")) {
                String input = getIntent().getStringExtra("input");
                kilobyte.setText(input);
                float myNum = Integer.parseInt(input) * numbit * 1000;
                bits.setText(String.valueOf(myNum));
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1000));
                megabits.setText(String.valueOf(((myNum / 1000) / 8) / 1000));
                megabytes.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 8));
                gigabits.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 1000));
                gigabytes.setText(String.valueOf(((((myNum / 1000) / 8) / 1000) / 1000) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 1000) / 8));

            } else if (s.equals("megabits")) {
                String input = getIntent().getStringExtra("input");
                megabits.setText(input);
                float myNum = Integer.parseInt(input) * 1000 * 1000;
                bits.setText(String.valueOf(myNum));
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1000));
                kilobyte.setText(String.valueOf((myNum / 1000) / 8));
                megabytes.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 8));
                gigabits.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 1000));
                gigabytes.setText(String.valueOf(((((myNum / 1000) / 8) / 1000) / 1000) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 1000) / 8));

            } else if (s.equals("megabytes")) {
                String input = getIntent().getStringExtra("input");
                megabytes.setText(input);
                float myNum = Integer.parseInt(input) * numbit * 1000 * 1000;
                bits.setText(String.valueOf(myNum));
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1000));
                kilobyte.setText(String.valueOf((myNum / 1000) / 8));
                megabits.setText(String.valueOf(((myNum / 1000) / 8) / 1000));
                gigabits.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 1000));
                gigabytes.setText(String.valueOf(((((myNum / 1000) / 8) / 1000) / 1000) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 1000) / 8));

            } else if (s.equals("gigabits")) {
                String input = getIntent().getStringExtra("input");
                gigabits.setText(input);
                float myNum = Integer.parseInt(input) * numbit * 1000 * 1000 * 1000;
                bits.setText(String.valueOf(myNum));
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1000));
                kilobyte.setText(String.valueOf((myNum / 1000) / 8));
                megabits.setText(String.valueOf(((myNum / 1000) / 8) / 1000));
                megabytes.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 8));

                gigabytes.setText(String.valueOf(((((myNum / 1000) / 8) / 1000) / 1000) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 1000) / 8));

            } else if (s.equals("gigabytes")) {
                String input = getIntent().getStringExtra("input");
                gigabytes.setText(input);
                float myNum = Integer.parseInt(input) * numbit * 1000 * 1000 * 1000;
                bits.setText(String.valueOf(myNum));
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1000));
                kilobyte.setText(String.valueOf((myNum / 1000) / 8));
                megabits.setText(String.valueOf(((myNum / 1000) / 8) / 1000));
                megabytes.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 8));
                gigabits.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 1000));

                terabytes.setText(String.valueOf(((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 1000) / 8));

            } else if (s.equals("terabytes")) {
                String input = getIntent().getStringExtra("input");
                terabytes.setText(input);
                float myNum = Integer.parseInt(input) * numbit * 1000 * 1000 * 1000 * 1000;
                bits.setText(String.valueOf(myNum));
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1000));
                kilobyte.setText(String.valueOf((myNum / 1000) / 8));
                megabits.setText(String.valueOf(((myNum / 1000) / 8) / 1000));
                megabytes.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 8));
                gigabits.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 1000));
                gigabytes.setText(String.valueOf(((((myNum / 1000) / 8) / 1000) / 1000) / 8));

                petabytes.setText(String.valueOf((((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 1000) / 8));

            } else if (s.equals("petabytes")) {
                String input = getIntent().getStringExtra("input");
                petabytes.setText(input);
                float myNum = Integer.parseInt(input) * numbit * 1000 * 1000 * 1000 * 1000 * 1000;
                bits.setText(String.valueOf(myNum));
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1000));
                kilobyte.setText(String.valueOf((myNum / 1000) / 8));
                megabits.setText(String.valueOf(((myNum / 1000) / 8) / 1000));
                megabytes.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 8));
                gigabits.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 1000));
                gigabytes.setText(String.valueOf(((((myNum / 1000) / 8) / 1000) / 1000) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 8));

            }
        } else if (how.equals("kilo=1024")) {


            if (s.equals("bits")) {
                String input = getIntent().getStringExtra("input");
                bits.setText(input);
                float myNum = (Integer.parseInt(input)) * numbit;
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1000));
                kilobyte.setText(String.valueOf((myNum / 1000) / 8));
                megabits.setText(String.valueOf(((myNum / 1000) / 8) / 1000));
                megabytes.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 8));
                gigabits.setText(String.valueOf((((myNum / 1000) / 8) / 1000) / 1000));
                gigabytes.setText(String.valueOf(((((myNum / 1000) / 8) / 1000) / 1000) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1000) / 8) / 1000) / 1000) / 8) / 1000) / 1000) / 8));


            } else if (s.equals("bytes")) {
                String input = getIntent().getStringExtra("input");
                bytes.setText(input);
                float myNum = (Integer.parseInt(input)) * numbit;
                bits.setText(String.valueOf(myNum));
                kilobits.setText(String.valueOf(myNum / 1024));
                kilobyte.setText(String.valueOf((myNum / 1024) / 8));
                megabits.setText(String.valueOf(((myNum / 1024) / 8) / 1024));
                megabytes.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 8));
                gigabits.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 1024));
                gigabytes.setText(String.valueOf(((((myNum / 1024) / 8) / 1024) / 1024) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1024) / 8) / 1000) / 1024) / 8) / 1024) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1024) / 8) / 1024) / 1024) / 8) / 1024) / 1024) / 8));

            } else if (s.equals("kilobits")) {
                String input = getIntent().getStringExtra("input");
                kilobits.setText(input);
                float myNum = Integer.parseInt(input) * 1024;
                bits.setText(String.valueOf(myNum));

                bytes.setText(String.valueOf((myNum / 8)));
                kilobyte.setText(String.valueOf((myNum / 1024) / 8));
                megabits.setText(String.valueOf(((myNum / 1024) / 8) / 1024));
                megabytes.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 8));
                gigabits.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 1024));
                gigabytes.setText(String.valueOf(((((myNum / 1024) / 8) / 1024) / 1024) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1024) / 8) / 1024) / 1024) / 8) / 1024) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1024) / 8) / 1024) / 1024) / 8) / 1024) / 1024) / 8));

            } else if (s.equals("kilobyte")) {
                String input = getIntent().getStringExtra("input");
                kilobyte.setText(input);
                float myNum = Integer.parseInt(input) * numbit * 1024;
                bits.setText(String.valueOf(myNum));
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1024));
                megabits.setText(String.valueOf(((myNum / 1024) / 8) / 1024));
                megabytes.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 8));
                gigabits.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 1024));
                gigabytes.setText(String.valueOf(((((myNum / 1024) / 8) / 1024) / 1024) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1024) / 8) / 1024) / 1024) / 8) / 1024) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1024) / 8) / 1024) / 1024) / 8) / 1024) / 1024) / 8));

            } else if (s.equals("megabits")) {
                String input = getIntent().getStringExtra("input");
                megabits.setText(input);
                float myNum = Integer.parseInt(input) * 1024 * 1024;
                bits.setText(String.valueOf(myNum));
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1024));
                kilobyte.setText(String.valueOf((myNum / 1024) / 8));
                megabytes.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 8));
                gigabits.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 1024));
                gigabytes.setText(String.valueOf(((((myNum / 1024) / 8) / 1024) / 1024) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1024) / 8) / 1024) / 1024) / 8) / 1024) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1024) / 8) / 1024) / 1024) / 8) / 1024) / 1024) / 8));

            } else if (s.equals("megabytes")) {
                String input = getIntent().getStringExtra("input");
                megabytes.setText(input);
                float myNum = Integer.parseInt(input) * numbit * 1024 * 1024;
                bits.setText(String.valueOf(myNum));
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1024));
                kilobyte.setText(String.valueOf((myNum / 1024) / 8));
                megabits.setText(String.valueOf(((myNum / 1024) / 8) / 1024));
                gigabits.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 1024));
                gigabytes.setText(String.valueOf(((((myNum / 1024) / 8) / 1024) / 1024) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1024) / 8) / 1024) / 1024) / 8) / 1024) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1024) / 8) / 1024) / 1024) / 8) / 1024) / 1024) / 8));

            } else if (s.equals("gigabits")) {
                String input = getIntent().getStringExtra("input");
                gigabits.setText(input);
                float myNum = Integer.parseInt(input) * numbit * 1024 * 1024 * 1024;
                bits.setText(String.valueOf(myNum));
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1024));
                kilobyte.setText(String.valueOf((myNum / 1024) / 8));
                megabits.setText(String.valueOf(((myNum / 1024) / 8) / 1024));
                megabytes.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 8));
                gigabytes.setText(String.valueOf(((((myNum / 1024) / 8) / 1024) / 1024) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1024) / 8) / 1024) / 1024) / 8) / 1024) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1024) / 8) / 1024) / 1024) / 8) / 1024) / 1024) / 8));

            } else if (s.equals("gigabytes")) {
                String input = getIntent().getStringExtra("input");
                gigabytes.setText(input);
                float myNum = Integer.parseInt(input) * numbit * 1024 * 1024 * 1024;
                bits.setText(String.valueOf(myNum));
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1024));
                kilobyte.setText(String.valueOf((myNum / 1024) / 8));
                megabits.setText(String.valueOf(((myNum / 1024) / 8) / 1024));
                megabytes.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 8));
                gigabits.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 1024));
                terabytes.setText(String.valueOf(((((((myNum / 1024) / 8) / 1024) / 1024) / 8) / 1024) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1024) / 8) / 1024) / 1024) / 8) / 1024) / 1024) / 8));

            } else if (s.equals("terabytes")) {
                String input = getIntent().getStringExtra("input");
                terabytes.setText(input);
                float myNum = Integer.parseInt(input) * numbit * 1024 * 1024 * 1024 * 1024;
                bits.setText(String.valueOf(myNum));
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1024));
                kilobyte.setText(String.valueOf((myNum / 1024) / 8));
                megabits.setText(String.valueOf(((myNum / 1024) / 8) / 1024));
                megabytes.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 8));
                gigabits.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 1024));
                gigabytes.setText(String.valueOf(((((myNum / 1024) / 8) / 1024) / 1024) / 8));
                petabytes.setText(String.valueOf((((((((myNum / 1024) / 8) / 1024) / 1024) / 8) / 1024) / 1024) / 8));

            } else if (s.equals("petabytes")) {
                String input = getIntent().getStringExtra("input");
                petabytes.setText(input);
                float myNum = Integer.parseInt(input) * numbit * 1024 * 1024 * 1024 * 1024 * 1024;
                bits.setText(String.valueOf(myNum));
                bytes.setText(String.valueOf((myNum / 8)));
                kilobits.setText(String.valueOf(myNum / 1024));
                kilobyte.setText(String.valueOf((myNum / 1024) / 8));
                megabits.setText(String.valueOf(((myNum / 1024) / 8) / 1024));
                megabytes.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 8));
                gigabits.setText(String.valueOf((((myNum / 1024) / 8) / 1024) / 1024));
                gigabytes.setText(String.valueOf(((((myNum / 1024) / 8) / 1024) / 1024) / 8));
                terabytes.setText(String.valueOf(((((((myNum / 1024) / 8) / 1024) / 1024) / 8) / 1024) / 8));

            }


        }
    }


}	

		
		
		  
		
		
		
	
	
		
	
