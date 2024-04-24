package ntu.mssv63134085.w9_vd1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChuyenManHinh(View v){
        Intent iManHinhKhac = new Intent(this, SubActivityOne.class);
        startActivity(iManHinhKhac);
    }
}