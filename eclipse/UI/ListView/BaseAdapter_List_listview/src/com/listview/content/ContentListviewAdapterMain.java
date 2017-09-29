package com.listview.content;

import java.util.List;

import com.example.baseactivity_list_listview.*;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * ���ôӷ������õ����û���Ϣ
 * 
 * @author Administrator
 *
 */

public class ContentListviewAdapterMain extends BaseAdapter {

	private Context context;
	private List<ContentModelMain> list;
	
	public ContentListviewAdapterMain(Context context, List<ContentModelMain> list) {
		super();
		this.context = context;
		this.list = list;
	}

	@Override
	public int getCount() {
		if (list != null) {
			return list.size();
		}
		return 0;
	}

	@Override
	public Object getItem(int position) {
		if (list != null) {
			return list.get(position);
		}
		return null;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHold hold;
		if (convertView == null) {
			hold = new ViewHold();
			convertView = LayoutInflater.from(context).inflate(
					R.layout.mainlistview_content_item, null);
			convertView.setTag(hold);
		}else {
			hold=(ViewHold) convertView.getTag();
		}
		
		hold.imageView=(ImageView) convertView.findViewById(R.id.item_img_left);
		hold.textView=(TextView) convertView.findViewById(R.id.item_text_right);
		
		hold.imageView.setImageResource(list.get(position).getImageView());
		hold.textView.setText(list.get(position).getText());
		return convertView;
	}

	static class ViewHold {
		public ImageView imageView;
		public TextView textView;
	}

}
