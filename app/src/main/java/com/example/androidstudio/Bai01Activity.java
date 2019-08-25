package com.example.androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bai01Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai01);

        final EditText edtLength = (EditText)findViewById(R.id.edtLength);
        final EditText edtWidth = (EditText)findViewById(R.id.edtWidth);
        Button btnResult = (Button)findViewById(R.id.btnResult);
        final TextView txtCV = (TextView)findViewById(R.id.txtCV);
        final TextView txtDT = (TextView)findViewById(R.id.txtDT);
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(edtWidth.getText().toString() == "" || edtLength.getText().toString() == ""){
                        Toast.makeText(Bai01Activity.this,"Not empty", Toast.LENGTH_SHORT).show();
                    }else{
                        double a = Double.parseDouble(edtLength.getText().toString());
                        double b = Double.parseDouble(edtWidth.getText().toString());

                        txtCV.setText("Chu vi: " + ((a+b)*2) + "");
                        txtDT.setText("Dien tich: "+a*b+"");
                    }
                }catch (Exception ex){
                    Toast.makeText(Bai01Activity.this,"Nhập lỗi" + ex.toString(), Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
