package com.yamdaddy.phone04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        Button back = findViewById(R.id.backMain);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "초기화면으로 돌아갑니다", Toast.LENGTH_SHORT).show();
                Intent backToMain = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(backToMain);
            }
        });

        Button plus = findViewById(R.id.sum);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "값을 계산합니다", Toast.LENGTH_SHORT).show();

                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);

                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                // 문자열(String) -> 정수로 변경(Integer) -> 너무 많이 써서 부품이 있음(복사 불필요)

                int i1 =  Integer.parseInt(n1);
                int i2 =  Integer.parseInt(n2);

                int total = i1 + i2;

                Toast.makeText(getApplicationContext(), "두 수의 합은: " + total, Toast.LENGTH_LONG).show();
                TextView result = findViewById(R.id.result);
                result.setText("두 수의 합은: " + total);
            }
        });

        Button minus = findViewById(R.id.min);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText num1 = findViewById(R.id.num1);
                EditText num2 = findViewById(R.id.num2);

                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                // 문자열(String) -> 정수로 변경(Integer) -> 너무 많이 써서 부품이 있음(복사 불필요)

                int i1 =  Integer.parseInt(n1);
                int i2 =  Integer.parseInt(n2);

                int total = i1 - i2;

                Toast.makeText(getApplicationContext(), "두 수의 차는: " + total, Toast.LENGTH_LONG).show();

                TextView result = findViewById(R.id.result);
                result.setText("두 수의 차는: " + total);
            }
        });

    }
}
