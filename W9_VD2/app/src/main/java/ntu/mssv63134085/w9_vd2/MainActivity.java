package ntu.mssv63134085.w9_vd2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void chuyenSangManHinhNhap(View v) {
        Intent iNhap = new Intent(this, InputActivity.class);
        startActivityForResult(iNhap, 8000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 8000)
            if ( resultCode == RESULT_OK) {
                // Lấy dữ liệu trả về theo key value
                String ten = data.getStringExtra("ten");
                String tuoi = data.getStringExtra("tuoi");
                // Đưa dữ liêu lên giao diện
                TextView tvTen = findViewById(R.id.tv_ten);
                TextView tvTuoi = findViewById(R.id.tv_namsinh);
                tvTen.setText(ten);
                tvTuoi.setText(tuoi);

            }
            else{
                Toast.makeText(this, "Trả về thất bại", Toast.LENGTH_SHORT).show();
            }
        else{
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}