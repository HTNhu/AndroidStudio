package com.example.androidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai02Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai02);

        Button btnResult = (Button)findViewById(R.id.btnResult);
        final EditText edtYear = (EditText)findViewById(R.id.edtYear);
        final TextView tvAL = (TextView)findViewById(R.id.tvAL);


        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String al = "";

                int year = Integer.parseInt(edtYear.getText().toString());
                int first = year % 10;
                int last = year % 12;

                switch (first) {
                    case 0:
                        al = "Canh ";
                        break;
                    case 1:
                        al = "Tân ";
                        break;
                    case 2:
                        al = "Nhâm ";
                        break;
                    case 3:
                        al = "Qúy ";
                        break;
                    case 4:
                        al = "Giáp ";
                        break;
                    case 5:
                        al = "Ất ";
                        break;
                    case 6:
                        al = "Bính ";
                        break;
                    case 7:
                        al = "Đinh ";
                        break;
                    case 8:
                        al = "Mậu ";
                        break;
                    case 9:
                        al = "Kỷ ";
                        break;
                    default:
                        break;
                }
                switch (last) {
                    case 0:
                        al += "Thân";
                        break;
                    case 1:
                        al += "Dậu";
                        break;
                    case 2:
                        al += "Tuất";
                        break;
                    case 3:
                        al += "Hợi";
                        break;
                    case 4:
                        al += "Tý";
                        break;
                    case 5:
                        al += "Sửu";
                        break;
                    case 6:
                        al += "Dần";
                        break;
                    case 7:
                        al += "Mẹo";
                        break;
                    case 8:
                        al += "Thìn";
                        break;
                    case 9:
                        al += "Tỵ";
                        break;
                    case 10:
                        al += "Ngọ";
                        break;
                    case 11:
                        al += "Mùi";
                        break;
                    default:
                        break;

                }
                tvAL.setText("Năm: " +al );
            }
        });

    }
}
