package com.example.isuautosched;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class HamburgerMenu extends AppCompatActivity {

	public static void setOnClickListener(View.OnClickListener onClickListener) {

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hamburger_menu);
	}
}