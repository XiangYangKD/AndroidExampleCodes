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
	private RelativeLayout mainLayout;//��Բ��ֵ�������Ϊitem����
	private List<ContentModelMain> listMain;//���
	private ContentListviewAdapterMain adapterMain;//����

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
		
		listMain.add(new ContentModelMain(R.drawable.logo, "��е�����Զ�����һ��"));
		listMain.add(new ContentModelMain(R.drawable.logo, "��е�����Զ�����һ��"));
		listMain.add(new ContentModelMain(R.drawable.logo, "��е�����Զ�����һ��"));
		listMain.add(new ContentModelMain(R.drawable.logo, "��е�����Զ�����һ��"));
		listMain.add(new ContentModelMain(R.drawable.logo, "��е�����Զ�����һ��"));
	}

}
