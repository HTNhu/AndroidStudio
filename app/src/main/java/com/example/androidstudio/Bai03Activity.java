package com.example.androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bai03Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai03);

        final TextView tvResult = (TextView)findViewById(R.id.tvResult);
        final EditText edtSoA = (EditText)findViewById(R.id.edtSoA);
        final EditText edtSoB = (EditText)findViewById(R.id.edtSoB);
        Button btnResult = (Button)findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    double soA = Double.parseDouble(edtSoA.getText().toString());
                    double soB = Double.parseDouble(edtSoB.getText().toString());
                    double result = -soB/soA;
                    tvResult.setText( "x= "+ result);

            }
        });
    }
}
