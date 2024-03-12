package com.cuhoangdk.ex4_addsubmuldiv_onclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKetQua;
    Button nutCong,nutTru,nutNhan,nutChia;
    void TimDieuKhien(){
        editTextSo1 = (EditText) findViewById(R.id.edtSo1);
        editTextSo2 = (EditText) findViewById(R.id.edtSo2);
        editTextKetQua = (EditText) findViewById(R.id.edtKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }
    public void XuLyCong(View v){
        //Lấy dữ liệu
        try {
            String soThu1 = editTextSo1.getText().toString();
            String soThu2 = editTextSo2.getText().toString();
            float soA = Float.parseFloat(soThu1);
            float soB = Float.parseFloat(soThu2);
            //tính toán
            float tong = soA + soB;
            //Hiện kết quả

            String ketQua = String.valueOf(tong);
            editTextKetQua.setText(ketQua);
        }
        catch (NumberFormatException e)
        {
            Toast.makeText(this, "Vui lòng nhập số hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
    public void XuLyTru(View v){
        try {
            String soThu1 = editTextSo1.getText().toString();
            String soThu2 = editTextSo2.getText().toString();
            float soA = Float.parseFloat(soThu1);
            float soB = Float.parseFloat(soThu2);
            //tính toán
            float hieu = soA - soB;
            //Hiện kết quả

            String ketQua = String.valueOf(hieu);
            editTextKetQua.setText(ketQua);
        }
        catch (NumberFormatException e)
        {
            Toast.makeText(this, "Vui lòng nhập số hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
    public void XuLyNhan(View v){
        try {
            String soThu1 = editTextSo1.getText().toString();
            String soThu2 = editTextSo2.getText().toString();
            float soA = Float.parseFloat(soThu1);
            float soB = Float.parseFloat(soThu2);
            //tính toán
            float tich = soA * soB;
            //Hiện kết quả

            String ketQua = String.valueOf(tich);
            editTextKetQua.setText(ketQua);
        }
        catch (NumberFormatException e)
        {
            Toast.makeText(this, "Vui lòng nhập số hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
    public void XuLyChia(View v){
//Lấy dữ liệu

        try {
            String soThu1 = editTextSo1.getText().toString();
            String soThu2 = editTextSo2.getText().toString();
            float soA = Float.parseFloat(soThu1);
            float soB = Float.parseFloat(soThu2);
            //tính toán
            float thuong = soA * soB;
            //Hiện kết quả

            String ketQua = String.valueOf(thuong);
            editTextKetQua.setText(ketQua);
        }
        catch (NumberFormatException e)
        {
            Toast.makeText(this, "Vui lòng nhập số hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
}