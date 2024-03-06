package com.cuhoangdk.ex3_simplesumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Gắn Layout tương ứng với file này
        setContentView(R.layout.activity_main);
    }
    // Bộ lắng nghe và xử lý sự kiện click nút tính tổng
    public void XuLyCong(View view){
        //Tìm, tham chiếu đến điều khiển
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKQ);
        //Lấy dữ liệu về ở điều khiển số a, số b
        String strA= editTextSoA.getText().toString();
        String strB= editTextSoB.getText().toString();
        //Chuyễn dữ liệu sang số
        int so_A= Integer.parseInt(strA);
        int so_B= Integer.parseInt(strB);
        //tính tổng
        int tong = so_A + so_B;
        String strTong = String.valueOf(tong);
        //Hiển thị kết quả
        editTextKetQua.setText(strTong);
    }
}