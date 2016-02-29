package com.example.listdemo;


import com.koushikdutta.urlimageviewhelper.UrlImageViewHelper;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DataFromList extends Activity {
	TextView tv1=null, tv2=null, tv3=null;
	ImageView appIcon = null;
	String name,gmail,mobile;
	
	AlertDialogManager alert = new AlertDialogManager();
	ConnectionDetector cd;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.datafromlist);
	
		ConnectionDetector cd;
		
		cd = new ConnectionDetector(getApplicationContext());
		
		
			if (!cd.isConnectingToInternet()) {
				
				alert.showAlertDialog(DataFromList.this,
						"Internet Connection Error",
						"Please connect to working Internet connection", false);
				
				return;
				}
			
	
		Intent update = getIntent();
		try {
			// gets the previously created intent
			name = update.getStringExtra("name") + "";
			gmail=update.getStringExtra("email") + "";
			mobile = update.getStringExtra("mobile") + "";
			
			
			
		    
		} catch (Exception E) {
		}

		tv1 = (TextView) findViewById(R.id.txtname);
		tv2 = (TextView) findViewById(R.id.txtemail);
		tv3 = (TextView) findViewById(R.id.txtmobile);
		tv1.setText(name);
		tv2.setText(email);
		tv3.setText(mobile);
		
		
	}
}
