package com.yamdaddy.phone04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button back = findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Main 화면으로 이동합니다", Toast.LENGTH_SHORT).show();
                Intent backMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(backMain);

            }
        });

        Button login = findViewById(R.id.loginButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String orgId = "admin";
                String orgPw = "1234";

                EditText inputId = findViewById(R.id.inputId);
                EditText inputPw = findViewById(R.id.inputPw);

                String id = inputId.getText().toString();
                String pw = inputPw.getText().toString();

                if (id.equals(orgId) && pw.equals(orgPw)){
                    Intent go = new Intent(getApplicationContext(), OkayActivity.class);
                    startActivity(go);
                }else{
                    Intent go = new Intent(getApplicationContext(), FailActivity.class);
                    startActivity(go);
                }






            }
        });




    }
}
