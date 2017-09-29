package com.listview.activity;


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.baseactivity_list_listview.R;
import com.listview.content.ContentListviewAdapterMain;
import com.listview.content.ContentModelMain;

public class MainActivity extends Activity{
	private RelativeLayout mainLayout;//相对布局的内容作为item内容
	private List<ContentModelMain> listMain;//左的
	private ContentListviewAdapterMain adapterMain;//数据

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mainLayout = (RelativeLayout) findViewById(R.id.main);
		ListView listmainLayout = (ListView) mainLayout.findViewById(R.id.main_listview);
		//listmainLayout.setDividerHeight(0);
		
		initData();
		adapterMain = new ContentListviewAdapterMain(this, listMain);
		listmainLayout.setAdapter(adapterMain);
	}

	private void initData() {
		listMain=new ArrayList<ContentModelMain>();		
		
		listMain.add(new ContentModelMain(R.drawable.logo, "机械及其自动化第一课"));
		listMain.add(new ContentModelMain(R.drawable.logo, "机械及其自动化第一课"));
		listMain.add(new ContentModelMain(R.drawable.logo, "机械及其自动化第一课"));
		listMain.add(new ContentModelMain(R.drawable.logo, "机械及其自动化第一课"));
		listMain.add(new ContentModelMain(R.drawable.logo, "机械及其自动化第一课"));
	}

}
