package com.example.isuautosched;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.button.MaterialButton;

public class MainMenuScreen extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);

		ImageButton settingsButton = (ImageButton) findViewById(R.id.settingsButton);
		Button addFriendScreen = (Button) findViewById(R.id.addFriendButton);
		settingsButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(MainMenuScreen.this, SettingScreen.class);
				startActivity(i);
			}
		});
		addFriendScreen.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(MainMenuScreen.this, AddFriendScreen.class);
				startActivity(i);
			}
		});
		ImageButton HamburgerMenu = findViewById(R.id.hamburger);
		HamburgerMenu.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(MainMenuScreen.this, HamburgerMenu.class);
				startActivity(i);
			}
		});
		MaterialButton createConflict = (MaterialButton) findViewById(R.id.createConflictButton);
		createConflict.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(MainMenuScreen.this, CreateConflictScreen.class);
				startActivity(i);
			}
		});
		MaterialButton createGroup = (MaterialButton) findViewById(R.id.createGroupButton);
		createGroup.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent i = new Intent(MainMenuScreen.this, CreateGroup.class);
				startActivity(i);
			}
		});
	}
}