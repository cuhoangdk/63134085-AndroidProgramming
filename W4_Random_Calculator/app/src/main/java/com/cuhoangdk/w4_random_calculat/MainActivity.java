package com.cuhoangdk.w4_random_calculat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText edtSo1;
    EditText edtSo2;
    EditText edtKQ;
    Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getControls();
    }
    public void getControls(){
        edtSo1 = (EditText) findViewById(R.id.edtso1);
        edtSo2 = (EditText) findViewById(R.id.edtso2);
        edtKQ = (EditText) findViewById(R.id.edtkq);
    }
    public void cong(View v){
        try {
            double so1 = Double.parseDouble(edtSo1.getText().toString());
            double so2 = Double.parseDouble(edtSo2.getText().toString());
            double kq = so1 + so2;
            edtKQ.setText(String.valueOf(kq));
        }
        catch (NumberFormatException e)
        {
            Toast.makeText(this, "Vui lòng nhập dữ liệu", Toast.LENGTH_SHORT).show();
        }
    }
    public void tru(View v){
        try {
            double so1 = Double.parseDouble(edtSo1.getText().toString());
            double so2 = Double.parseDouble(edtSo2.getText().toString());
            double kq = so1 - so2;
            edtKQ.setText(String.valueOf(kq));
        }
        catch (NumberFormatException e)
        {
            Toast.makeText(this, "Vui lòng nhập dữ liệu", Toast.LENGTH_SHORT).show();
        }
    }
    public void nhan(View v){
        try {
            double so1 = Double.parseDouble(edtSo1.getText().toString());
            double so2 = Double.parseDouble(edtSo2.getText().toString());
            double kq = so1 *so2;
            edtKQ.setText(String.valueOf(kq));
        }
        catch (NumberFormatException e)
        {
            Toast.makeText(this, "Vui lòng nhập dữ liệu", Toast.LENGTH_SHORT).show();
        }
    }
    public void chia(View v){
        try {
            double so1 = Double.parseDouble(edtSo1.getText().toString());
            double so2 = Double.parseDouble(edtSo2.getText().toString());
            double kq = so1 / so2;
            edtKQ.setText(String.valueOf(kq));
        }
        catch (NumberFormatException e)
        {
            Toast.makeText(this, "Vui lòng nhập dữ liệu", Toast.LENGTH_SHORT).show();
        }
    }
    public void random(View v){
        double so1 = (double) random.nextInt(10);
        double so2 = (double) random.nextInt(10);
        edtSo1.setText(String.valueOf(so1));
        edtSo2.setText(String.valueOf(so2));
    }
}