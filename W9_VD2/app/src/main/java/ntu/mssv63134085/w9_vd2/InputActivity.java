package ntu.mssv63134085.w9_vd2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
    }
    public void guiDuLieuVe(View v) {
        EditText etTen = findViewById(R.id.et_ten);
        EditText etTuoi = findViewById(R.id.et_namsinh);
        // Lấy dữ liệu
        String ten = etTen.getText().toString();
        String tuoi = etTuoi.getText().toString();
        // Tạo intent
        Intent iGui = new Intent();
        // Đưa dữ liệu vào intent theo dạng key - value
        iGui.putExtra("ten", ten);
        iGui.putExtra("tuoi", tuoi);
        // Gửi kết quả cho activity đã gọi nó
        setResult(RESULT_OK, iGui);
        finish();

    }
}