package com.example.bitconverter;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.ClipData.Item;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
	String tipologia;
	String input;
	String howkilo;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ArrayList<String> tipo = new ArrayList<String>();
		tipo.add("bits");
		tipo.add("bytes");
		tipo.add("kilobits");
		tipo.add("kilobyte");
		tipo.add("megabits");
		tipo.add("megabytes");
		tipo.add("gigabits");
		tipo.add("gigabytes");
		tipo.add("terabytes");
		tipo.add("petabytes");
		
		ArrayList<String> scelta = new ArrayList<String>();
		scelta.add("kilo=1024");
		scelta.add("kilo=1000");

		Button calculate = (Button) findViewById(R.id.calculate);
		final EditText input1 = (EditText) findViewById(R.id.input);
		Spinner spinner1 = (Spinner) findViewById(R.id.type_spinner);
		Spinner spinner2=(Spinner)findViewById(R.id.choose_spinner);
		
		
		
		ArrayAdapter<String> adapterSpinner1 = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, tipo);

		adapterSpinner1.setDropDownViewResource(android.R.layout.simple_spinner_item);

		spinner1.setAdapter(adapterSpinner1);

		spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long id) {

				tipologia = arg0.getItemAtPosition(position).toString();

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {

			}
		});
		
		
		
		ArrayAdapter<String> adapterSpinner2 = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, scelta);

		adapterSpinner2.setDropDownViewResource(android.R.layout.simple_spinner_item);

		spinner2.setAdapter(adapterSpinner2);

		spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long id) {

				howkilo = arg0.getItemAtPosition(position).toString();

			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {

			}
		});
		
		
		calculate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				input =input1.getText().toString();
				Intent r = new Intent(MainActivity.this, Table.class);
				r.putExtra("howkilo", howkilo);
				r.putExtra("tipologia", tipologia); 
				r.putExtra("input", input);
				startActivity(r);

			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

}
