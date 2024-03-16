package com.cuhoangdk.ex6_addsubmuldiv_var;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Khai báo các đối tượng với các điều khiển cần thao tác

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Tìm các điều khiển
        TimView();
        btnCong.setOnClickListener(boLangNghe_XuLyCong);
        btnTru.setOnClickListener(boLangNghe_XuLyTru);
        btnNhan.setOnClickListener(boLangNghe_XuLyNhan);
        btnChia.setOnClickListener(boLangNghe_XuLyChia);
    }

    View.OnClickListener boLangNghe_XuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = editSoA.getText().toString();
            String strSo2 = editSoB.getText().toString();
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            double tong = soA +soB;
            String strKQ = String.valueOf(tong);
            tvKetQua.setText(strKQ);
        }
    };
    View.OnClickListener boLangNghe_XuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = editSoA.getText().toString();
            String strSo2 = editSoB.getText().toString();
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            double hieu = soA -soB;
            String strKQ = String.valueOf(hieu);
            tvKetQua.setText(strKQ);
        }
    };
    View.OnClickListener boLangNghe_XuLyNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = editSoA.getText().toString();
            String strSo2 = editSoB.getText().toString();
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            double tich = soA *soB;
            String strKQ = String.valueOf(tich);
            tvKetQua.setText(strKQ);
        }
    };
    View.OnClickListener boLangNghe_XuLyChia = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = editSoA.getText().toString();
            String strSo2 = editSoB.getText().toString();
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            double tong = soA /soB;
            String strKQ = String.valueOf(tong);
            tvKetQua.setText(strKQ);
        }
    };
    void TimView()
    {
        editSoA = (EditText) findViewById(R.id.edtSo1);
        editSoB = (EditText) findViewById(R.id.edtSo2);
        btnCong = (Button) findViewById(R.id.btnCong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);
        tvKetQua = (TextView) findViewById(R.id.edtKetQua);
    }
    EditText editSoA;
    EditText editSoB;
    Button btnCong, btnTru, btnNhan, btnChia;
    TextView tvKetQua;
}