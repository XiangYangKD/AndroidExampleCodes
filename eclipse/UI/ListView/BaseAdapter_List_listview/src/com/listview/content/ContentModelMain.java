package com.listview.content;

public class ContentModelMain {

	private int imageView;
	private String text;
	
	public ContentModelMain(int imageView, String text) {
		super();
		this.imageView = imageView;
		this.text = text;
	}

	public int getImageView() {
		return imageView;
	}

	public void setImageView(int imageView) {
		this.imageView = imageView;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
