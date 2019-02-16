package com.yamdaddy.phone04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OkayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okay);


        Button back1 = findViewById(R.id.back2);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "로그인 화면으로 이동합니다", Toast.LENGTH_SHORT).show();
                Intent backLogin = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(backLogin);

            }
        });
    }
}
