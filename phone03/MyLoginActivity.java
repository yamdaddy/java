package com.yamdaddy.phone03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_login);

        Button login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "로그인 성공, 일기장으로 이동합니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), MemoActivity.class);
                startActivity(intent);
            }


        });

        EditText idText = findViewById(R.id.idText);
        EditText pwText = findViewById(R.id.pwText);

        String id = idText.getText().toString();
        String pw = pwText.getText().toString();

        String oriId = "admin";
        String oriPw = "pass";

        if (id.equals(oriId) && pw.equals(oriPw)){
            Toast.makeText(getApplicationContext(), "로그인 성공, 메모장으로 이동합니다.", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(getApplicationContext(), "로그인 실패, 재 로그인 해주세요.", Toast.LENGTH_SHORT).show();

        }



    }
}
