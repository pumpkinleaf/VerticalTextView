package com.leaf.verticaltextview;

import com.leaf.verticaltextview.widget.VerticalTextView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	VerticalTextView verticalTextView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String text="一闪一闪亮晶晶\n好像无数小星星\n";
		
		verticalTextView = (VerticalTextView) findViewById(R.id.verticalTextView1);
		verticalTextView.setColumnSpacing(2);
		verticalTextView.setHeight(300);
		verticalTextView.setVerticalText(text, true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
