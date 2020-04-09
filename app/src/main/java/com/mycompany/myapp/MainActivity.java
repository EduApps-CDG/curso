package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.util.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choser);
		
		Button e1 = findViewById(R.id.E1);
		Button e2 = findViewById(R.id.E2);
		
		e1.setOnClickListener(new View.OnClickListener() {
			@Override public void onClick(View p1) {
				Intent i = new Intent(p1.getContext(),Exercicio1Activity.class);
				startActivity(i);
			}
		});
		
		e2.setOnClickListener(new View.OnClickListener() {
			@Override public void onClick(View p1) {
				Intent i = new Intent(p1.getContext(),Exercicio2Activity.class);
				startActivity(i);
			}
		});
    }
}
