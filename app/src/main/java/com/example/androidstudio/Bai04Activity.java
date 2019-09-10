package com.example.androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai04Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai04);
        final EditText edtInput = (EditText)findViewById(R.id.edtInput);
        Button btnResult = (Button)findViewById(R.id.btnResult);
        final TextView tvResult= (TextView)findViewById(R.id.tvResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi = "";
                int n = Integer.parseInt(edtInput.getText().toString());
                for (int i = 1; i<=10; i++){
                    chuoi += n + "*" + i + "=" + n*i +"\n";
                }
                tvResult.setText("Bảng cửu chương: " + "\n" + chuoi);
            }
        });
    }
}
