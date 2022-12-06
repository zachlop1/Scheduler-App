package com.example.isuautosched;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.JsonReader;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.StringReader;

public class AddFriendScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_friend_screen);

        RequestQueue queue = Volley.newRequestQueue(this);

        StringRequest request = new StringRequest(Request.Method.GET, Constants.BASE_URL+"user/getAllData",
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        System.out.println(response);
                        TextView userList = (TextView) findViewById(R.id.userList);
                        Gson gson = new Gson();
                        User[] users = gson.fromJson(response, User[].class);
                        String userListString = ""; // I'm sorry god
                        for (User user : users) {
                            userListString = userListString.concat("\n" + user.name);
                        }
                        System.out.println(userListString);
                        userList.setText(userListString);
                    }
                },
                new Response.ErrorListener() {
                    @SuppressLint("SetTextI18n")
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                });

        // Add the request to the queue
        queue.add(request);

    }
}
