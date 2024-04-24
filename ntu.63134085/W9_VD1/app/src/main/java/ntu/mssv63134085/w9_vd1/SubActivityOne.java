package ntu.mssv63134085.w9_vd1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_one);
    }
    public void QuayVe(View v){
        Intent iManHinhChinh = new Intent(this, MainActivity.class);
        startActivity(iManHinhChinh);
    }
}