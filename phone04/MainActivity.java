package com.yamdaddy.phone04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cal = findViewById(R.id.button1);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "계산기로 이동합니다", Toast.LENGTH_SHORT).show();
                Intent goCal = new Intent(getApplicationContext(), CalActivity.class);
                startActivity(goCal);

            }
        });

        Button login = findViewById(R.id.button2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "로그인 화면으로 이동합니다", Toast.LENGTH_SHORT).show();
                Intent goLogin = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(goLogin);

            }
        });

        Button success = findViewById(R.id.button3);
        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goOkay = new Intent(getApplicationContext(), OkayActivity.class);
                startActivity(goOkay);

            }
        });

        Button fail = findViewById(R.id.button4);
        fail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goFail = new Intent(getApplicationContext(), FailActivity.class);
                startActivity(goFail);

            }
        });


    }
}
