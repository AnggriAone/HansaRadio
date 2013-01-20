package com.snakefreak.hansaradio;

import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import com.snakefreak.hansaradio.*;

public class impressum extends Activity {


	private Button siteButton1;
	private Button siteButton2;
	private Button phoneButton1;
	private Button phoneButton2;
	
	public static final String PREFS_NAME = "MyPrefsFile";

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.impressum);
		
		siteButton1 = (Button) findViewById(R.id.site_button1);
		siteButton2 = (Button) findViewById(R.id.site_button2);
		phoneButton1 = (Button) findViewById(R.id.phone_button1);
		phoneButton2 = (Button) findViewById(R.id.phone_button2);

		

		siteButton1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// Perform action on clicks, depending on whether it's now
				// checked
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(getString(R.string.info_url2)));
				startActivity(i);
			}
		});
		
		siteButton2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// Perform action on clicks, depending on whether it's now
				// checked
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(getString(R.string.info_url3)));
				startActivity(i);
			}
		});

		phoneButton1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// Perform action on clicks, depending on whether it's now
				// checked
				if (v == phoneButton1) {
					Intent i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse(getString(R.string.info_phone_no1)));
					startActivity(i);
				}
			}
		});
		
		phoneButton2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// Perform action on clicks, depending on whether it's now
				// checked
				if (v == phoneButton2) {
					Intent i = new Intent(Intent.ACTION_VIEW);
					i.setData(Uri.parse(getString(R.string.info_phone_no2)));
					startActivity(i);
				}
			}
		});

	}

}
