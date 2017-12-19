package com.example.panji.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by panji on 12/18/2017.
 */

public class loginActivity extends AppCompatActivity {
    private static final String UNAME = "admin";
    private static final String PWD = "password";

    private EditText username;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_form);

        Button btnlogin = (Button) findViewById(R.id.btnlogin);
        username = (EditText) findViewById(R.id.etUsername);


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u = username.getText().toString();
                Intent i = new Intent(loginActivity.this, MainActivity.class);
                i.putExtra("username", u);
                startActivity(i);
                finish();
        }
        });
    }
}
