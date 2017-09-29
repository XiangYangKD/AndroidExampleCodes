package com.test.customTitle;

import com.example.title.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends Activity{
	private TextView Titletext;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setTheme(R.style.CustomTheme);//设置自定义的style作为Title
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_main);
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title_main);
		Titletext = (TextView) findViewById(R.id.Titletext);
		Titletext.setText("全部课程");
	}

}
