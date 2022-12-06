package com.example.isuautosched;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingScreen extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_landing_screen);

		Button createAccountButton = findViewById(R.id.createAccount);
		Button loginButton = findViewById(R.id.loginSelection);
		createAccountButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				// :O
				Intent i = new Intent(LandingScreen.this, CreateAccountScreen.class);
				startActivity(i);
				// >:O
			}
		});
		loginButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				// :(
				Intent i = new Intent(LandingScreen.this, LoginScreen.class);
				startActivity(i);
				// :'(
			}
		});
	}
}