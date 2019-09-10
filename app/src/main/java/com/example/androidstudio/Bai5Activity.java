package com.example.androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai5Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);

        final EditText edtName = (EditText)findViewById(R.id.edtName);
        final TextView tvFirstName = (TextView)findViewById(R.id.tvFirstName);
        final TextView tvLastName = (TextView)findViewById(R.id.tvLastName);
        Button btnResult = (Button)findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullname = edtName.getText().toString();
                if(fullname.indexOf(' ') >0){
                    String FN = fullname.substring(0,fullname.indexOf(' ')).trim();
                    String LN = fullname.substring(fullname.lastIndexOf(' ')).trim();

                    tvFirstName.setText(FN);
                    tvLastName.setText(LN);
                }else{
                    tvFirstName.setText(fullname);
                    tvLastName.setText(fullname);
                }
            }
        });
    }
}
